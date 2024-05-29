import java.util.Scanner;

public class Functions {
    public static void Factorial(int n) {
        //loop
        int fact = 1;

        for(int i=n ; i>=1 ; i--){
            fact= fact *i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Factorial(n);
        sc.close();

    }
    
}
