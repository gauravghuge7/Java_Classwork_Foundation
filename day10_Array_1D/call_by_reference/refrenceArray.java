


class refrenceArray {



   static void checkingArray(int[] arr) {
      arr[0] = 100;
   }

   public static void main(String args[]) {

      int[] nums = new int[5];

      nums[0] = 25;

      // int[] rutu = nums;

      int[] rutu = nums.clone();

      

      System.out.println("before function calling nums "+ nums[0]);  // 25
      System.out.println("before function calling  rutu "+ rutu[0]); // 25

      checkingArray(rutu);

      System.out.println("After function calling nums "+ nums[0]); // 100
      System.out.println("After function calling rutu "+ rutu[0]); // 100
   }
}