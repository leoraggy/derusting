public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float myFloat = -1.2f;
    System.out.println("my float: " + myFloat);
    // Create an int with a positive value and assign it to a variable
    int number = 20;
    System.out.println("number: " + number);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = number % 3;
    System.out.println("20 % 3 = " +remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    if(number % 2 == 0){
      System.out.println(number + " is even!");
    }else{
      System.out.println(number + " is odd!");
    }

    // Divide the number by another number using integer division

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

     int solution = number / 4;
     System.out.println(number + " / 4 = " + solution);

  }
}
