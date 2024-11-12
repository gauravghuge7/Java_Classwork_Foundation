



class car {

   String name;
   int speed;
   
   //  Default Contructor
   car() {

   }


   // setter 
   void insert(String name, int speed) {   
      this.name = name;
      this.speed = speed;
   }


   void display() {

      System.out.println(name);
      System.out.println(speed);
   }

}




class demoSetters {



   public static void main(String args[]) {

      car alto = new car();

      alto.insert("ALTO", 160);

      // alto.name = "ALTO";
      // alto.speed = 160;


      // System.out.println(alto.name);

      alto.display();

      

   }




}



// class design kara jo mobile class define kara ani tyala define kara


