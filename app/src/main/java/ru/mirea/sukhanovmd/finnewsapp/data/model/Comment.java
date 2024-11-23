package ru.mirea.sukhanovmd.finnewsapp.data.model;

public class Comment {
    private String email;
    private String date;
    private String text;

    public Comment(String email, String date, String text) {
        this.email = email;
        this.date = date;
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
}