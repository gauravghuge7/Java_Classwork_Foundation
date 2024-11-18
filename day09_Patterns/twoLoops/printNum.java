package day09_Patterns.twoLoops;

public class printNum {
   

   static void printNumbers() {


      for(int i=1; i<=10; i++) {

         for(int j =0; j<10;j++) {

            System.out.print("|"+((j * 10) + i)+"| ");
         }

         System.out.println();
      }


      int[] arr = new int[];   // fixed array 


      arr[6] = 56;

      int[] arr2 = {1,2,3,4, 56, 78, 78,90, 89};

   }


   public static void main(String[] args) {
      printNumbers();
   }
}
