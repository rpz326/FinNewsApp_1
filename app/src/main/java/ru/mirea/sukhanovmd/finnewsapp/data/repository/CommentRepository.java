package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.Comment;

public interface CommentRepository {
    List<Comment> getComments(int newsId);
    void addComment(int newsId, String email, String text);
}
