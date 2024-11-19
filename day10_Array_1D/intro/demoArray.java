package day10_Array_1D.intro;

import java.util.Scanner;

public class demoArray {
   
   public static void main(String[] args) {
      
      int[] arr = new int[6];

      // System.out.println(arr[0]);

      Scanner scan = new Scanner(System.in);

      // System.out.println(arr.length);

      for(int i=0; i<arr.length; i++) {

         arr[i] = scan.nextInt();
         System.out.println(arr[i]);
      }

   }
}
