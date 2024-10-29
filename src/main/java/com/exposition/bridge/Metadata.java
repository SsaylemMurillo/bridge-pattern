// Metadata.java
package com.exposition.bridge;

public class Metadata {

    private String title;
    private String miniature;

    public Metadata(String title, String miniature) {
        this.title = title;
        this.miniature = miniature;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMiniature() {
        return miniature;
    }

    public void setMiniature(String miniature) {
        this.miniature = miniature;
    }
}
