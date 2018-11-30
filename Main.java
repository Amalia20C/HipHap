import java.util.ArrayList;
import java.util.Scanner;
      //these 2 are for the SetData thing because i tried to put it into main directly 
      //and it actually works so maybe we keep it like this but it doesnd matter for now
///import java.io.*;
//import java.util.*;

public class Main {

 // main array which stores employees
 private static ArrayList < Employee > employees = new ArrayList < > ();
 // ArrayList which stores events
 private static ArrayList < Event > events = new ArrayList < > ();
 
 // we are gonna just leave this here for now, maybe we create statistic as well 
 //private static ArrayList<Statistic> statistics = new ArrayList<>();

 // creating a scanner object
 private static Scanner scanner = new Scanner(System.in);
 // holds logged in Employee
 private static Employee currentEmployee;

 public static void main(String[] args) {
   //this is just shit from the SetData thing :D
 //setEmployeeData();
 //setEventData();
 //setPartnerData();
 
 
  // show the main screen
  showMainScreen();
 }

 /**
  * Shows the Main screen with available options
  * Then the user has to  choose an option
  * */

 private static void showMainScreen() {
  System.out.println("==== HipHapOrg ====");
  System.out.println();
  System.out.println("1. Register new employee");
  System.out.println("2. Log in");

  //get option for the user using the helping class
  int option = HelperOptionsSCREEN.chooseOption(1, 2);

  if (option == 1) showRegistrationScreen();
  else showLoginScreen();
 }


 /**
  * Show Login screen
  * Ask the user for the id
  * and then
  * Ask the user for the password
  * */
 private static void showLoginScreen() {
  System.out.println("==== Login ====");

  System.out.println("Type \"exit\" to open main page");
  System.out.print("Id: ");
  String id = scanner.nextLine();

  // Coming back to Main page
  if (id.equals("EXIT")) {
   showMainScreen();
   return;
  }

  System.out.print("Password: ");
  String password = scanner.nextLine();

  for (int i = 0; i < employees.size(); i++) {
   if (id.equals(employees.get(i).getId())) {
    if (password.equals(employees.get(i).getPassword())) {
     // user is now Logged in
     // here we save as an current employee
     currentEmployee = employees.get(i);
     // show user screen which is not finished yet but will be until Sunday :D
     //showUserScreen();
     return;
    } else {
     System.out.println("=== Wrong username or password ===");
     showLoginScreen();
    }
   }
  }

  System.out.println("=== Wrong username or password ===");
  showLoginScreen();
 }


 /**
  * Shows the registrationScreen with the options
  * Asks the user for details in order to create a new Employee object
  * */
 private static void showRegistrationScreen() {
  System.out.println("==== Registration ====");
  String[] newEmployeeInfo = {
   "ID: ",
   "Password: ",
   "Name: ",
   "email: "
  };

  for (int i = 0; i < newEmployeeInfo.length; i++) {
   System.out.print(newEmployeeInfo[i]);
   newEmployeeInfo[i] = scanner.nextLine();
  }

  // creates a new Employee and add it to the arrayList
  Employee newEmployee = new Employee(newEmployeeInfo[0], newEmployeeInfo[1], newEmployeeInfo[2], newEmployeeInfo[3]);

  System.out.println("=== Successfully registered ===");
  // save the new Employee into the employees ArrayList
  employees.add(newEmployee);

  showMainScreen();
 }

//I'll finish this later this weekend

 
 /** Show the User screen
  * show the list of available options for the logged in user of the system
  * if the user is a manager, show the additional options he can have (like seeing the statistics)
  * */
  
  //this should work but I dont have yet ideas so I'll just leave it for now. You can do it if you got ideas
  
 /*private static void showUserScreen() {
  String[] options = {
   "option1 ",
   "option2",
   "option3",
   "option4",
   "option5"
  };

  System.out.println("==== Dashboard ====");

  for (int i = 0; i < options.length; i++) {
   if (i == 4 && !currentCustomer.isManager) {
    continue;
   }
   System.out.println(i + ". " + options[i]);
  }

  // get option from the user
    int option = HelperOptionsSCREEN.chooseOption(0, ( currentCustomer.isManager ? 4 : 3 ));

    switch(option) {
        case 0:
            System.out.println("=== Successfully logged out ===");
            System.out.println();
            System.out.println();
            showMainScreen();
            break;
        case 1:
            //bla bla we got to figure out which options we will have 
            break;
        case 2:
            //bla bla again :d
            break;
        case 3:
            // just some crap ideas I'm losing my time
            break;
        case 4:
            //why the fuck am I leaving this comms?=)))
            break;
    }
      } */
  
  

  /**
   * Shows the create event screen
   * Asks the user for details in order to create a new Event object
   * */
  public static void createEventScreen() {

   System.out.println("==== CREATE ====");

   String[] newEventInfo = {
    "Id: ",
    "Name: ",
    "Type: ",
    "Date: ",
    "Location: ",
    "Event price: "
   };

   for (int i = 0; i < newEventInfo.length; i++) {
    System.out.print(newEventInfo[i]);
    newEventInfo[i] = scanner.nextLine();
   }

   // create a new Event and add it to the arrayList
   Event newEvent = new Event(newEventInfo[0], newEventInfo[1], newEventInfo[2], newEventInfo[3], newEventInfo[4], Double.parseDouble(newEventInfo[5]));

   System.out.println("=== Successfully created ===");
   // save the new Event into the events ArrayList
   events.add(newEvent);

   showMainScreen();
  }
  
  //and this is just copy paste from the SetData class, and it works properly in the main <3 
  //this is just in case we wont figure it out how to call the class
  
               // ?????????????????????????????????????????????????
               // READ THIS PLEASE
               // all this things are woking if we use them normally, not using the text files....
               // so the BIGGGGGGGGEST issue we have right now is how to use in the program the information from the text files...
               // because what Amalia did is super good but i guess it just creates the arrays and displays...
               //the info just doesnt stay in the "system" so we kinda cant use it 
               //but WE WILL FIX IT!! 
               
//============================================================================================  
/*  static Scanner x;
 static Scanner user = new Scanner(System.in);
 
 public static void setEmployeeData() {
  // creates objects of employees
  ArrayList < Employee > employees = new ArrayList < > ();
  try {
   String fileName = "Employee";

   File myFile = new File(fileName + ".txt");
   Scanner x = new Scanner(myFile);

   while (x.hasNext()) {
    String a = x.next();
    Employee em = new Employee();
    String[] emVar = a.split(":");
    em.setId(emVar[0]);
    em.setName(emVar[1]);
    em.setPassword(emVar[2]);
    em.setEmail(emVar[3]);
    //System.out.println("ID: " + emVar[0] + " Name: " + emVar[1] + " Password: " + emVar[2] + " Email: " + emVar[3]);


    employees.add(em);
   }
  } catch (IOException e) {
   System.out.println("No itmes match your search.");
  }
 }




 public static void setEventData() {
  // creates objects of events
  ArrayList < Event > events = new ArrayList < > ();
  try {
   String fileName = "Event";

   File myFile = new File(fileName + ".txt");
   Scanner x = new Scanner(myFile);

   while (x.hasNext()) {
    String a = x.next();
    String[] evVar = a.split(":");
    Event ev = new Event(evVar[0], evVar[1], evVar[2], evVar[3], evVar[4], Double.parseDouble(evVar[5]));
    //System.out.println("ID: " + evVar[0] + " Name: " + evVar[1] + " Type: " + evVar[2] + " Date: " + evVar[3] + "Location: " + evVar[4] + "Price: " + evVar[5]);

    events.add(ev);
   }
  } catch (IOException e) {
   System.out.println("No itmes match your search.");
  }
 }


 public static void setPartnerData() {
  // creates objects of partners
  ArrayList < Partner > partners = new ArrayList < > ();
  try {
   String fileName = "Partner";

   File myFile = new File(fileName + ".txt");
   Scanner x = new Scanner(myFile);

   while (x.hasNext()) {
    String a = x.next();
    String[] paVar = a.split(":");
    Partner pa = new Partner(paVar[0], paVar[1], Double.parseDouble(paVar[2]));
    //System.out.println("Name: " + paVar[0] + "Service: " + paVar[1] + "Price: " + paVar[2]);

    partners.add(pa);
   }
  } catch (IOException e) {
   System.out.println("No itmes match your search.");
  }
 }

*/
//=============================================================================================  

 }
