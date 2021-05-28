package Morsekod;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class Converter {
    private String dash = " ";

    // Arrays are private attributes

    private String[] eng = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".", "?",
            " " };

    private String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--",
            ".-.-.-", "..--..", " " };

    // Create two HashMaps

    private HashMap<String, String> engMap = new HashMap<String, String>();
    private HashMap<String, String> morseMap = new HashMap<String, String>();

    // Converter connects corresponding character into two dictionaries.

    public Converter() {

        for (int i = 0; i < eng.length; i++) {
            engMap.put(eng[i], morse[i]);
        }
        for (int j = 0; j < morse.length; j++) {
            morseMap.put(morse[j], eng[j]);
        }

    }

    public String getMorse(String inLetters) {
        String myMorse = "";
        String sentence = inLetters.toUpperCase();
        String[] letters = sentence.split("");
        for (int k = 0; k < inLetters.length(); k++) {
            myMorse += engMap.get(letters[k]) + dash; // add space for heuristics usability.
        }
        return myMorse;
    }

    public String getEng(String inCode) {
        String myEng = "";
        String[] newCode = inCode.split(" ");
        for (int p = 0; p < newCode.length; p++) {
            // Replaces null with blank space for usability
            if (morseMap.get(newCode[p]) == null) {
                myEng += dash;
            } else {
                myEng += morseMap.get(newCode[p]);
            }
        }
        return myEng;
    }

}
