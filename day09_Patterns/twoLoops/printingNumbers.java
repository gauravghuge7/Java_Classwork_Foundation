
package day09_Patterns.twoLoops;


public class printingNumbers {

   
   static void print_10_Numbers() {

      for(int i=1; i<=10; i++) {

         for(int j=1; j<=10; j++) {
            System.out.print(i*j+" ");
         }

         System.out.println();
      }
   }





   public static void main(String[] args) {

      print_10_Numbers();

   }
   
}

