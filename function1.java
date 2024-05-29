import java.util.Scanner;

public class function1 {
    public static int Prime(int n) {
        int count = 0;
        for(int i = 1; i <= n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        
        return 1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Prime(n);
        sc.close();        
    }
}
