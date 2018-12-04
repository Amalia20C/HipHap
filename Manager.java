public class Manager extends Employee {
   public boolean isManager = true;
   
   public void showManagerScreen()
    {
        String[] options = {
                "0. Log out ",
                "1. Employees ",
                "2. Events ",
                "3. Partners"
        };
        System.out.println("==== Dashboard ====");
        for (int i = 0; i < options.length; i++)
        {
            System.out.println(i + ". " + options[i]);
        }
        // get option from the user
        System.out.println("");
        int option = scanner.nextInt();
        switch(option) {
            case 0:
                System.out.println("=== Successfully logged out ===");
                System.out.println();
                System.out.println();
                showMainScreen();
                break;
            case 1:
                showEmployeeScreen();
                break;
            case 2:
                showEventsScreen();
                break;
            case 3:
                showPartnersScreen();
                break;
        };

   
}