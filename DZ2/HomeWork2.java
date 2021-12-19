/**
* Java 1. Homework #2
*
* @author Andrey Chuprin
* @version 15.12.2021
*/

public class HomeWork2 {
   public static void main(String[] args) {
    System.out.println(isNegative(2));
    System.out.println(isNegative(-3));

    isPositiveOrNegative(-2);
    isPositiveOrNegative(2);

    printWordTimes("Hello!!", 1);

    System.out.println(within10and20(4, -8));
   }
   
    static boolean isNegative(int a) {
    if(a < 0) return true;
    else {
    return false;
   }
 }
 
    static void isPositiveOrNegative(int a) {
   if (a >= 0);
   System.out.println(a >= 0? "polozhitelno1" : "otridcatelno1");
   }
   
    static void printWordTimes(String s, int count) {
      for (int i = 0; i < count; i++) {
   System.out.println(s);
   }
 }
 
    static boolean within10and20(int a, int b) { 
    int sum = a + b;
    if (sum > 10 && sum <= 20) return true;
    else return false;
    }
}