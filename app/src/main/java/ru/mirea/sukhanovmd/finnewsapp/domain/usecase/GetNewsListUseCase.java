package ru.mirea.sukhanovmd.finnewsapp.domain.usecase;

import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.News;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.NewsRepository;

public class GetNewsListUseCase {
    private final NewsRepository newsRepository;

    public GetNewsListUseCase(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> execute() {
        return newsRepository.getNewsList();
    }
}