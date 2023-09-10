import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi! This is my first java code");
        System.out.println("Enter two number to get the sum");
        Scanner readInput = new Scanner(System.in);
        int inputA = readInput.nextInt();
        int inputB = readInput.nextInt();
        System.out.print("Sum of the two numbers is : ");
        System.out.print(inputA + inputB);
    }
}