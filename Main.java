import java.io.*;
import static java.lang.System.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner it = new Scanner(System.in);
    
  //Creating Default Phone
  CellPhone cp = new CellPhone();
  //Creaing My Phone - For Comparison Later
  CellPhone my = new CellPhone("iPhone 12 Pro Max", "Apple", 2020, 94, 41);
System.out.println("Hello and Welcome to the Phone Compare Game. Let's get started!");
System.out.println(""); //Creating White Space

System.out.println("This is my current phone:");
System.out.println(""); //Creating White Space
System.out.println(my);
System.out.println(""); //Creating White Space
    //Asking The Questions to Collect the Data
    
    //Setting the Name of the Users Phone
    System.out.println("What is the name of your phone?");
    String nm = it.nextLine();
    cp.setName(nm);
    
    //Setting the Brand of the Users Phone
    System.out.println("What is the brand of your phone?");
    String br = it.nextLine();
    cp.setBrand(br);

    //Setting the Year of the Users Phone
    System.out.println("What year was it made?");
    int y= it.nextInt();
    cp.setYearModel(y);

    //Setting the Users Battery Percentage
    System.out.println("What is your current battery percentage?");
    double p = it.nextDouble();
    cp.setBattery(p);

    //Setting the Amount of Apps the User Has 
    System.out.println("How many apps do you have on your phone?");
    int ac = it.nextInt();
    cp.setAppCount(ac);
    //Telling the User Their Phone information
    System.out.println("Here is your phone:");
    System.out.println(cp);
  

  //Comparing if our phones are made by the same brand -- Using .equals method
  System.out.println(""); //Creating White Space
  System.out.println("Are our phones made by the same brand?");
  if (my.equals(cp) == true)
  {
    System.out.println("Wow! Our phones are both made by " + br +"!");
  }
  else
  {
    System.out.println("NO! Our phones are not made by the same brand");
  }
  System.out.println(""); //Creating White Space
  System.out.println(""); //Creating White Space

  //Guesses the Price of the Phone based on the year
  System.out.println("Let me guess your phone price: ");
  String answer = cp.price(y);
  System.out.print(answer);
  System.out.println("\n");

   System.out.println("Let's download some additional apps onto your phone.  How many would you like to add?");
      cp.additionalApps(it.nextInt());
      System.out.println("Here is your updated phone information:");
      System.out.println(cp);

  }
}
