package com.noobsmoke;

import com.noobsmoke.examples.VideoGameBox;


public class Main {


    static void main(String[] args) {
        VideoGameBox gearsOfWar = new VideoGameBox();
        VideoGameBox godOfWar = new VideoGameBox("God of War");
        VideoGameBox mgs = new VideoGameBox("Metal Gear Solid", 'M', "You infiltrate Shadow " +
                "Moses to find the Metal Gear robots", false);

        gearsOfWar.createBox();
        godOfWar.createBox();
        mgs.createBox();

    }
}
