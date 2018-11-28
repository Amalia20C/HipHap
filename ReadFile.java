import java.io.*;
import java.util.*;
public class ReadFile {

public void openFile()
{
    private Scanner x;
    try
    {
        x = new Scanner(new File("Employee.txt"));
    }
    catch (Exception e)
    {
        System.out.println("Could not find the file");
    }

}

public void readFile()
{
    while(x.hasNext())
    {
        String ID = x.next();
        String password = x.next();
        String name = x.next();
        String email = x.next();
        System.out.println(ID + " " + password +  " " + name + " " + email);
    }
}

public void closeFile()
{

    x.close();
}

}