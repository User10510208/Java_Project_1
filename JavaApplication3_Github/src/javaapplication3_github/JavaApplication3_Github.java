package javaapplication3_github;

public class JavaApplication3_Github {

    public static void main(String[] args) {
        
        /* Variable Initialization */
        
        String myID = "10510208";
        String myName = "Zachary";     //PLEASE ADD USERINPUT LATER
        String myAge = "18";
        String myGender = "Male";
        
        //joiniing invoice variables 
        
        String invoiceString = (myID + " | " + myName + " | " + myAge + " | " +  myGender);

        /* Printing */
        
        System.out.println("This is my first project using Java");
        System.out.println("My name is " + myName);
        
        // Invoice
        System.out.println("This is an invoice");
        System.out.println("ID" + " | " + "Name" + " | " + "Age" + " | " + "Gender");
        // System.out.println(myID + " | " + myName + " | " + myAge + " | " + myGender); old attempt??
        System.out.println(invoiceString);
        
    }
    
}
