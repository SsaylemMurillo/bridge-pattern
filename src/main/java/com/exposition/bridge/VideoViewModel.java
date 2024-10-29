package com.exposition.bridge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VideoViewModel extends BaseViewModel {

    private String video;
    private String length;
    private LocalDateTime uploadDate;

    public VideoViewModel(String id, String type, String title, String miniature, String video, String length, String uploadDate) {
        super(id, type, title, miniature);
        this.video = video;
        this.length = length;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.uploadDate = LocalDateTime.parse(uploadDate, formatter);
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "VideoViewModel{"
                + super.toString()
                + ", video='" + video + '\''
                + ", length='" + length + '\''
                + ", uploadDate=" + (uploadDate != null ? uploadDate.format(formatter) : "null")
                + '}';
    }

}
