import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

 // main array which stores employees
 public static ArrayList < Employee > employees = new ArrayList < > ();

 // ArrayList which stores events
 private static ArrayList < Event > events = new ArrayList < > ();

 // ArrayList which stores partners
 private static ArrayList < Partner > partners = new ArrayList < > ();

 // ArrayList which stores customers
 private static ArrayList < Customer > customers = new ArrayList < > ();

 // we are gonna just leave this here for now, maybe we create statistic as well 
 //private static ArrayList<Statistic> statistics = new ArrayList<>();

 // creating a scanner object
 private static Scanner scanner = new Scanner(System.in);
 // holds logged in Employee
 private static Employee currentUser;

 public static void main(String[] args) {
  setEmployeeData();
  setEventData();
  setPartnerData();
  setCustomerData();
  //Show the Main Screen
  showMainScreen();
 }

 /**1
  * Shows the Main screen with available options
  * Then the user has to  choose an option
  * */

 public static void showMainScreen() {
  System.out.println(" _________________________");
  System.out.println("|   ~~~~ HipHapOrg ~~~~   |");
  System.out.println("|-------------------------|");
  System.out.println("|1. Register new employee |");
  System.out.println("|2. Log in                |");
  System.out.println("|_________________________|");

  //get option for the user using the helping class
  int option = HelperOptionsSCREEN.chooseOption(1, 2);

  if (option == 1) showRegistrationScreen();
  else showLoginScreen();
 }

 private static void showRegistrationScreen() {
  System.out.println("==== Registration ====");
  try {
   System.out.print("ID: ");
   String id = scanner.nextLine();
   System.out.print("Name: ");
   String name = scanner.nextLine();
   System.out.print("Password: ");
   String password = scanner.nextLine();
   System.out.print("Email: ");
   String email = scanner.nextLine();
   System.out.print("isManager: ");
   String isManager = scanner.nextLine();
   BufferedWriter writer = new BufferedWriter(new FileWriter("Employee.txt", true));
   writer.append("\r\n");
   writer.append(id);
   writer.append(":");
   writer.append(name);
   writer.append(":");
   writer.append(password);
   writer.append(":");
   writer.append(email);
   writer.append(":");
   writer.append(isManager);

   writer.close();
   setEmployeeData();

   currentUser = employees.get(employees.size() - 1);

  } catch (IOException e) {
   System.out.println("No itmes match your search.");

  }
  for (int i = 0; i < employees.size(); i++) {

   boolean checkIfManager = Boolean.parseBoolean(employees.get(i).getIsManager());
   if (checkIfManager) {
    showManagerScreen();

   } else {
    showEmployeeScreen();
   }
  }
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
     /*user is now Logged in
     here we save as an current employee*/

     boolean checkIfManager = Boolean.parseBoolean(employees.get(i).getIsManager());
     if (checkIfManager) {
      currentUser = employees.get(i);
      showManagerScreen();
     } else {
      currentUser = employees.get(i);
      showEmployeeScreen();
     }
     //currentUser = employees.get(i);
    } else {
     System.out.println("=== Wrong username or password ===");
     showLoginScreen();
    }
   }
  }
 }

 /** Show the Employee screen
  * show the list of available options for the logged in user of the system
  * if the user is a manager, show the additional options he can have (like seeing the statistics)
  * */

 private static void showEmployeeScreen() {
   String[] options = {
    " Exit ",
    " Create Event ",
    " Edit Event ",
    " Delete Event ",
    " Send notification to Customer "
   };
   System.out.println("==== Dashboard ====");
   for (int i = 0; i < options.length; i++) {
    System.out.println(i + ". " + options[i]);
   }

   // get option from the user
   int option = HelperOptionsSCREEN.chooseOption(0, 4);
   switch (option) {
    case 0:
     System.out.println("=== Successfully logged out ===");
     System.out.println();
     System.out.println();
     showMainScreen();
     break;
    case 1:
     //Create new Event
     System.out.println("==== Create a new event ====");
     try {
      System.out.print("ID: ");
      String id = scanner.nextLine();
      System.out.print("Name: ");
      String name = scanner.nextLine();
      System.out.print("Type: ");
      String type = scanner.nextLine();
      System.out.print("Date: ");
      String date = scanner.nextLine();
      System.out.print("Location: ");
      String location = scanner.nextLine();
      System.out.print("Price: ");
      Double eventPrice = scanner.nextDouble();
      BufferedWriter writer = new BufferedWriter(new FileWriter("Event.txt", true));
      writer.append("\r\n");
      writer.append(id);
      writer.append(":");
      writer.append(name);
      writer.append(":");
      writer.append(type);
      writer.append(":");
      writer.append(date);
      writer.append(":");
      writer.append(location);
      writer.append(":");
      writer.append(currentUser.getName());
      writer.append(":");
      private static ArrayList < Drink > drinks = new ArrayList < > ();
      /* make new method setDrinksData() ( go with for loop through partner.size and if partner.get(i).equals("drinks") adds to drink arraylist
      drinks.add(partners.get(i)
      */
      private static ArrayList < Food > food = new ArrayList < > ();
      /* make new method setFoodsData() ( go with for loop through partner.size and if partner.get(i).equals("food") adds to food arraylist
            drinks.add(partners.get(i)
            */
      private static ArrayList < Music > music = new ArrayList < > ();
      /* make new method setMusicsData() ( go with for loop through partner.size and if partner.get(i).equals("music") adds to music arraylist
            drinks.add(partners.get(i)
            */
      String[] options = {
       " Exit ",
       " Add drinks ",
       " Add music ",
       " Add food ",
       " End creating event"
      };
      // make a new method for this adding option screen optionScreen() so after option it can go back to options if u want to add more
      int option = scanner.nextInt();
      /*
        CREATE A NEW FILE WITH EVENT NAME new File (name + ".txt) in order to store partners if employee chooses to add drinks/food/music
        
        IF OPTION == 1 && == 2 && ==3 then it creates the file
      */
      switch (option) {
       case 1:
        for (int i = 0; i < drinks.size; i++) {
         System.out.println(i + 1 + ". " + drinks.get(i).getName() + " " + drinks.get(i).getPrice();
         }
         System.out.println("Choose your drink provider: ");
         int answer = scanner.nextInt();
         eventPrice += drinks.get(option - 1).getPrice();
         // ADDS ALL THE INFO TO THE FILE INSERT CODE HERE
         break;

         case 2:
          for (int i = 0; i < music.size; i++) {
           System.out.println(i + 1 + ". " + music.get(i).getName() + " " + music.get(i).getPrice();
           }
           System.out.println("Choose your music provider: ");
           int answer = scanner.nextInt();
           eventPrice += music.get(option - 1).getPrice();
           // ADDS ALL THE INFO TO THE FILE INSERT CODE HERE
           break;


           case 3:
            for (int i = 0; i < food.size; i++) {
             System.out.println(i + 1 + ". " + food.get(i).getName() + " " + food.get(i).getPrice();
             }
             System.out.println("Choose your food provider: ");
             int answer = scanner.nextInt();
             eventPrice += food.get(option - 1).getPrice();
             // ADDS ALL THE INFO TO THE FILE INSERT CODE HERE
             break;
            }
            writer.append(Double.toString(eventPrice)); //adds the total price to the file
            writer.close();
            setEventData();
            break;

           case 2:
            //Edit an existing Event
            System.out.println("Need to fix this!");
            break;

           case 3:
            //Delete an existing Event
            System.out.println("Need to fix this!");
            break;

           case 4:
            //Send notificaton to customer 
            System.out.println("==== Send info-notification to customers ====");
            System.out.println("Type \"exit\" to open the userScreen page");
            System.out.print("The name of the customer: ");
            String nameCustomer = scanner.nextLine();
            int aux1 = 0;
            // Coming back to Main page
            if (nameCustomer.equals("EXIT")) {
             showEmployeeScreen();
             return;
            }
            System.out.print("The email of the customer: ");
            String emailCustomer = scanner.nextLine();

            for (int i = 0; i < customers.size(); i++) {

             if (nameCustomer.equals(customers.get(i).getName())) {
              if (emailCustomer.equals(customers.get(i).getEmail())) {
               aux1 = i;
               System.out.println("Customer available! ");
              } else {
               System.out.println("This customer does not exist! ");
               showEmployeeScreen();
              }
             }
            }

            System.out.print("The ID of the event: ");
            String idEvent = scanner.nextLine();
            int aux2 = 0;
            boolean eventFound = false;
            for (int j = 0; j < events.size(); j++) {

             if (idEvent.equalsIgnoreCase(events.get(j).getId())) {
              System.out.println("Hello, Mr/Mrs " + customers.get(aux1).getName() + " !");
              System.out.println("We are looking forward to seeing you at the event you signed up for, named " + events.get(j).getName() + ", taking place at " + events.get(j).getLocation() + ", which will be held on " + events.get(j).getDate() + ".");
              System.out.println("The price of the event is " + events.get(j).getEventPrice() + ". ");
              eventFound = true;
              break;
             }
            }
            if (!eventFound) {
             showEmployeeScreen();
            }
           case 5:
            //Show the accounting
            System.out.println("Need to fix this!");
            break;
          }
        }

        private static void showManagerScreen() {
         String[] options = {
          " Log out ",
          " Employees Details ",
          " Events Details ",
          " Partners Details "
         };
         System.out.println("==== Dashboard ====");
         for (int i = 0; i < options.length; i++) {
          System.out.println(i + ". " + options[i]);
         }
         // get option from the user
         System.out.println("");
         int option = HelperOptionsSCREEN.chooseOption(0, 3);
         switch (option) {
          case 0:
           System.out.println("=== Successfully logged out ===");
           System.out.println();
           System.out.println();
           showMainScreen();
           break;
          case 1:
           showEmployeeList();
           break;
          case 2:
           showEventsList();
           break;
          case 3:
           showPartnersList();
           break;
         };
        }

        public static void showEventsList() {

         String[] options = {
          "Log out ",
          "View event list ",
          "Statistics"
         };
         System.out.println("==== Dashboard ====");
         for (int i = 0; i < options.length; i++) {
          System.out.println(i + ". " + options[i]);
         }
         // get option from the user
         System.out.println("");
         int option = HelperOptionsSCREEN.chooseOption(0, 2);
         switch (option) {
          case 0:
           System.out.println("=== Successfully logged out ===");
           System.out.println();
           System.out.println();
           showMainScreen();
           break;
          case 1:
           for (int i = 0; i < events.size(); i++)
            events.get(i).eventList();
           break;
          case 2:
           System.out.println("Total events made: " + events.size());
           double sum = 0;
           for (int i = 0; i < events.size(); i++) {
            double price = Double.parseDouble(events.get(i).getEventPrice());
            sum += price;
           }
           System.out.println("Total money circulated in the events: " + sum);
           break;
         }
        }

        public static void showEmployeeList() {
         String[] options = {
          "Log out ",
          "View employee list ",
          "Employee's made events "
         };
         System.out.println("==== Dashboard ====");
         for (int i = 0; i < options.length; i++) {
          System.out.println(i + ". " + options[i]);
         }
         // get option from the user
         System.out.println("");
         int option = HelperOptionsSCREEN.chooseOption(0, 2);
         switch (option) {
          case 0:
           System.out.println("=== Successfully logged out ===");
           System.out.println();
           System.out.println();
           showMainScreen();
           break;
          case 1:
           for (int i = 0; i < employees.size(); i++)
            employees.get(i).employeeList();
           break;
          case 2:
           System.out.println("Enter employee's name: ");
           boolean employeeFound = false;
           boolean eventsFound = false;
           String nm = scanner.next();
           for (int i = 0; i < employees.size(); i++) {
            if (nm.equals(employees.get(i).getName())) {
             currentUser = employees.get(i);
             employeeFound = true;
             break;
            }

           }
           if (!employeeFound) {
            System.out.println("=== Wrong employee name ===");
            showEmployeeList();
           } else {
            for (int j = 0; j < events.size(); j++) {
             if (nm.equals(events.get(j).getEmployee())) {
              eventsFound = true;
              System.out.println(events.get(j).getName());
             }
            }

            if (!eventsFound) {
             System.out.println("The employee has no events");
             showEmployeeList();
            }
           }
           break;
         }
        }

        public static void showPartnersList() {

         String[] options = {
          "0. Log out ",
          "1. View Partner list "
         };
         System.out.println("==== Dashboard ====");
         for (int i = 0; i < options.length; i++) {
          System.out.println(i + ". " + options[i]);
         }
         // get option from the user
         System.out.println("");
         int option = HelperOptionsSCREEN.chooseOption(0, 1);

         switch (option) {
          case 0:
           System.out.println("=== Successfully logged out ===");
           System.out.println();
           System.out.println();
           showMainScreen();
           break;
          case 1:
           for (int i = 0; i < partners.size(); i++)
            partners.get(i).partnerList();
           break;
         }

        }

        //============================================================================================  
        static Scanner x;
        static Scanner user = new Scanner(System.in);

        public static void setEmployeeData() {
         // creates objects of employees
         try {
          String fileName = "Employee";

          File myFile = new File(fileName + ".txt");
          Scanner x = new Scanner(myFile);
          while (x.hasNext()) {
           String a = x.next();
           String[] emVar = a.split(":");

           Employee em = new Employee(emVar[0], emVar[1], emVar[2], emVar[3], emVar[4]);
           //System.out.println("ID: " + emVar[0] + "     Name: " + emVar[1] + "     Password: " + emVar[2] + "     Email: " + emVar[3] + "     isManager: " + Boolean.parseBoolean(emVar[4]));

           employees.add(em);
           //  System.out.println(employees.size());
          }
          System.out.println();

         } catch (IOException e) {
          System.out.println("No items match your search.");
         }
        }

        public static void setEventData() {
         // creates objects of events
         try {
          String fileName = "Event";

          File myFile = new File(fileName + ".txt");
          Scanner x = new Scanner(myFile);


          while (x.hasNext()) {
           String a = x.next();
           String[] evVar = a.split(":");

           Event ev = new Event(evVar[0], evVar[1], evVar[2], evVar[3], evVar[4], evVar[5], evVar[6]);
           events.add(ev);
          }
          System.out.println();

         } catch (IOException e) {
          System.out.println("No items match your search.");
         }
        }

        public static void setPartnerData() {
         // creates objects of partners
         try {
          String fileName = "Partner";

          File myFile = new File(fileName + ".txt");
          Scanner x = new Scanner(myFile);

          while (x.hasNext()) {
           String a = x.next();
           String[] paVar = a.split(":");
           Partner pa = new Partner(paVar[0], paVar[1], Double.parseDouble(paVar[2]));
           //System.out.println("Name: " + paVar[0] + "     Service: " + paVar[1] + "     Price: " + paVar[2]);

           partners.add(pa);
          }
          System.out.println();

         } catch (IOException e) {
          System.out.println("No itmes match your search.");
         }
        }

        public static void setCustomerData() {
         // creates objects of customers
         try {
          String fileName = "Customer";

          File myFile = new File(fileName + ".txt");
          Scanner x = new Scanner(myFile);

          while (x.hasNext()) {
           String a = x.next();
           String[] cuVar = a.split(":");
           Customer cu = new Customer(cuVar[0], cuVar[1]);
           //System.out.println("Name: " + cuVar[0] + "     Email: " + cuVar[1]);

           customers.add(cu);
          }
          System.out.println();

         } catch (IOException e) {
          System.out.println("No itmes match your search.");
         }
        }
      }
