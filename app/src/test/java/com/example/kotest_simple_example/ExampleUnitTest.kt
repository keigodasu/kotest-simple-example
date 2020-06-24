package com.example.kotest_simple_example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Color {
    fun getRed(): String = "FF000"
}

class ColorTests {

    @BeforeEach // 2
    fun setup() {
        // do something
    }

    @Test
    fun getRedTest() {
        assertEquals("FF0000", Color().getRed())
    }

}