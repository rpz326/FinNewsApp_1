package ru.mirea.sukhanovmd.finnewsapp.data.model;

public class News {
    private int id;
    private String title;
    private String content;
    private String imageUrl;

    public News(int id, String title, String content, String imageUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}