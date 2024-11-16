package day08_Scanner_class.AcceptInput;

import java.util.Scanner;

public class accept {
   
   public static void main(String args[]) {

      Scanner scan = new Scanner(System.in);


      System.out.println("Enter Chai Price");


      int chai = scan.nextInt();
      System.out.println(chai);

      float data = scan.nextFloat();
      System.out.println(data);

      double data2 = scan.nextDouble();
      System.out.println(data2);

      String data3 = scan.nextLine();     
      System.out.println(data3);

      char data4 = scan.next().charAt(0);
      System.out.println(data4);

      int data5 = scan.nextInt();
      System.out.println(data5);

      long data6 = scan.nextLong();
      System.out.println(data6);

      short data7 = scan.nextShort();
      System.out.println(data7);

      byte data8 = scan.nextByte(); 
      System.out.println(data8);

      boolean data9 = scan.nextBoolean();
      System.out.println(data9);

      scan.nextLine();
      scan.nextLine();
      

      scan.close();

   }
   
}
