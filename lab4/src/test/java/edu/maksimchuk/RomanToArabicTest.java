package edu.maksimchuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 @author Tom
 @project lab4
 @class RomanToArabicTest
 @version 1.0.0
 @since 13.04.2025 - 07.50
 */

public class RomanToArabicTest {
    @Test
    void givenNullInput_expectNullPointerException() {
        assertThrows(NullPointerException.class,
                () -> RomanToArabicConverter.romanToArabic(null));
    }

    @Test
    void whenCyrillicXIsProvided_shouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("Х"));
        assertTrue(ex.getMessage().contains("Х cannot be converted to a Roman Numeral"));
    }

    @Test
    void inputStringBlank_shouldCauseIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic(" "));
        assertTrue(ex.getMessage().contains(" cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenABCInput_thenExpectIllegalArgument() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("ABC"));
        assertTrue(ex.getMessage().contains("ABC cannot be converted to a Roman Numeral"));
    }

    @Test
    void shouldThrowIfCyrillicСIsProvided() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("С"));
        assertTrue(ex.getMessage().contains("С cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputLCShouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("LC"));
        assertTrue(ex.getMessage().contains("LC cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenIIVProvided_thenExpectIllegalArgument() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("IIV"));
        assertTrue(ex.getMessage().contains("IIV cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenZInput_thenIllegalArgumentExpected() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("Z"));
        assertTrue(ex.getMessage().contains("Z cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIMInputProvided_thenExpectIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("IM"));
        assertTrue(ex.getMessage().contains("IM cannot be converted to a Roman Numeral"));
    }

    @Test
    void shouldThrowOnInvalidPatternVL() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("VL"));
        assertTrue(ex.getMessage().contains("VL cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputICThenShouldFailConversion() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("IC"));
        assertTrue(ex.getMessage().contains("IC cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenNonValidVXIIIIProvided_shouldThrow() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("VXIIII"));
        assertTrue(ex.getMessage().contains("VXIIII cannot be converted to a Roman Numeral"));
    }

    @Test
    void inputCyrillicM_mustThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("М"));
        assertTrue(ex.getMessage().contains("М cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIsEmptyString_thenIllegalArgumentExpected() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic(" "));
        assertTrue(ex.getMessage().contains(" cannot be converted to a Roman Numeral"));
    }

    @Test
    void whenInputIsRandomSpecialChars_thenShouldThrowIllegalArgumentException() {
        var ex = assertThrows(IllegalArgumentException.class,
                () -> RomanToArabicConverter.romanToArabic("@#$%"));
        assertTrue(ex.getMessage().contains("@#$% cannot be converted to a Roman Numeral"));
    }
}