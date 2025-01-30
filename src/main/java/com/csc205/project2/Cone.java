package com.csc205.project2;

/**
 *  Prompt used with ClaudeAi
 *  Generate the following java program based on the UML diagram.
 */

class Cone extends ThreeDimensionalShape {
    private double height;
    public double radius;

    public Cone() {
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public void Shape() {
        System.out.println("Cone");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        // Surface area = πr(r + √(h² + r²))
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        // Volume = πr²h/3
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
