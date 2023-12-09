package com.classmethods.processing.sketches;

import math.Vector;
import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet applet;
    StarDrawer starDrawer;

    public void settings() {
        applet = this;
        size(600, 600);
    }

    public void setup() {
        starDrawer = new StarDrawer();

        colorMode(HSB);
        noStroke();
    }

    public void draw() {
        fill(0,0,0,20);
        rect(0,0,width,height);
        starDrawer.drawStars();

    }

    public static void main(String... args) {
        PApplet.main("com.classmethods.processing.sketches.Main");
    }
}