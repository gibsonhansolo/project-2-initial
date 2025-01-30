package com.csc205.project2;

/**
 *  Prompt used with ClaudeAi
 *  Generate the following java program based on the UML diagram.
 */

class Cube extends ThreeDimensionalShape {
    private double width;

    public Cube() {
        this.width = 0;
    }

    public Cube(double width) {
        this.width = width;
    }

    @Override
    public void Shape() {
        System.out.println("Cube");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * width * width;
    }

    @Override
    public double volume() {
        return width * width * width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
