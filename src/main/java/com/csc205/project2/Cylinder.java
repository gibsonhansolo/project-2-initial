package com.csc205.project2;
/**
 *  Prompt used with ClaudeAi
 *  Generate the following java program based on the UML diagram.
 */

class Cylinder extends ThreeDimensionalShape {

    private double height;
    private double radius;

    @Override
    public void Shape() {
        System.out.println("Cylinder");
    }

    public Cylinder() {
        this.height = 0;
        this.radius = 0;
    }

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
