

public class print_odd_numbers {

   
   public static void main(String[] args) {
      
      /** 
       *  Write a program that prints the odd numbers from 1 to 100 on separate lines.
       */

      for (int i = 1; i <= 100; i++) {
         if (i % 2 != 0) {
            System.out.println(i);
         }
      }
   }
}