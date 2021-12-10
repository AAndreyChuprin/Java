public class HomeWork {
   public static void main(String[] args) {
	  printThreeWords();
	  checkSumSign();
	  compareNumbers();
	  printColor();
   }
	
   public static void printThreeWords() {
      System.out.println("Orange");
      System.out.println("Banana");
	  System.out.println("Apple");
   }
   
   public static void checkSumSign() {
	   int a = -32;
	   int b = 10;
    System.out.println((a + b >= 0)? "polozhitelno" : "otridcatelno");
   }

   public static void compareNumbers() {
	   int a = 30;
	   int b = 50;
    System.out.println((a >= b)? "a >= b" : "a < b");
   }


    public static void printColor() {
      int value = -10;

      if (value <= 0) {
         System.out.println("Red");
      }
      if (value > 0 && value < 100) {
         System.out.println("Yelow");
      }
      if (value > 100) {
         System.out.println("Green");
      }
}
}