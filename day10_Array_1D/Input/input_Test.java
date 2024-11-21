

// import java.util.*;

import java.util.Scanner;


class input_Test {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);

      /**
       *   Accepting input in array;
       * 
      */

      int[] arr = new int[5];

      // arr[0] = scan.nextInt();
      // arr[1] = scan.nextInt();
      // arr[2] = scan.nextInt();
      // arr[3] = scan.nextInt();
      // arr[4] = scan.nextInt();


      /*  
       * Accepting repeated input in array indexes
       * 
      */

      for(int i=0; i<arr.length; i++) {
         arr[i] = scan.nextInt();
      }

      // scan.useDelimiter("//d");
      

      /** 
       * 
       *   Printing Array using manually 
      */

      // System.out.println(arr[0]);
      // System.out.println(arr[1]);
      // System.out.println(arr[2]);
      // System.out.println(arr[3]);
      // System.out.println(arr[4]);

      /** 
       *   Printing Array using the Loops 
      */

      for(int j=0; j<arr.length; j++) {
         System.out.print(arr[j] + " ");
      }


   }
}