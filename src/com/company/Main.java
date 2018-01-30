//You are going to accept customer information from a user. You will ask them if they are a residential or business customer. If they are a residential customer you will accept their name and phone number. If they are a business customer you will accept their business name, contact name, and phone number.
// Create an overloaded method with two signatures, pass the appropriate parameters into the method and display the information correctly on the screen. Implement both methods.

package com.company;
import java.util.Scanner;// import package for user input
public class Main {

    public static void main(String[] args) {
// -------------- declare/initialize main variables ----------------
        int number;
        Scanner input = new Scanner(System.in);// Initialize input for do:while loop
        do{
            System.out.println("             Customer Information");
            System.out.println("For a RESIDENTIAL account, please enter 1");
            System.out.println("For a BUSINESS account, please enter 2");
            number = input.nextInt();
        }while(number !=1 && number != 2 );
//---------------- switch case for user reply --------------------
        switch (number) {
            case 1:// -------------- RESIDENTIAL customer ----------------
                System.out.println("Please enter the customer name: ");
                String custName = input.next();
                System.out.println("Please enter the customer phone number: ");
                String custPhone = input.next();
                customerInfo (custName, custPhone);
                break;
            case 2: //  ----------------- BUSINESS customer ---------------
                System.out.println("Please enter the name of the business: ");
                String busiName = input.next();
                System.out.println("Please enter the business phone number: ");
                String busiPhone = input.next();
                System.out.println("Please enter a contact name: ");
                String contact = input.next();
                customerInfo (busiName, busiPhone, contact);
                break;
        }
    }
    // ------------- define all methods below this section ----------------------
    private static void customerInfo (String name, String phone) {
        System.out.println("   Residential Customer");
        System.out.println("Customer: " + name);
        System.out.println("Phone Number: " + phone);
    }
    private static void customerInfo (String name, String phone, String contact) {
        System.out.println("    Business Customer");
        System.out.println("Business Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Contact Person: " + contact);
    }

}
