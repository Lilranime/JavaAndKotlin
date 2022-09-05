package assignments.java_programming;

public class Assignment090122_1 {
    /*Create a class,
    initialize the class
    and change the values of the members 
    
    HINT: The class can be anything you want, and also, 
    feel free to create separate files for the classes (preferred)
    but if you create sparate files for separate classes, make sure this is the main
    class
    */
    
   public static void main(String[] args) {
    Phone myPhone = new Phone();
    myPhone.colourOfPhone ="Blue";
    myPhone.canCharge = true;
    myPhone.isPhoneOn = true;

    //change value
    Phone nyPhone2Phone =new Phone();
   myPhone.colourOfPhone = "red";
   myPhone.canCharge = false;
   myPhone.isPhoneOn = false;

    System.out.println("coThe lour of my phone"+" =" +" "+ myPhone.colourOfPhone);
   
   }
    

}