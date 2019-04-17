package com.class24;

public class Task {

/*1. Create 1 class with a static method that has 3 overloaded forms. 
    Then call each overloaded method with specific arguments and observe result.
  2. Create 1 class with a private method that has 3 overloaded forms. 
    Then call each overloaded method with specific arguments and observe result. (edited) 
 */


public static void print() {
    System.out.println("Hello");
}
public static void print(String a) {
    System.out.println("Hello "+ a);
}
public static void print(String a,String b) {
    System.out.println("Hello " +a+" "+b);
}
private static void list() {
    System.out.println("Hello");
}
private static void list(String a) {
    System.out.println("Hello "+ a);
}
private static void list(String a,String b) {
    System.out.println("Hello " +a+" "+b);
}


public static void main(String[] args) {
   Task a=new Task();
   Task.print();
   Task.print("World");
   Task.print("World","Java");
   Task.list();
   Task.list("World");
   Task.list("World","Java");
}
}