package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.News;

public interface NewsRepository {
    List<News> getNewsList();
    News getNewsDetail(int newsId);
    void addLike(int newsId);
    void addComment(int newsId, String commentText);
}
