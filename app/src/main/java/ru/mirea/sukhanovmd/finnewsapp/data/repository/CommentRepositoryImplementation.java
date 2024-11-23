package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import java.util.ArrayList;
import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.Comment;

public class CommentRepositoryImplementation implements CommentRepository {

    @Override
    public List<Comment> getComments(int newsId) {
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("rapzer@example.com", "2024-09-01", "Привет!"));
        comments.add(new Comment("vasya@example.com", "2024-09-01", "Тестовый коммент"));
        return comments;
    }

    @Override
    public void addComment(int newsId, String email, String text) {
        // добавляем комментарий
    }
}