package application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import application.Square;

public class SquareTest {
	
	private Square square;
	
	@BeforeEach
    void setUp() {
        square = new Square(100, 150, "blue", 50);
    }
	
	@Test
    void testGetCenterX() {
        assertEquals(100, square.getCenterX());
    }

    @Test
    void testGetCenterY() {
        assertEquals(150, square.getCenterY());
    }

    @Test
    void testGetColor() {
        assertEquals("blue", square.getColor());
    }

    @Test
    void testMove() {
        square.move(10, -20);
        assertEquals(110, square.getCenterX());
        assertEquals(130, square.getCenterY());
    }

    @Test
    void testGetSideLength() {
        assertEquals(50, square.getSideLength());
    }

    @Test
    void testSetSideLength() {
        square.setSideLength(80);
        assertEquals(80, square.getSideLength());
    }

    @Test
    void testGetArea() {
        assertEquals(2500, square.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(200, square.getPerimeter());
    }

    @Test
    void testDrawReturnsRectangle() {
        assertNotNull(square.draw());
        assertEquals(50, square.draw().getWidth());
        assertEquals(50, square.draw().getHeight());
    }

}
