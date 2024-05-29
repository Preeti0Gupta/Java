import java.util.Scanner;

public class function3 {
    public static int PrintTable(int n) {
        int Table=0;
        for(int i =1 ; i <=10 ; i++){
           Table = n * i;
        
        System.out.println(Table);
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintTable(n);
        sc.close();
    }
    
}
