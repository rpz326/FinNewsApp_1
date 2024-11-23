package ru.mirea.sukhanovmd.finnewsapp.domain.usecase;

import java.util.List;
import ru.mirea.sukhanovmd.finnewsapp.data.model.Comment;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CommentRepository;

public class GetCommentsUseCase {
    private final CommentRepository commentRepository;

    public GetCommentsUseCase(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> execute(int newsId) {
        return commentRepository.getComments(newsId);
    }
}