package com.classmethods.processing.sketches;

import math.Vector;
import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet applet;
    StarDrawer starDrawer;

    private Planet sun;
    private Planet earth;
    private Planet mercury;
    private Planet mars;

    public void settings() {
        applet = this;
        size(600, 600);
    }

    public void setup() {
        starDrawer = new StarDrawer();

        colorMode(HSB);
        noStroke();

        sun = new Planet(100, 50, 38, new Vector(300,300),
                new Vector(0,0), null);
        earth = new Planet(0.8f, 11, 160, new Vector(120,300),
                new Vector(0,-2), sun);
        mercury = new Planet(0.6f, 10, 20, new Vector(200,300),
                new Vector(0,-2.5f), sun);
        mars = new Planet(1f, 6, 0, new Vector(100,300),
                new Vector(0,-2.25f), sun);
    }

    public void draw() {
        fill(0,0,0,20);
        rect(0,0,width,height);
        starDrawer.drawStars();

        sun.drawSelf();
        //sun.move();

        earth.drawSelf();
        earth.move();

        mercury.drawSelf();
        mercury.move();

        mars.drawSelf();
        mars.move();

    }

    public static void main(String... args) {
        PApplet.main("com.classmethods.processing.sketches.Main");
    }
}