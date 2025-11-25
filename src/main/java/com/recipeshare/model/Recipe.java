package com.recipeshare.model;

import java.time.LocalDateTime;

public class Recipe {
    private int id;
    private int userId;
    private String title;
    private String ingredients;
    private String instructions;
    private String imagePath;
    private LocalDateTime createdAt;

    public Recipe() {}

    public Recipe(int userId, String title, String ingredients, String instructions, String imagePath) {
        this.userId = userId; this.title = title; this.ingredients = ingredients; this.instructions = instructions; this.imagePath = imagePath;
        this.createdAt = LocalDateTime.now();
    }

    // getters & setters...
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Recipe{" + "id=" + id + ", userId=" + userId + ", title='" + title + '\'' + '}';
    }
}
