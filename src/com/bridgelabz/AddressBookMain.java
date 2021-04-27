package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	
 public static void main(String[] args) {
	 
	System.out.println("Welcome to Address Book Program");
	 Scanner scanner= new Scanner(System.in);
     AddressBookImpl addressBook =new AddressBookImpl();
     boolean condition = true;
     while (condition == true)
     {
         System.out.println("1_AddPerson  2_DisplayPerson  3_EditPerson  4_DeletePerson  5_SortByName_Or_Zip  6_Quit_From_It");
         int choice = scanner.nextInt();
         switch (choice)
         {
             case 1:
                 addressBook.add();
                 break;
             case 2:
                 addressBook.display();
                 break;
             case 3:
                 System.out.println("Enter person's First name");
                 String name=scanner.next();
                 addressBook.edit(name);
                 break;
             case 4:
                 System.out.println("Enter person's name");
                 String firstName=scanner.next();
                 addressBook.deletePerson(firstName);
                 System.out.println("Person's data successfully delete");
                 break;
             case 5:
                 addressBook.sortByfirstName();
             case 6:
                 addressBook.sortByZipcode();
             case 7:
                 addressBook.addMultiplePerson();
             case 8:
                 System.out.println("Press 1 to view by city and 2 to view by State");
                 int Option = scanner.nextInt();
                 if (Option == 1)
                 {
                     System.out.println("Enter city name");
                     String city = scanner.next();
                     addressBook.viewByCity(city);
                     break;
                 }
                 else
                 {
                     System.out.println("Enter state name");
                     String state = scanner.next();
                     addressBook.viewByState(state);
                     break;
                 }
             case 10:
                 System.out.println("press 1 to search person in City and 2 to search person in  State");
                 int localOption1 = scanner.nextInt();
                 if (localOption1 == 1)
                 {
                     System.out.println("Enter Person FirstName");
                     String firstname = scanner.next();
                     addressBook.searchPersonInCity(firstname);
                     break;
                 }
                 else
                 {
                     System.out.println("Enter State SirstName");
                     String firstname = scanner.next();
                     addressBook.searchPersonInState(firstname);
                     break;

                 }
             case 9:
                 condition = false;
                 break;
             default:
                 System.out.println("Please enter the valid value");
                 continue;
         }
     }
  }
 
}
