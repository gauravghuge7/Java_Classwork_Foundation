

class introduction {



   static boolean primeNumber(int a) {

      if( a == 1) return false;

      for(int i = a-1; i > 1; i--) {

         if(a % i == 0) return false;
      }

      return true;
   }


   public static void main(String args[]) {

      
      for(int i=1; i<=50; i++) {

         if(primeNumber(i) == true) {
            System.out.print(i+" ");
         }
      }
      

   }
}