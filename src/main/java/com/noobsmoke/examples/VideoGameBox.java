package com.noobsmoke.examples;

import java.time.LocalDateTime;

public class VideoGameBox {

    public String title;
    public char rating;
    public String summary;
    public boolean isMultiplayer;

   public VideoGameBox() {

   }


   public VideoGameBox(String title) {
       this.title = title;
   }

   public VideoGameBox(char rating) {
       this.rating = rating;
   }

   public VideoGameBox(String gameTitle, char rating, String summary, boolean isMultiplayer) {
       this.title = gameTitle;
       this.rating = rating;
       this.summary = summary;
       this.isMultiplayer = isMultiplayer;
   }

   public void createBox() {
       if (this.title == null) return;
       System.out.println("Box for " + this.title + " Has been created on " + LocalDateTime.now());
   }


    @Override
    public String toString() {
        return "VideoGameBox{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", summary='" + summary + '\'' +
                ", isMultiplayer=" + isMultiplayer +
                '}';
    }

}

