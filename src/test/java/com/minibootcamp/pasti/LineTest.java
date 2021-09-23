package com.minibootcamp.pasti;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void getLength_ShouldReturnZero_WhenAllInputAreSame() {
        Line line = new Line(1,1,1,1);
        assertEquals(0, line.getLength(), 0);
    }
}
