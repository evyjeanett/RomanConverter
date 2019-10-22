import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", RomanConverter.toRoman(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", RomanConverter.toRoman(2));
    }

    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", RomanConverter.toRoman(3));
    }

    @Test
    void shouldConvert4ToIV(){
        assertEquals("IV", RomanConverter.toRoman(4));
    }

    @Test
    void shouldConvert5ToV(){
        assertEquals("V", RomanConverter.toRoman(5));
    }

    @Test
    void shouldConvert6ToVI(){
        assertEquals("VI", RomanConverter.toRoman(6));
    }

    @Test
    void shouldConver7ToVII(){
        assertEquals("VII", RomanConverter.toRoman(7));
    }

    @Test
    void shouldConvert8ToVIII(){
        assertEquals("VIII", RomanConverter.toRoman(8));
    }

    @Test
    void shouldCovert9ToIX() {
        assertEquals("IX", RomanConverter.toRoman(9));
    }

    @Test
    void shouldConvert10ToX() {
        assertEquals("X", RomanConverter.toRoman(10));
    }

    @Test
    void ShouldCalculateNumbersOver10(){
        assertEquals("XVIII", RomanConverter.toRoman(18));
        assertEquals("XV", RomanConverter.toRoman(15));
    }

    @Test
    void ShouldCalculateMultiplesOf10(){
        assertEquals("XXXIV",  RomanConverter.toRoman(34));
    }

    @Test
    void ShouldCalculateSimpleDigits(){
        assertEquals("MMMDCCCLXXXVIII",  RomanConverter.toRoman(3888));
    }

    @Test
    void ShouldCalculateFourDigits(){
        assertEquals("CDXLIV", RomanConverter.toRoman(444));
    }

    @Test
    void ShouldCalculateNineDigits(){
        assertEquals("CMXCIX", RomanConverter.toRoman(999));
    }
}
