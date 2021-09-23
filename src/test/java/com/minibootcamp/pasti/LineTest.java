package com.minibootcamp.pasti;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void getLength_ShouldReturnZero_WhenAllInputAreSame() {
        Line line = new Line(1, 1, 1, 1);
        assertEquals(0, line.getLength(), 0);
    }

    @Test
    void getLength_ShouldReturnValueMoreThanZero_WhenAtLeastOneInputIsDifferent() {
        Line line = new Line(2, 1, 1, 1);
        assertEquals(1, line.getLength(), 0);
    }

    @Test
    void compareLine_ShouldEqualTrue_WhenPointsAreSame() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(1, 2, 3, 4);
        assertTrue(line1.compareLine(line2));
    }
}
