import java.util.Scanner;

public class Question3 {
    public static int Greatest(int a, int b){
        if(a > b){
            System.out.println("Greater number : " + a);
        }
        else{
            System.out.println("Greater number is : "+ b);
        }
        
        return 1;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Greatest(a,b);
        sc.close();
    }
}
