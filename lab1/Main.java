//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Muso
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");
  
    int[] values = {5, 9, 3, 12, 7, 3, 11, 5};
    
    int i = 0;
    while(i < values.length) {System.out.println(values[i++]);};
    for(i = values.length - 1; i >= 0; --i) {System.out.println(values[i]);};
    
    System.out.println(values[0]);
    System.out.println(values[values.length - 1]);
    System.out.println("Min: " + Lab1.min(1,9));
    System.out.println("Max: " + Lab1.max(3, 4));
    System.out.println("Average: " + Lab1.average(4, 6));
    System.out.println("Sum: " + Lab1.sum(10,6));
  }

}     

// Add all of the methods here
class Lab1 {
  int a;
  public static int max(int a, int b) {
    if(a > b) {return a;} else {return b;} 
  }
  public static int min(int a, int b) {
    if(a < b) {return a;} else {return b;} 
  }
  public static int sum(int a, int b) {
    return a + b;
  }
  public static int average(int a, int b) {
    int sum = a + b;
    return sum / 2; 
  }
  public int increment(int num) {
    return ++num;
  }
}