import java.util.Scanner;
/*
 * Develop a stack class to hold a maximum of 10 integers with suitable methods.
 * Develop a JAVA main method to illustrate stack operation.
 */

 public class Stack{
    int top = -1, capacity = 10;
    int []a = new int[capacity];
    void push(int x){
        if (top == capacity-1){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting the element" + x);
        a[++top] = x;
    }

    int pop(){
        if (top == -1){
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return a[top--];
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice:");
            int c = sc.nextInt();
            switch (c) {
                case 1: 
                    int v;
                    System.out.println("Enter value to push:");
                    v = sc.nextInt();
                    s.push(v);
                    break;
                case 2: 
                    System.out.println("The deleted element is :" + s.pop());
                    break;
                case 3: 
                    for (int i=0; i<=s.top; i++){
                        System.out.println(s.a[i]);
                    }
                    break;
                case 4: 
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
 }
