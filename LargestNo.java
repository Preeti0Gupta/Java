import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a >c)
        {
            System.out.println("Greateer number is = "+a);
        }
        else if(b > a &&  b > c){
            System.out.println("Greater number is = "+b);
        } else {
            System.out.println("Greater number is = "+c);
        }
        sc.close();
        
    }
}
