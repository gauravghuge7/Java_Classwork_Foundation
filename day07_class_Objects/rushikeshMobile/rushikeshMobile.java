


class mobile {
   
   String name;   // S is small
   int storage ;
   int ram ;
   int battery ;
   int price;
   



   mobile () {
   }

   void insert (String N, int S, int R , int B, int P) {   /// S is the small in String keyword
      
      name = N;
      storage = S;
      ram = R;
      battery= B;
      price= P;
   }
   void display() {


      System.out.println(name);
      System.out.println(storage);
      System.out.println(ram);
      System.out.println(battery);
      System.out.println(price);

   }

}



class Main {
   public static void main(String[] args) {
      
      mobile realme = new mobile ();
         
      realme.insert("narzo", 256 ,8 ,4500 , 30000);   // use object name rather than className
      
      realme.display();  


      


      
   }
}