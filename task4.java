import java.util.Scanner;

class Grade {

    static String gradedriven(int select) {

        switch (select) {
            case 1:
                return "Distinction";
            case 2:
                return "Excellent";
            case 3:
                return "Very Good";
            case 4:
                return "Good";
            case 5:
                return "Fail";
            default:
                return "Invalid choice";
        }
    }

    public static void main(String args[]) {

        Scanner mark = new Scanner(System.in);

        System.out.println("Enter 1 if your marks are (90 to 100)");
        System.out.println("Enter 2 if your marks are (80 to 89)");
        System.out.println("Enter 3 if your marks are (70 to 79)");
        System.out.println("Enter 4 if your marks are (50 to 59)");
        System.out.println("Enter 5 if your marks are below (50)");

        System.out.print("Select the option : ");
        int select = mark.nextInt();

        System.out.println("Grade: " + gradedriven(select));
    }
}
