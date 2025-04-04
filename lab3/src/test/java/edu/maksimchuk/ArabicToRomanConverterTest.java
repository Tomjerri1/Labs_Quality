package edu.maksimchuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 @author Tom
 @project lab3
 @class ArabicToRomanConverterTest
 @version 1.0.0
 @since 04.04.2025 - 18.27
 */

class ArabicToRomanConverterTest {

    @Test
    void whenArabic_3_ThenRomanIII(){
        Assertions.assertEquals("III", ArabicToRomanConverter.arabicToRoman(3));
    }

    @Test
    void whenArabic_4_ThenRomanIV(){
        Assertions.assertEquals("IV", ArabicToRomanConverter.arabicToRoman(4));
    }

    @Test
    void whenArabic_5_ThenRomanV(){
        Assertions.assertEquals("V", ArabicToRomanConverter.arabicToRoman(5));
    }

    @Test
    void whenArabic_8_ThenRomanVIII(){
        Assertions.assertEquals("VIII", ArabicToRomanConverter.arabicToRoman(8));
    }

    @Test
    void whenArabic_9_ThenRomanIX(){
        Assertions.assertEquals("IX", ArabicToRomanConverter.arabicToRoman(9));
    }

    @Test
    void whenArabic_10_ThenRomanX(){
        Assertions.assertEquals("X", ArabicToRomanConverter.arabicToRoman(10));
    }

    @Test
    void whenArabic_14_ThenRomanXIV(){
        Assertions.assertEquals("XIV", ArabicToRomanConverter.arabicToRoman(14));
    }

    @Test
    void whenArabic_19_ThenRomanXIX(){
        Assertions.assertEquals("XIX", ArabicToRomanConverter.arabicToRoman(19));
    }

    @Test
    void whenArabic_20_ThenRomanXX(){
        Assertions.assertEquals("XX", ArabicToRomanConverter.arabicToRoman(20));
    }

    @Test
    void whenArabic_30_ThenRomanXXX(){
        Assertions.assertEquals("XXX", ArabicToRomanConverter.arabicToRoman(30));
    }

    @Test
    void whenArabic_39_ThenRomanXXXIX(){
        Assertions.assertEquals("XXXIX", ArabicToRomanConverter.arabicToRoman(39));
    }

    @Test
    void whenArabic_40_ThenRomanXL(){
        Assertions.assertEquals("XL", ArabicToRomanConverter.arabicToRoman(40));
    }

    @Test
    void whenArabic_44_ThenRomanXLIV(){
        Assertions.assertEquals("XLIV", ArabicToRomanConverter.arabicToRoman(44));
    }

    @Test
    void whenArabic_49_ThenRomanXLIX(){
        Assertions.assertEquals("XLIX", ArabicToRomanConverter.arabicToRoman(49));
    }

    @Test
    void whenArabic_50_ThenRomanL(){
        Assertions.assertEquals("L", ArabicToRomanConverter.arabicToRoman(50));
    }

    @Test
    void whenArabic_90_ThenRomanXC(){
        Assertions.assertEquals("XC", ArabicToRomanConverter.arabicToRoman(90));
    }

    @Test
    void whenArabic_99_ThenRomanXCIX(){
        Assertions.assertEquals("XCIX", ArabicToRomanConverter.arabicToRoman(99));
    }

    @Test
    void whenArabic_100_ThenRomanC(){
        Assertions.assertEquals("C", ArabicToRomanConverter.arabicToRoman(100));
    }

    @Test
    void whenArabic_400_ThenRomanCD(){
        Assertions.assertEquals("CD", ArabicToRomanConverter.arabicToRoman(400));
    }

    @Test
    void whenArabic_444_ThenRomanCDXLIV(){
        Assertions.assertEquals("CDXLIV", ArabicToRomanConverter.arabicToRoman(444));
    }

    @Test
    void whenArabic_500_ThenRomanD(){
        Assertions.assertEquals("D", ArabicToRomanConverter.arabicToRoman(500));
    }

    @Test
    void whenArabic_600_ThenRomanDC(){
        Assertions.assertEquals("DC", ArabicToRomanConverter.arabicToRoman(600));
    }

    @Test
    void whenArabic_900_ThenRomanCM(){
        Assertions.assertEquals("CM", ArabicToRomanConverter.arabicToRoman(900));
    }

    @Test
    void whenArabic_944_ThenRomanCMXLIV(){
        Assertions.assertEquals("CMXLIV", ArabicToRomanConverter.arabicToRoman(944));
    }

    @Test
    void whenArabic_1000_ThenRomanM(){
        Assertions.assertEquals("M", ArabicToRomanConverter.arabicToRoman(1000));
    }

    @Test
    void whenArabic_1001_ThenRomanMI(){
        Assertions.assertEquals("MI", ArabicToRomanConverter.arabicToRoman(1001));
    }

    @Test
    void whenArabic_1666_ThenRomanMDCLXVI(){
        Assertions.assertEquals("MDCLXVI", ArabicToRomanConverter.arabicToRoman(1666));
    }

    @Test
    void whenArabic_1984_ThenRomanMCMLXXXIV(){
        Assertions.assertEquals("MCMLXXXIV", ArabicToRomanConverter.arabicToRoman(1984));
    }

    @Test
    void whenArabic_1994_ThenRomanMCMXCIV(){
        Assertions.assertEquals("MCMXCIV", ArabicToRomanConverter.arabicToRoman(1994));
    }

    @Test
    void whenArabic_1999_ThenRomanMCMXCIX(){
        Assertions.assertEquals("MCMXCIX", ArabicToRomanConverter.arabicToRoman(1999));
    }

    @Test
    void whenArabic_2000_ThenRomanMM(){
        Assertions.assertEquals("MM", ArabicToRomanConverter.arabicToRoman(2000));
    }

    @Test
    void whenArabic_2750_ThenRomanMMDCCL(){
        Assertions.assertEquals("MMDCCL", ArabicToRomanConverter.arabicToRoman(2750));
    }

    @Test
    void whenArabic_3333_ThenRomanMMMCCCXXXIII(){
        Assertions.assertEquals("MMMCCCXXXIII", ArabicToRomanConverter.arabicToRoman(3333));
    }

    @Test
    void whenArabic_3999_ThenRomanMMMCMXCIX(){
        Assertions.assertEquals("MMMCMXCIX", ArabicToRomanConverter.arabicToRoman(3999));
    }

    @Test
    void whenArabic_0_ThenIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(0));
    }

    @Test
    void whenArabic_negative10_ThenIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(-10));
    }

    @Test
    void whenArabic_4001_ThenIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArabicToRomanConverter.arabicToRoman(4001));
    }
}