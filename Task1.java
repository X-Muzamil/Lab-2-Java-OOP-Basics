import java.util.Scanner;

class Task1{


	static void numberanalyzer(){
		
		Scanner num = new Scanner(System.in);
			System.out.print("Enter any number to analyze its nature :");
			int value = num.nextInt();

				if(value > 0 && value%2 == 0){
					System.out.println("=====Positive Even Number=====");}
				else if(value > 0 && value%2 != 0){
					System.out.println("=====Positive Odd Number=====");}
				else if (value < 0 ){
					System.out.print("=====Negative Number=====");}
				else{
					System.out.print("=====Zero number=====");}
			
		}

		public static void main(String args[]){
			
			numberanalyzer();


	}







}