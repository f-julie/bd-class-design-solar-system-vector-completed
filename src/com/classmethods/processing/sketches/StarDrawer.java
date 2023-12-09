package com.classmethods.processing.sketches;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;
import java.util.List;

public class StarDrawer {
    PApplet p = Main.applet;

    List<PVector> stars;

    public StarDrawer() {
        stars = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            stars.add(new PVector(p.random(p.width), p.random(p.height), p.random(1,4)));
        }
    }

    public void drawStars() {
        p.fill(0,0,255);
        for (PVector star : stars) {
            p.ellipse(star.x, star.y, star.z, star.z);
        }
    }
}