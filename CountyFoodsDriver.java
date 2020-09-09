/*
 * @author Jaclyn Kordus CSCI-180-01 at 9 am MWF 
 * This program reads in a csv file and organizes it into an array list. It then calculates 
 * the percentage of low income, and outputs the data for every county.
 *
 */
package countyfoodsproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountyFoodsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File foodFile = new File("food_access.csv");
        Scanner inputFile = new Scanner(foodFile);
        inputFile.nextLine();

        ArrayList<CountyFood> CountyFood1 = new ArrayList();

        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            String[] lineParts = line.split(",");
            CountyFood currentCounty = new CountyFood(lineParts[0], lineParts[1], Integer.parseInt(lineParts[4]));
            currentCounty.setGroceriesAvailable(Double.parseDouble(lineParts[2]));
            currentCounty.setGroceriesAvailableForLowIncome(Double.parseDouble(lineParts[3]));
            CountyFood1.add(currentCounty);
        }//end while

        for (int i = 0; i < CountyFood1.size(); i++) {
            System.out.println(CountyFood1.get(i).ToString());
        }//end for

    }//end main

}//end class

