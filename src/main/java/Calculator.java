import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;

    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;

    }

    public int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("add me "+c.add(a,b));
        System.out.println("Sub me "+c.sub(a,b) );
        System.out.println("mul me "+c.mul(a,b));
        System.out.println("div me "+c.div(a,b));

    }
}
