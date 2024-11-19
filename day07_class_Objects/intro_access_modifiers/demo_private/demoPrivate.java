


class car {

   private String color;

   private String carName;


   String getColor() {
      
      return color;
   }

   void setColor(String color) {
      this.color = color;
   }

}




public class demoPrivate {
   
   public static void main(String args[]) {

      car alto = new car();

      alto.setColor("white");

      String color = alto.getColor();

      System.out.println(color);


   }

}
