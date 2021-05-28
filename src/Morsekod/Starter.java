package Morsekod;

import java.util.Scanner;

public class Starter {

    public void starter() {

        Scanner scan = new Scanner(System.in);
        Converter m = new Converter();
        int r = 0;
        boolean awake = true;

        System.out.println("| Welcome to the worlds most basic translator |");
        System.out.println(" ");

        System.out.println("| Choose one of following: |");
        System.out.println(" ");

        while (awake) {

            System.out.println("|1| Convert english to morse code |");
            System.out.println("|2| Convert morse code to english |");
            System.out.println("|3| End program |");

            // try-catch invalid data-types
            try {
                r = Integer.valueOf(scan.nextLine());
            } catch (Exception e) {

            }

            switch (r) {

                case 1:
                    System.out.println("| Enter your english text here |");
                    String inLetters = scan.nextLine();
                    String yourMorse = m.getMorse(inLetters);
                    System.out.println("| " + yourMorse + " |");
                    awake = true;
                    break;
                case 2:
                    System.out.println("| Enter your morse code (Use space twice to separate words) |");
                    String inCode = scan.nextLine();
                    String yourEnglish = m.getEng(inCode);
                    System.out.println("| " + yourEnglish + " |");
                    awake = true;
                    break;
                case 3:
                    System.out.println("| Program has been shut down |");
                    scan.close();
                    awake = false; // stops loop
                    break;
                default: // catches number larger than 3 or lower than 1
                    System.out.println("| Try option 1, 2 or 3 |");
                    System.out.println(" ");
                    awake = true;
                    break;
            }
        }
    }

}
