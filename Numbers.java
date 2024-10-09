import java.util.Scanner;

public class IfElseExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } 
        else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } 
        else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}

public class Numbers{
    public static void main(String[] args) {
        int num = 100;
        System.out.println("The initial number is" + num);
        num*=2;
        System.out.println(num);
    }
}