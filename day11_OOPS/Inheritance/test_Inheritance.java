package day11_OOPS.Inheritance;


class car {

   String name;
   int price;
   String color;
   int speed;

   /** 
    * this is the default constructor
   */
   car(){

   }


   /**
    * Getters of the class 
    * @return
   */
   String getName(){
      return this.name;
   }

   int getPrice() {
      return this.price;
   }

   String getColor() {
      return this.color;
   }

   int getSpeed() {
      return this.speed;
   }

   /**
    * Setter of the class
    * @param name
   */
   void setName(String name) {
      this.name = name;
   }

   void setColor(String color) {
      this.color = color;
   }

   void setSpeed(int speed) {
      this.speed = speed;
   }

   void setPrice(int price) {
      this.price = price;
   }

}


class low_car extends car {
   boolean nonAc;
   int low_speed;

   boolean isPowerStearing;
   int gear;

   /** 
    * default constructor 
   */
   
   low_car() {
      super();

      // car alto = new car();

      // System.out.println(alto.price);
   }

   String carName = name;

   

}



class test_Inheritance {



   public static void main(String[] args) {
      
      low_car alto = new low_car();

      
      

   }
}