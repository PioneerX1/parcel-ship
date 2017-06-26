import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("This program will calculate your shipping costs.");

    System.out.println("Enter the package weight in lbs: ");
    int weight = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the package length in inches: ");
    int length = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the package width in inches: ");
    int width = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the package height in inches: ");
    int height = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter the distance in miles to ship: ");
    int distance = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter method of shipping - priority, 2-day, or ground: ");
    String speed = myConsole.readLine();
    System.out.println("Do you want gift wrapping? Yes or No: ");
    String stringWrapping = myConsole.readLine();
    Boolean wrapping;

    if (stringWrapping.contains("y")) { wrapping = true;}
    else {wrapping = false;}

    Parcels newPackage = new Parcels(length, width, height, weight, distance, speed, wrapping);

    newPackage.calculateVolume();
    newPackage.costToShip();

    List<Parcels> parcelList = new ArrayList<Parcels>();
    parcelList.add(newPackage);

    for (Parcels eachPackage : parcelList) {
      System.out.println("--------------------------");
      System.out.println("Volume: "+eachPackage.mVolume);
      System.out.println("$"+eachPackage.mCost);
      System.out.println("Weight: "+eachPackage.mWeight);
      System.out.println("Length: "+eachPackage.mLength);
      System.out.println("Width: "+eachPackage.mWidth);
      System.out.println("Height: "+eachPackage.mHeight);
      System.out.println("Distance: "+eachPackage.mDistance);
      System.out.println("Wrapping" + eachPackage.mWrapping);
      System.out.println("Speed" + eachPackage.mSpeed);
    }

  }

}
