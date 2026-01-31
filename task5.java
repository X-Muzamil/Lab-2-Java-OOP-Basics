import java.util.Scanner;

class PatternValidator {

    static boolean stringpattern(String text) {


        if (text.length() < 6) {
            return false;
        }

        
        char first = text.charAt(0);
        if (first < 'A' || first > 'Z') {
            return false;
        }

     
        char last = text.charAt(text.length() - 1);
        if (last < '0' || last > '9') {
            return false;
        }

        return true;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.print(stringpattern(text));
    }
}
