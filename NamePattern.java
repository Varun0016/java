package practice;

public class NamePattern {
    public static void main(String[] args) {
        String name = "VARUN";
        int height = 5; 

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < name.length(); j++) {
                printLetterLine(name.charAt(j), i);
                System.out.print("  ");
            }
            System.out.println(); 
        }
    }

    public static void printLetterLine(char letter, int line) {
        switch (letter) {
            case 'V':
                if (line == 0) System.out.print("*   *");
                else if (line == 1) System.out.print("*   *");
                else if (line == 2) System.out.print("*   *");
                else if (line == 3) System.out.print(" * * ");
                else if (line == 4) System.out.print("  *  ");
                break;

            case 'A':
                if (line == 0) System.out.print("  *  ");
                else if (line == 1) System.out.print(" * * ");
                else if (line == 2) System.out.print("*****");
                else if (line == 3) System.out.print("*   *");
                else if (line == 4) System.out.print("*   *");
                break;

            case 'R':
                if (line == 0) System.out.print("**** ");
                else if (line == 1) System.out.print("*   *");
                else if (line == 2) System.out.print("**** ");
                else if (line == 3) System.out.print("*  * ");
                else if (line == 4) System.out.print("*   *");
                break;

            case 'U':
                if (line == 0) System.out.print("*   *");
                else if (line == 1) System.out.print("*   *");
                else if (line == 2) System.out.print("*   *");
                else if (line == 3) System.out.print("*   *");
                else if (line == 4) System.out.print(" *** ");
                break;

            case 'N':
                if (line == 0) System.out.print("*   *");
                else if (line == 1) System.out.print("**  *");
                else if (line == 2) System.out.print("* * *");
                else if (line == 3) System.out.print("*  **");
                else if (line == 4) System.out.print("*   *");
                break;

            default:
                System.out.print("     "); 
        }
    }
}
