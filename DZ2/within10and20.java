/**
* Java 1. Homework #1
*
* @author Andrey Chuprin
* @version 15.12.2021
*/

public class within10and20 {
   public static boolean within10and20(int a, int b) { 
    int sum = a + b;
    if (sum > 10 && sum <= 20) return true;
    else return false;                               
    }
}


