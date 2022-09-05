package assignments.java_programming;

import java.util.Scanner;

public class Assignment090122 {
  /*
   * Create a form that collects and stores information of a user
   * and prints them out in a tabular format
   * 
   * AS-IN
   * Name: User's name
   * Class: User's class
   * 
   * HINT: You will use an array to display the data taken from
   */
  public static void main(String[] args) {
    String UserName, UserClass, Userlikesandislikes;

    Scanner takeInput = new Scanner(System.in);
    System.out.print("Input name: ");
    UserName = takeInput.nextLine();
    System.out.print("Input class: ");
    UserClass = takeInput.nextLine();
    System.out.print("Input likes and dislikes: ");
    Userlikesandislikes = takeInput.nextLine();

   String[][] listArrayofUser = new String[2][1];
    for (int Firstindex = 0; Firstindex < listArrayofUser.length; Firstindex++) {
     for (int Secondindex = 0; Secondindex < listArrayofUser.length; Secondindex++) {
      
     }

       System.out.println ();

      }
      
    takeInput.close();
  }
}