import java.util.Scanner;


class perfect{

    public static void main(String args[]){

        Scanner values = new Scanner(System.in);
            System.out.print("Enter num1 : ");
                int num1 = values.nextInt();
            System.out.print("Enter num3 : ");
                int num2 = values.nextInt();

            System.out.print(ps(num1,num2));
    }


	static String ps(int a, int b){
            int number = a-b;

        int squareroot = (int) Math.sqrt(number);

      
            if(squareroot * squareroot == number){
                System.out.print("Perfect Square number .");
        }
            else{
                System.out.print("Not a perfect Square number .");
        }
        
                return "Great";
    }

}