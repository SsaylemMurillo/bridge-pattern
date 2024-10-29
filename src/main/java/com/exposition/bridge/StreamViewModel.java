package com.exposition.bridge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StreamViewModel extends BaseViewModel {

    private String stream;
    private String status;
    private int viewers;
    private LocalDateTime startTime;
    private String length;

    public StreamViewModel(String id, String type, String title, String miniature, String stream, String status, int viewers, String startTime, String length) {
        super(id, type, title, miniature);
        this.stream = stream;
        this.status = status;
        this.viewers = viewers;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.startTime = LocalDateTime.parse(startTime, formatter);
        this.length = length;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "StreamViewModel{"
                + super.toString()
                + ", stream='" + stream + '\''
                + ", status='" + status + '\''
                + ", viewers=" + viewers
                + ", startTime=" + (startTime != null ? startTime.format(formatter) : "null")
                + ", length='" + length + '\''
                + '}';
    }
}
