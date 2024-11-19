

public class count_odd {
   
   public static void main(String[] args) {
      

      /** 
       *  Write a program that counts the number of odd numbers from 41 to 81
       */
      int count = 0;
      for (int i = 41; i <= 81; i++) {
         if (i % 2 != 0) {
            count++;
         }
      }
      System.out.println(count);
   }
}
