package day05_Loops.Lcm_Hcf;
class demoLcm {
   
   static void lcm (int a,int b){

      for(int i=a;i<=a*b;i++){
         
         if( i%a==0 && i%b==0){
               
            System.out.println(i);
            break;
         }
      }
   }
   public static void main(String[] args) {
      lcm(15,20);
   
   }
   
}