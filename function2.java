import java.util.Scanner;

public class function2 {
    public static int EvenOdd(int n) {
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        return 1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        EvenOdd(n);
        sc.close();
    }
}
