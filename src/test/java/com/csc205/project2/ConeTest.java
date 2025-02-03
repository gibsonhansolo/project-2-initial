package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  Prompt used with ClaudeAi
 *
 *  Generate following test based on CubeTest <pasted entire Test file>
 *
 */

public class ConeTest {

    private Cone cone;

    @BeforeEach
    public void setUp() {
        cone = new Cone(6.0, 4.0);  // height = 6.0, radius = 4.0
    }

    @Test
    public void testGetHeight() {
        assertEquals(6.0, cone.getHeight());
    }

    @Test
    public void testGetRadius() {
        assertEquals(4.0, cone.getRadius());
    }

    @Test
    public void testSetHeight() {
        cone.setHeight(8.0);
        assertEquals(8.0, cone.getHeight());
    }

    @Test
    public void testSetRadius() {
        cone.setRadius(5.0);
        assertEquals(5.0, cone.getRadius());
    }

    @Test
    public void testSurfaceArea() {
        // Surface area = πr(r + √(h² + r²))
        double slantHeight = Math.sqrt(36 + 16); // √(6² + 4²)
        double expectedArea = Math.PI * 4 * (4 + slantHeight);
        assertEquals(expectedArea, cone.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        // Volume = πr²h/3
        double expectedVolume = Math.PI * 16 * 6 / 3; // π * 4² * 6 / 3
        assertEquals(expectedVolume, cone.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Cone {height=6.0, radius=4.0, surface area=140.8828696505485, volume=100.53096491487338}";
        System.out.println(cone.radius);
        assertEquals(expected, cone.toString());
    }
}
