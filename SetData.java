import java.io.*;
import java.util.*;
public class SetData {
 static Scanner x;
 static Scanner user = new Scanner(System.in);

 public static void main(String args[]) {

 }


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
    System.out.println("ID: " + emVar[0] + " Name: " + emVar[1] + " Password: " + emVar[2] + " Email: " + emVar[3]);


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
    System.out.println("ID: " + evVar[0] + " Name: " + evVar[1] + " Type: " + evVar[2] + " Date: " + evVar[3] + "Location: " + evVar[4] + "Price: " + evVar[5]);

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
    System.out.println("Name: " + paVar[0] + "Service: " + paVar[1] + "Price: " + paVar[2]);

    partners.add(pa);
   }
  } catch (IOException e) {
   System.out.println("No itmes match your search.");
  }
 }


}