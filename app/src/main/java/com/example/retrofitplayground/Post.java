package com.example.retrofitplayground;

public class Post {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String toString() {
        return "UserId: " + userId +
                "\nId: " + id +
                "\nTitle: " + title +
                "\nBody: " + body;
    }
}
