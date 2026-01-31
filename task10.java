import java.util.Scanner;


class checkprime{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
    System.out.print("Enter number to check its nature . ");
            int value = num.nextInt();
    System.out.print(prime(value));
}

    static String prime(int x){
        int check = 0;
        for(int i=2; i<x; i++){
            if(x % i == 0){
                check++;
            }
            
            if(check == 0){
                return "Prime number .";
            }
            else{
                return "Composite number .";
            }
            
    }
        return "G";
    }
}