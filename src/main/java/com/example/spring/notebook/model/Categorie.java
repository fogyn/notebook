package com.example.spring.notebook.model;

public class Categorie {
    private int categoryID;
    private String categorieName;
    private String description;

    public int getId() {
        return categoryID;
    }

    public void setId(int id) {
        this.categoryID = id;
    }

    public String getCategorieName() {
        return categorieName;
    }

    public void setCategorieName(String categorieName) {
        this.categorieName = categorieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
