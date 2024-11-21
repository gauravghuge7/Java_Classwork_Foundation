

public class pattern1 {
   


   static void rightAngle() {

      /* 
       *     1 
       *     2 2
       *     3 3 3
      */

      for(int i=1; i<=75; i++) {
         for(int j=1; j<=i; j++) {
            System.out.print(i+" ");
         }
         System.out.println();
      }

   }

   static void rightAngleJ() {

      /* 
       *    1 
       *    1 2
       *    1 2 3 
      */

      for(int i=1; i<=75; i++) {
         for(int j=1; j<=i; j++) {
            System.out.print(j+" ");
         }
         System.out.println();
      }
   }

   static void countable(int n) {

      /* 
       * 
       *   1 
       *   2 3 
       *   4 5 6 
       *   7 8 9 10 
       *   11 12 13 15
      */

      int count =1;

      for(int i=1; i<=n; i++) {

         for(int j=1; j<=i; j++) {
            System.out.print((count++) + " ");
         }
         System.out.println();
      }
   }



   public static void main(String[] args) {
      
      // rightAngleJ();
      rightAngle();

      // countable(25);
   }
}
