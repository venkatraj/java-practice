package com.venkatraj;

public class Song {
    private String title;
    private long duration;

    public Song(String title, long duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.getTitle() + ": " + this.getDuration();
    }
}
