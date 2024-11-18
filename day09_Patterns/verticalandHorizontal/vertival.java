import java.util.Scanner;

class vertival {



   static void vertical(int n) {

      for(int i=1; i<=n; i++) {
         System.out.println(i);
      }
   }


   static void horizontal(int n) {

      for(int i=1; i<=n; i++) {

         System.out.print(i+" ");
      }
   }







   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);


      int n = scan.nextInt();
      

      vertical(n);

      horizontal(n);

   }
}