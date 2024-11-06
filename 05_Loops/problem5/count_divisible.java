

public class count_divisible {

   public static void main(String[] args) {
      
      /** 
       *  Write a program that counts the number of numbers from 1 to 1000 that are divisible by 3, 4 and 5.
       */

      int count = 0;
      for (int i = 1; i <= 1000; i++) {
         if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
            count++;
         }
      }
      System.out.println(count);
   }
}