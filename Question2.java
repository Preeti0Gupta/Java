import java.util.Scanner;

public class Question2 {
    public static int SumOdd(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {  if(i%2==1)
            sum = sum + i;
        }
        System.out.println("Sum Of Odd Number = " + sum);
        
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        SumOdd(n);
        sc.close();

        
    }
}
