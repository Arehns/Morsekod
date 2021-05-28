package Morsekod;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MorseTest {

    /*
     * @Test // void testConvertA() { //arrange
     *
     * Converter a = new Converter(); //act String result = a.outMorse("a");
     * //assert assertEquals(result, ".-"); }
     *
     * @Test void testConvertE() { //arrange Converter a = new Converter(); //act
     * String result = a.outMorse("e"); //assert assertEquals(result, "."); }
     */

    @Test
        // Method converts upper case english letter to a morse
    void testgetMorseUpperLetter() {
        // arrange
        Converter m = new Converter();
        String test = "A";
        String expected = ".- ";
        // act
        String result = m.getMorse(test);
        // assert
        assertEquals(expected, result);
    }

    @Test // Method converts lower case eng letter to morse
    void testgetMorseA() {
        // arrange
        Converter m = new Converter();
        String test = "a";
        String expected = ".- ";
        // act
        String result = m.getMorse(test);
        // assert
        assertEquals(expected, result);
    }

    @Test // Tests convertion of more than one lower case letters.
    void testgetMorseName() {
        // arrange
        Converter m = new Converter();
        // act
        String result = m.getMorse("alma");
        // assert
        assertEquals(".- .-.. -- .- ", result);
    }

    @Test // Tests convertion of some lower case letters.
    void testgetMorseSomeVersals() {
        // arrange
        Converter m = new Converter();
        // act
        String result = m.getMorse("alMa");
        // assert
        assertEquals(".- .-.. -- .- ", result);
    }

    @Test // Tests convertion with blank space.
    void testgetMorseSpace() {
        // arrange
        Converter m = new Converter();
        // act
        String result = m.getMorse("ALMA A");
        // assert
        assertEquals(".- .-.. -- .-   .- ", result);
    }

    @Test // getMorse method needs to return a word with for loop.
    public void testgetMorseSentence() {
        Converter m = new Converter();
        String expected = "- .... .   ...- .. -.- .. -. --.   .- --. .   . -. -.. . -..   .. -.   .---- ----- -.... -.... ";
        String result = m.getMorse("THE VIKING AGE ENDED IN 1066");
        assertEquals(expected, result);
    }

    @Test // Method returns punctuation marks.
    void testgetMorseConvertPunctuation() {
        Converter m = new Converter();
        String expected = ".-.-.- --..-- ..--.. ";
        String result = m.getMorse(".,?");
        assertEquals(expected, result);
    }

    @Test // Method for converting morse to an eng letter.
    public void testGetEngA() {
        Converter m = new Converter();
        String expected = "A";
        String result = m.getEng(".-");
        assertEquals(expected, result);
    }

    @Test // Method converts morse to eng letters.
    void testgetEngName() {
        Converter m = new Converter();
        String expected = "ALMA";
        String result = m.getEng(".- .-.. -- .-");
        assertEquals(expected, result);
    }

    @Test // Method converts morse sentence to eng letters.
    void testgetEngSentence() {
        Converter m = new Converter();
        String expected = "THE VIKING AGE ENDED IN 1066";
        String result = m
                .getEng("- .... .  ...- .. -.- .. -. --.  .- --. .  . -. -.. . -..  .. -.  .---- ----- -.... -....");
        assertEquals(expected, result);
    }

    @Test // Method returns number.
    void testgetEngConvertNumber() {
        Converter m = new Converter();
        String expected = ".,?";
        String result = m.getEng(".-.-.- --..-- ..--..");
        assertEquals(expected, result);
    }

    @Test // Method returns punctuation marks.
    void testgetEngConvertPunctuation() {
        Converter m = new Converter();
        String expected = "8";
        String result = m.getEng("---..");
        assertEquals(expected, result);
    }

    @Test // If else to replace null with space. Test data has 4 space input.
    void testgetEngNull() {
        Converter m = new Converter();
        String expected = "ABBA    ABBA";
        String result = m.getEng(".- -... -... .-     .- -... -... .- ");
        assertEquals(expected, result);
    }

}
