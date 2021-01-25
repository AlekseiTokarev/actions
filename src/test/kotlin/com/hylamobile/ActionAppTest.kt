package com.hylamobile

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


object ActionAppTest {

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        Assertions.assertEquals(1 + 3, 4)
    }

    @Test
    fun `Adding 1 and 2 should be equal to 3`() {
        Assertions.assertEquals(1 + 2, 3)
    }

    @Test
    fun `join string`() {
        val joinToString = listOf(2, 3).joinToString("\n", "[", "]")
        Assertions.assertEquals(joinToString, """[2
            3]""".trimIndent())
    }
}


