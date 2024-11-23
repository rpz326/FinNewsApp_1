package ru.mirea.sukhanovmd.finnewsapp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

import ru.mirea.sukhanovmd.finnewsapp.data.model.Comment;
import ru.mirea.sukhanovmd.finnewsapp.data.model.CurrencyRate;
import ru.mirea.sukhanovmd.finnewsapp.data.model.News;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CommentRepository;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CommentRepositoryImplementation;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CurrencyRepository;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CurrencyRepositoryImplementation;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.NewsRepository;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.NewsRepositoryImplementation;
import ru.mirea.sukhanovmd.finnewsapp.domain.usecase.GetCommentsUseCase;
import ru.mirea.sukhanovmd.finnewsapp.domain.usecase.GetCurrencyRateUseCase;
import ru.mirea.sukhanovmd.finnewsapp.domain.usecase.GetNewsListUseCase;

public class UseCaseTests {

    private final NewsRepository newsRepository = new NewsRepositoryImplementation();
    private final CurrencyRepository currencyRepository = new CurrencyRepositoryImplementation();
    private final CommentRepository commentRepository = new CommentRepositoryImplementation();

    //новости
    @Test
    public void testGetNewsList() {
        GetNewsListUseCase newsUseCase = new GetNewsListUseCase(newsRepository);
        List<News> newsList = newsUseCase.execute();

        assertEquals(3, newsList.size());

        assertEquals(1, newsList.get(0).getId());
        assertEquals("Заголовок новости 1", newsList.get(0).getTitle());
        assertEquals("Полный текст новости 1", newsList.get(0).getContent());
        assertEquals("https://example.com/image1.jpg", newsList.get(0).getImageUrl());

        assertEquals(2, newsList.get(1).getId());
        assertEquals("Заголовок новости 2", newsList.get(1).getTitle());
        assertEquals("Полный текст новости 2", newsList.get(1).getContent());
        assertEquals("https://example.com/image2.jpg", newsList.get(1).getImageUrl());
    }

    //курс
    @Test
    public void testGetCurrencyRate() {
        GetCurrencyRateUseCase currencyUseCase = new GetCurrencyRateUseCase(currencyRepository);
        CurrencyRate rate = currencyUseCase.execute();

        assertEquals("USD", rate.getCurrency1());
        assertEquals(100.0, rate.getRate1(), 0.01);
        assertEquals("EUR", rate.getCurrency2());
        assertEquals(105.0, rate.getRate2(), 0.01);
    }

    //комменты
    @Test
    public void testGetComments() {
        GetCommentsUseCase commentsUseCase = new GetCommentsUseCase(commentRepository);
        List<Comment> comments = commentsUseCase.execute(1); // Используем id новости = 1

        assertEquals(2, comments.size());
        assertEquals("rapzer@example.com", comments.get(0).getEmail());
        assertEquals("2024-09-01", comments.get(0).getDate());
        assertEquals("Привет!", comments.get(0).getText());

        assertEquals("vasya@example.com", comments.get(1).getEmail());
        assertEquals("2024-09-01", comments.get(1).getDate());
        assertEquals("Тестовый коммент", comments.get(1).getText());
    }
}
