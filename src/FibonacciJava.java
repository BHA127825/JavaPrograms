import java.util.Scanner;

public class FibonacciJava {
    public static int fibonacci(int n) {

        if(n <= 1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;
        while(i < n)
        {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }
}
