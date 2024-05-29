import java.util.*;
public class SumNaturalNo {
    public static void main(String[] args) {
        System.out.print("Enter the vale of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //int n =10;
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum of natural number : " + sum);
        sc.close();
    }
}
