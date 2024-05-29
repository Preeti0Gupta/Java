import java.util.Scanner;

public class Question1 {
    public static int Average(int a,int b,int c){
       float Avg = 0;
       int sum = 0;
       sum = a+b+c;
       Avg = (sum/3);
       System.out.println("Average = "+ Avg);

       return 1;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average(a,b,c);

        sc.close();
    }
}
