import java.util.*;
public class Functiontest{
    public static int Function_Sum( int a, int b) {
        //System.out.println(a + b);
        int sum = a + b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Function_Sum(a,b);
        System.out.println("Sum of two numbers is : "+sum);

        sc.close();

    }
}
