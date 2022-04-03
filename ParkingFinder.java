import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;
import edu.cwi.parking.ParkingSpot;
public class ParkingFinder {
    public static void main(String[] args){
        
        
        final int INTERVAL= 10;
        final double DEFAULT_COST =  0.3;
        ParkingSpot spotOne,spotTwo,spotThree, spotFour;
        double totalCost;
        Random generator;
        Scanner scan;
        long seed;
        int parkingTime, carX, carY, distanceSpotOne, distanceSpotTwo,
        distanceSpotThree, distanceSpotFour, min1, min2, clostestSpot;
        
       
        scan = new Scanner(System.in);
        System.out.println("Enter your random seed: ");

        seed = scan.nextLong();
        generator = new Random(seed);
        System.out.println("Enter the necessary parking time (minutes): ");
        parkingTime = scan.nextInt();
        carX = generator.nextInt(100);
        carY = generator.nextInt(100);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("The position of your vehicle is: x: " + carX + " y:" + carY);
        
        //spotone string 
        spotOne = new ParkingSpot("1234 main St.", generator.nextInt(100), generator.nextInt(100));
        
        System.out.println("Spot 1: " + spotOne.toString());
        distanceSpotOne = Math.abs(carX - spotOne.getLocationX()) + Math.abs(carY- spotOne.getLocationY());
        System.out.println("\tDistance to spot One: " + distanceSpotOne);
        totalCost = Math.ceil((double) parkingTime / spotOne.INTERVAL) * spotOne.getCostPerInterval();
        System.out.println("\tTotal Cost for Spot 1 is: " + fmt.format(totalCost));
       
    
    //   SpotTwo string starts
        spotTwo = new ParkingSpot("4321 main St.", generator.nextInt(100), generator.nextInt(100));
       
       
        System.out.println("Spot 2: " + spotTwo.toString());
        
        distanceSpotTwo = Math.abs(carX - spotTwo.getLocationX()) + Math.abs(carY- spotTwo.getLocationY());
        System.out.println("\tDistance to spot Two: " + distanceSpotTwo);
        totalCost = Math.ceil((double) parkingTime / spotTwo.INTERVAL) * spotTwo.getCostPerInterval();
        System.out.println("\tTotal Cost for Spot 2 is: " + fmt.format(totalCost));

        // SpotThree string starts
        spotThree = new ParkingSpot("4321 main St.", generator.nextInt(100), generator.nextInt(100));
        spotThree.setCostPerInterval(DEFAULT_COST);

        System.out.println("Spot 3: " + spotThree.toString());
        
        distanceSpotThree= Math.abs(carX - spotThree.getLocationX()) + Math.abs(carY- spotThree.getLocationY());
        System.out.println("\tDistance to spot Three: " + distanceSpotThree);
    
        totalCost = Math.ceil((double) parkingTime / spotThree.INTERVAL) * spotThree.getCostPerInterval(); 
        System.out.println("\tTotal Cost for Spot 3 is: " + fmt.format(totalCost));

        //Spotfour string starts
        spotFour = new ParkingSpot("4321 main St.", generator.nextInt(100), generator.nextInt(100));
        spotFour.setCostPerInterval(DEFAULT_COST);
        System.out.println("Spot 4: " + spotFour.toString());
        
        distanceSpotFour = Math.abs(carX - spotFour.getLocationX()) + Math.abs(carY- spotFour.getLocationY());
        System.out.println("\tDistance to spot Four: " + distanceSpotFour);
        
        totalCost =  Math.ceil((double) parkingTime / spotFour.INTERVAL) * spotFour.getCostPerInterval();
        System.out.println("\tTotal Cost for Spot 4 is: " + fmt.format(totalCost));

        min1 = Math.min(distanceSpotOne, distanceSpotTwo);
        min2 = Math.min(distanceSpotThree, distanceSpotFour);
        clostestSpot= Math.min(min1, min2);
       
        if (clostestSpot == distanceSpotOne){
            System.out.println("The distance to closest spot:  " + clostestSpot);
            System.out.println("The closest spot is:  " + spotOne.toString());

        }
           
        if (clostestSpot == distanceSpotTwo){
            System.out.println("The distance to closest spot:  " + clostestSpot);
            System.out.println("The closest spot is:  " + spotTwo.toString());

        }
            
        if (clostestSpot == distanceSpotThree){
            System.out.println("The distance to closest spot:  " + clostestSpot);
            System.out.println("The clostest spot:  " + spotThree.toString());
        }
           
        
        if (clostestSpot == distanceSpotFour){
            System.out.println("The distance to closest spot:  " + clostestSpot);
            System.out.println("The closest spot:  " + spotFour.toString());

               
    
        }
         


        

        
         
       
        scan.close();
        
   
    }
}