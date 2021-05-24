package com.devskiller.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringHelperTest {

    @Test
    @DisplayName("should reverse the string")
    void reverse() {
        // given
        final String inputString = "abcd efgh";
        final String expectedReversedString = "hgfe dcba";

        // when
        final String actualReversedString = StringHelper.reverse(inputString);

        // then
        assertEquals(expectedReversedString, actualReversedString);
    }

    @Test
    @DisplayName("should return substring based on index")
    void substring() {
        // given
        final String inputString = "few short fancy words";
        final int inputIndex = 3;
        final String expectedSubstring = "fancy";

        // when
        final String actualSubstring = StringHelper.substring(inputString, inputIndex);

        // then
        assertEquals(expectedSubstring, actualSubstring);
    }

    @Test
    @DisplayName("should throw exception when index exceeds number of words")
    void exception() {
        // given
        final String inputString = "two words";
        final int inputIndex = 3;

        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> StringHelper.substring(inputString, inputIndex));
    }
}
