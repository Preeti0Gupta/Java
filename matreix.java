import java.util.Scanner;

public class matreix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the columns:");
        int cols = sc.nextInt();

        int array[][] = new int[rows][cols];

        System.out.println("Enter the elements:");
        for(int i =  0; i< rows ; i++){
            for(int j = 0 ; j<cols ; j++){
            array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the searching element:");
        int x = sc.nextInt();
        for(int i =  0; i< rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if(array[i][j] == x){
                    System.out.println("x found at locations (" + i +"," + j +")");
                }
            }
        }
        sc.close();

        
    }
}
