import java.util.Scanner;


class ConditionalCalculator{

		static int values(int num1, int num2){
			if(num1>num2)
				return num1-num2;
			else if(num2>num1)
				return num2-num1;
			else 
				return 0;


		}
		

		public static void main(String args[]){

			Scanner num = new Scanner(System.in);
				System.out.print("Enter num1 : ");
				int num1 = num.nextInt();
				System.out.print("Enter num2 : ");
				int num2 = num.nextInt();

			System.out.print("Result = " + values(num1,num2));


}
}