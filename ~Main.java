import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    /* A program meant for practicing the 
     * Java programming language
     */
    System.out.println("Hello World");
    System.out.println("I am learning Java!");
    System.out.println("It is awesome!");
    System.out.println(1);
    // this is a comment
    System.out.print(" is the lonliest number that you'll ever do.");

    String name = "John";

    System.out.println(name);

    int num = 15;
    num = 27;
    System.out.println(num);

    // if you want to make a variable immutable, you can use the 'final' keyword
    final String sentence = "You can't change this sentence without breaking the program.";

    System.out.println("Hello " + name);

    // in Java, you can declare mutliple variables of the same type at the same time
    //   using a comma separated list
    int x = 3, y = 4, z = 5;

    System.out.println(x + y + z);

    // you can assign the same value to multiple variables at the same time
    x = y = z = 50;

    System.out.println(x + y + z);

    // variables of the 'long' data type's values should end in the letter 'L'
    long bigNumber = 175000000000000000L;

    // you should end your 'float' declarations with the letter 'f'
    float decimal = 15.50f;

    // you should end your 'double' declarations with the letter 'd'
    double dubNum = 19.99d;

    /* The main difference between the 'float' type and the 'double' type is
     * that the 'float' type has only six or seven decimal digits of precision
     * while 'double' has about 15 decimal digits of precision
     */

    //  A floating point number can also be a scientific number with an "e" to indicate the power of 10:
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    // use ASCI values to print characters
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    /* CASTING: Widening casting is done automatically, while narrowing casting
     * has to be done manually with parentheses
     */

    int myInt = 8;
    double myDouble = myInt;

    double secondDouble = 9.78d;
    int secondInt = (int) myDouble;

    // there is for-each functionality in Java
    String[] animals = { "Giraffe", "Fox", "Otter", "Lion", "Anteater" };

    for (String i : animals) {
      System.out.println(i);
    }

    // you can use recursion in Java to streamline mathematical operations
    //   but you should be careful with it
    int result = factorial(10);
    System.out.println(result);

    // hashmaps are tools in Java that store information in key/value pairs
    //  hashmap keys and values don't have to be the same data type
    //  here we're creating a hashmap with a string key and a string value
    HashMap<String, String> captitalCities = new HashMap<String, String>();

    // you can add keys and values to the hashmap with the .put() method
    captitalCities.put("England", "London");
    captitalCities.put("Germany", "Berlin");
    captitalCities.put("Norway", "Oslo");
    captitalCities.put("USA", "Washington D.C.");
    System.out.println(captitalCities);

    // to access an item in the hashmap, use the .get() method and specify the key
    captitalCities.get("England");

    // to remove an item, use the .remove() method and specify the key
    captitalCities.remove("Norway");

    // use the .size() method to find the amount of items in the hashmap
    capitalCities.size();

    // you can loop through a hashmap with a for-each loop
    //   you can also specify whether you want to loop through the keys
    //   by using the .keySet() method or if you want to loop 
    //   through the values by using the .values() method
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }

    for (String i : capitalCities.values()) {
      System.out.println(i);
    }

    // print keys and values
    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }

    // to remove all items, use the .clear() method
    capitalCities.clear();

  }

  boolean isCorrect = false;
    
  public static int factorial(int k) {
    if (k > 0) {
      return k + factorial(k - 1);
    } else {
      return 0;
    }
  }

}
