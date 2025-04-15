import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int a = input.nextInt();

        System.out.println("Enter the second integer:");
        int b = input.nextInt();

        System.out.println("Enter the third integer:");
        int c = input.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
        input.close();
    }
}
