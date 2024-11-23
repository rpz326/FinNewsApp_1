package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import java.util.ArrayList;
import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.News;

public class NewsRepositoryImplementation implements NewsRepository {

    @Override
    public List<News> getNewsList() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(1, "Заголовок новости 1", "Полный текст новости 1", "https://example.com/image1.jpg"));
        newsList.add(new News(2, "Заголовок новости 2", "Полный текст новости 2", "https://example.com/image2.jpg"));
        newsList.add(new News(3, "Заголовок новости 3", "Полный текст новости 3", "https://example.com/image3.jpg"));
        return newsList;
    }

    @Override
    public News getNewsDetail(int newsId) {
        return new News(newsId, "Заголовок новости " + newsId, "Полный текст новости " + newsId, "https://example.com/image" + newsId + ".jpg");
    }

    @Override
    public void addLike(int newsId) {
        // добавляем лайк
    }

    @Override
    public void addComment(int newsId, String commentText) {
        // добавляем коммент
    }
}
