class CommandLineValidator {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please enter 3 numbers.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        int diff = largest - smallest;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Difference: " + diff);
    }
}
