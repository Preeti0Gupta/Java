import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.print("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10 ; i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}
