import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns:");
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];

        //input
        System.out.println("Enter the elements:");
        for(int i = 0 ; i < rows ; i++){
            //columns
            for(int j = 0 ; j< cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("Elements of an array are:");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0; j < cols ; j++){
                System.out.print(numbers[i][j] + " ");
                
            }
            System.out.println();
        }
        sc.close();

    }
}
