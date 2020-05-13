package com.hylamobile

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


object ActionAppTest {

    @Test
    fun `Adding 1 and 3 should be equal to 4`() {
        Assertions.assertEquals(1 + 3, 5)
    }

    @Test
    fun `Adding 1 and 2 should be equal to 3`() {
        Assertions.assertEquals(1 + 2, 3)
    }

    @Test
    fun parseJson() {
        val json = "{\n" +
                "\"isDefault\": false,\n" +
                "\"hardStop\": false,\n" +
                "\"hasSecondaryReason\": false,\n" +
                "\"nextQuestion\": null\n" +
                "}";
        val parsedJson = ObjectMapper().readValue(json, Map::class.java)
        print(ObjectMapper().writeValueAsString(parsedJson));
    }
}


