
public class accessDemo {



   
   public static void main(String args[]) {

      Aadhaar pravin = new  Aadhaar();
   

      pravin.name = "pravin chavan";
      pravin.address = "at post ghodegoan tq sillod";
      pravin.date_of_birth = "15 january 2001";



      System.out.println(pravin);

      
   }



   
}




class Aadhaar {

   String name;

   String address;

   String date_of_birth;


   Aadhaar() {

   }


}

