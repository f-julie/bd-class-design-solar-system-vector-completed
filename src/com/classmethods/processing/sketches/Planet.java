package com.classmethods.processing.sketches;

import math.Vector;
import processing.core.PApplet;

public class Planet {
    PApplet p = Main.applet;

    private float mass;
    private float diameter;
    private int hue;
    private Vector position;
    private Vector velocity;
    private Vector acceleration;
    private Planet sun;

    public Planet(float mass, float diameter, int hue, Vector position, Vector velocity, Planet sun) {
        this.mass = mass;
        this.diameter = diameter;
        this.hue = hue;
        this.position = position;
        this.velocity = velocity;
        this.sun = sun;
    }

    public Vector calcForces() {
        if (this.sun == null) return new Vector(0,0);

        float G = 10f;

        Vector distanceVector = sun.getPosition().minus(position);

        float gravityForce = G * mass * sun.getMass() / distanceVector.magSq();

        Vector directionVector = distanceVector.normalized();
        Vector forceVector = directionVector.times(gravityForce);
        return forceVector;
    }

    public void move() {
        acceleration = calcForces().times(1.0f/mass);
        velocity.add(acceleration);
        position.add(velocity);
    }

    public void drawSelf() {
        p.fill(this.hue, 255, 255);
        p.ellipse(position.getX(), position.getY(), diameter, diameter);
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public Vector getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }

    public Vector getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Vector acceleration) {
        this.acceleration = acceleration;
    }
}
