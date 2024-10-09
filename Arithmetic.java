import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for A:");
        a = sc.nextInt();
        System.out.println("Enter value for B");
        b = sc.nextInt();
        System.out.println("A+B = " + (a+b));
        System.out.println("A-B = " + (a-b));
        System.out.println("A*B = " + (a*b));
        System.out.println("A/B = " + (a/b));
        System.out.println("A%B = " + (a%b));
        System.out.println("Done bye!");
        sc.close();
    }
}