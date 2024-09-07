package com.github.lucaswangdev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        // 测试正数相加
        assertEquals(5, MathUtils.add(2, 3), "2 + 3 should equal 5");

        // 测试负数相加
        assertEquals(-5, MathUtils.add(-2, -3), "-2 + -3 should equal -5");

        // 测试正负数相加
        assertEquals(0, MathUtils.add(2, -2), "2 + -2 should equal 0");
    }
}
