import java.util.Scanner;


class Detector{
	
	public static void main(String args[]){

		Scanner values = new Scanner(System.in);
			int[] arr = new int[6];

		for(int i=0; i<6; i++){
			arr[i] = values.nextInt();
		}
	}


	
	static String Trenddetector(int[] arr){
	    for(int i=0; i<6; i++){
		if(arr[i] >= arr[i+1]){
			return "Strictly increasing numbers";
		}
		else if(arr[i] <= arr[i+1]){
			return "Strictly decreasing numbers ";
		}
		else{
			return 	"Mixed numbers";
		}}
		    return "O";
	}
}