public class StringCompare {
    public static void main(String[] args) {
        //compare
        String name1 = "Tokyo";
        String name2 = "Tokyo";
        

        //s1 > s2  : +ve value return karega
        //s1 == s2 : 0
        //s1 < s2 : -ve value

        /*hello wello me wello bada hai because in character jaise jaise no of char badta hai waise waise uska value bhi increase hota hai, shamjhe Tokyo */
         if(name1.compareTo(name2) == 0){
             System.out.println("Strings are equal");
         }else{
             System.out.println("Strings are not equal");
         }

        //some time it will not work
        // if(name1 == name2){
        //          System.out.println("Strings are equal");
        //      }else{
        //          System.out.println("Strings are not equal");
        //      }
        
        /*if(new String("Tokyo") == new String("Tokyo")){
                 System.out.println("Strings are equal");
             }else{
                 System.out.println("Strings are not equal");
             }
        */
    }
}
