import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CtoFConverter {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double tempC = 0;
      double tempF = 0;
      String trash = " ";
      boolean done = false;

      do {
          System.out.print("Enter the temperature in Celsius: ");

          if (in.hasNextDouble()  ) {
              tempC = in.nextDouble();
              in.nextLine();
              tempF = (1.8 * tempC) + 32;
              done = true;


          }
          else {
              trash = in.nextLine();
              System.out.println("You must enter a valid temperature not: " + trash);
              done = false;
          }
      }while(!done);

        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}
 class FuelCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amtGas = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        double distanceTank = 0;
        double cost100 = 0;
        double costFull = 0;
        String continueYN = "";
        String trash = "";
        boolean done = false;

        System.out.println("How much does it cost to travel 100 miles in your car?");
        System.out.print("Enter the gallons of gas in tank: ");
        amtGas = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the fuel efficiency in MPG: ");
        fuelEff = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the price per gallon: ");
        gasPrice = in.nextDouble();
        in.nextLine();

        do {
            if ((amtGas > 0) && (fuelEff > 0) && (gasPrice > 0)) {
                distanceTank = amtGas * fuelEff;
                costFull = amtGas * gasPrice;
                cost100 = (100 / distanceTank) * costFull;
                System.out.println("The cost per 100 miles is: " + "$" + cost100);
                System.out.println("The car can travel " + distanceTank + " miles with a full tank of gas.");

                System.out.print("Would you like to enter another?(Y/N): ");
                continueYN = in.nextLine();
                if (continueYN.equalsIgnoreCase("N")) {
                    done = true;
                }
                else if (continueYN.equalsIgnoreCase("Y")) {
                    done = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);
            }
        }while(!done);
    }
}


 class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double recHeight = 0;
        double recWidth = 0;
        double recPerimeter = 0;
        double recArea = 0;
        double recDiagonal =0;
        String continueYN = "";
        String trash = " ";
        boolean done = false;

        System.out.print("Enter the height of the rectangle: ");
        recHeight = in.nextInt();
        in.nextLine();
        System.out.print("Enter the width of the rectangle: ");
        recWidth = in.nextInt();
        in.nextLine();

        do {
            if ((recHeight > 0) && (recWidth > 0)) {
                recPerimeter = (recHeight * 2) + (recWidth * 2);
                recArea = recHeight * recWidth;
                recDiagonal = sqrt((recHeight * recHeight) + (recWidth * recWidth));
                System.out.println("The perimeter of the rectangle is " + recPerimeter );
                System.out.println("The area of the rectangle is " + recArea);
                System.out.println("The diagonal of the rectangle is " + recDiagonal);

                System.out.print("Do you wish to continue (Y/N): ");
                continueYN = in.nextLine();
                if(continueYN.equalsIgnoreCase("N")){
                    done = true;
                }
            }else
                trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);

        }while (!done);

    }
}

class MetricConverter{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double lengthMeters = 0;
        double lengthMiles = 0;
        double lengthFeet = 0;
        double lengthInches =0;
        String continueYN = "";
        String trash = " ";
        boolean done = false;

        System.out.print("Enter the mesurement in meters: ");
        lengthMeters = in.nextDouble();
        in.nextLine();
        do {
            if (lengthMeters > 0) {
                lengthMiles = lengthMeters * 0.00062137;
                lengthFeet = lengthMeters * 3.28;
                lengthInches = lengthMeters * 39.36;
                System.out.println("The length in miles is: " + lengthMiles);
                System.out.println("The length in feet is: " + lengthFeet);
                System.out.println("The length in inches is: " + lengthInches);

                System.out.print("Would you like to continue (Y/N): ");
                continueYN = in.nextLine();
                if(continueYN.equalsIgnoreCase("N")){
                    done = true;
                }

            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number not " + trash);
            }
        }while(!done);



    }
}


class HighorLow{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int userGuess = 0;
        boolean done = false;
        String tryAgain = "";

        System.out.print("Enter a number between 1-10: ");
        do{
            if(in.hasNextInt()) {
            userGuess = in.nextInt();
            in.nextLine();

            if (userGuess == val) {
                done = true;
                System.out.println("You guessed correctly!");
            } else {
                System.out.println("You did not guess correctly!");
                System.out.print("Would you like to try again?(Y/N): ");
                tryAgain = in.nextLine();
                if (tryAgain.equalsIgnoreCase("N")) {
                    done = true;
                } else if (tryAgain.equalsIgnoreCase("Y")) {
                    done = false;
                }
            }
        }
            }while(!done);
        }
    }