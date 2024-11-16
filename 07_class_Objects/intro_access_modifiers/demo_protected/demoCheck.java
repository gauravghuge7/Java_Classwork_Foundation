


class car {

   protected String color;

   void setColor(String color) {

      this.color = color;
   }

   String getter() {
      return this.color;
   }


}





public class demoCheck {
   
   
   public static void main(String[] args) {
      

      car alto = new car();

      alto.setColor("white");


      System.out.println(alto.color);


   }
}