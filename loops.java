/* types of loop
   1.for  or entry controll
   2.while  or entry controll
   3.do while or exit controll

   1.for(initialisation; condition; updation){
    //do code
   }

   2.while(condition){
       update
       code
   }

   3.do{
       update
   }while(condition);

*/
public class loops {

    public static void main(String[] args) {
        // for(int counter = 0; counter < 10 ; counter++){
        //      System.out.println("Now you are learning loops");
        // }

        // for(int i = 1;i<=10;i++){
        //     System.out.println(i);
        // }
        

         int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        do{
            System.out.println(i);
            i++;
        }while(i<=10);

    }
}
