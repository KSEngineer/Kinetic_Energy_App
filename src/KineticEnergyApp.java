import java.util.Scanner;

public class KineticEnergyApp {

    public static void main(String[] args) {

        // Introduction
//        System.out.println("\nIn the transportation industry there are objects traveling at various speeds.  These objects each have kinetic energy." +
//                " the amount of force");

        System.out.println("\n    Trucks can legally weigh 80,000 pounds.  However, many trucks aren't at 80,000 because even if a driver leaves a\n" +
                "customer with a gross weight of 80,000 pounds they will be reducing their weight by going down the road using fuel. \n" +
                "One gallon of diesel is about 8 pounds and if a truck got 8 miles per gallon, then that would be about 1 pound lost \n" +
                "per mile driven.\n\n"

+                "    Kinetic energy, measured in kilojoules (KJ), is the amount of force due to an object's speed.  Here you can enter \n" +
                "the weight (in pounds) and speed (MPH) for two different objects to compare the kinetic energy  between them.");
        // Trucks can legally weigh 80,000 pounds.  However, many trucks aren't at 80,000 because if a driver leaves a customer with a gross weight of
        // 80,000 pounds they will be reducing their weight by going down the road using fuel.  One gallon of diesel is about 8 pounds and if a truck
        // got 8 miles per gallon, then that would be about 1 pound lost per mile driven.

        // Kinetic energy, measured in kilojoules (KJ), is the amount of force due to an object's speed.  Here you can enter the weight (in pounds)
        // and speed (MPH) for two different objects to compare the kinetic energy  between them.

        System.out.println("\n    There are two tools.  The first tool (option 1) allows you to enter the number of pounds and miles per hour \n" +
                "to get the kinetic energy.  The second tool (option 2) allows you to enter numbers for two different objects \n" +
                "to compare the results.");
        // End of Introduction

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter 1 or 2:");
        double userInput = scanner.nextDouble();

        // Validate the entry.
        if((userInput != 1) && (userInput != 2)) {
            System.out.println("\nInvalid entry.  Please enter 1 or 2.");
        }

        if(userInput == 1) {
            //   Scanner scanner = new Scanner(System.in);

            System.out.println("\nPlease enter the number of pounds for this object: ");
            double inputPounds = scanner.nextDouble();

            // Validate the entry.
            while (inputPounds <= 0) {
                System.out.println("\nInvalid entry.  Please enter number greater than zero.");
            }

            System.out.println("\nPlease enter the speed in MPH for the object: ");
            double inputSpeed = scanner.nextDouble();

            while (inputSpeed <= 0) {
                System.out.println("\nInvalid entry.  Please enter number greater than zero.");
            }
            optionOne(inputPounds, inputSpeed);
        }

        if(userInput == 2) {
                //   Scanner scanner = new Scanner(System.in);

                System.out.println("\nPlease enter the number of pounds for the first object: ");
                double inputFirstPounds = scanner.nextDouble();

                // Validate the entry.
                while (inputFirstPounds <= 0)  {
                    System.out.println("\nInvalid entry.  Please enter number greater than zero.");
                }

                System.out.println("\nPlease enter the MPH for the first object: ");
                double inputFirstSpeed = scanner.nextDouble();

                while (inputFirstSpeed <= 0)  {
                    System.out.println("\nInvalid entry.  Please enter number greater than zero.");
                }

                System.out.println("\nPlease enter the number of pounds for the second object: ");
                double inputSecondPounds = scanner.nextDouble();

                // Validate the entry.
                while (inputSecondPounds <= 0)  {
                    System.out.println("\nInvalid entry.  Please enter number greater than zero.");
                }

                System.out.println("\nPlease enter the MPH for the second object: ");
                double inputSecondSpeed = scanner.nextDouble();

                while (inputSecondSpeed <= 0)  {
                    System.out.println("\nInvalid entry.  Please enter number greater than zero.");
                }
            scanner.close();

                optionTwo(inputFirstPounds, inputFirstSpeed, inputSecondPounds, inputSecondSpeed);

        }

//        double secondEnterPounds = 60000;
//        double secondEnterMPH = 65;
//
//
//
//        double secondMassKG = secondEnterPounds * 0.45359237;
//        double secondVelocity = (secondEnterMPH * 0.44704);
//
//
//        double secondKineticEnergy = (((0.5 * secondMassKG) * (secondVelocity * secondVelocity)) / 1000);

        // Right now I don't think I'll worry about underlining the words 'First Object.'




        // Maybe add some notes on real world impact of KJ.  How many KJ to damage a structure?  How many KJ to seriously injure someone?
        // How many KJ for a fender bender?
        // How many KJ for a...

        scanner.close();

    }

    public static void optionOne(double firstEnterPounds, double firstEnterMPH) {



        double firstMassKG = firstEnterPounds * 0.45359237;
        double firstVelocity = (firstEnterMPH * 0.44704);

        double firstKineticEnergy = (((0.5 * firstMassKG) * (firstVelocity * firstVelocity)) / 1000);

        System.out.println(String.format("First Object: \n\nWeight:          %,.2f pounds " +
                "\nSpeed:           %,.2f MPH " +
                "\nKinetic Energy:  %,.2f KJ", firstEnterPounds, firstEnterMPH, firstKineticEnergy));

       // return firstKineticEnergy();
    }

    public static void optionTwo(double enterFirstPounds, double enterFirstMPH, double enterSecondPounds, double enterSecondMPH) {

        double firstMassKG = enterFirstPounds * 0.45359237;
        double firstVelocity = (enterFirstMPH * 0.44704);

        double firstKineticEnergy = (((0.5 * firstMassKG) * (firstVelocity * firstVelocity)) / 1000);

        System.out.println(String.format("\n-----\n\nSecond Object: \n\nWeight:          %,.2f pounds " +
                "\nSpeed:           %,.2f MPH " +
                "\nKinetic Energy:  %,.2f KJ", enterFirstPounds, enterFirstMPH, firstKineticEnergy));

        double secondMassKG = enterSecondPounds * 0.45359237;
        double secondVelocity = enterSecondMPH * 0.44704;

        double secondKineticEnergy = (((0.5 * secondMassKG) * (secondVelocity * secondVelocity)) / 1000);

        System.out.println(String.format("\n-----\n\nSecond Object: \n\nWeight:          %,.2f pounds " +
                "\nSpeed:           %,.2f MPH " +
                "\nKinetic Energy:  %,.2f KJ", enterSecondPounds, enterSecondMPH, secondKineticEnergy));
    }
}
