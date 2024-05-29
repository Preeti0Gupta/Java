import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enetr the size of an array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0;i < size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Display of elements");
        for(int i = 0; i < size; i++){
            System.err.println(numbers[i]);
        }
        sc.close();
    }
}
