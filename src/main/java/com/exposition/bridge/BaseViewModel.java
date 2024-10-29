package com.exposition.bridge;

public class BaseViewModel implements IViewModel {

    private String id;
    private String type;
    private String title;
    private String miniature;

    public BaseViewModel(String id, String type, String title, String miniature) {
        super();
        this.id = id;
        this.type = type;
        this.title = title;
        this.miniature = miniature;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getMiniature() {
        return miniature;
    }

    @Override
    public void setMiniature(String miniature) {
        this.miniature = miniature;
    }

    @Override
    public String toString() {
        return "id=" + id + ", type=" + type + ", title=" + title + ", miniature=" + miniature;
    }

}
