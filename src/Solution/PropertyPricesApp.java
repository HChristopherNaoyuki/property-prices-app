package Solution;

import java.text.DecimalFormat;

public class PropertyPricesApp
{
    public static void main(String[] args)
    {
        // Declare the provinces and property types
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        String[] propertyTypes = {"Flat", "Townhouse", "House"};

        // 2D array to store property prices for each province and property type
        // Each row corresponds to a province and each column corresponds to a property type
        double[][] propertyPrices = {
            {800000, 1500000, 2000000},  // Gauteng: Flat, Townhouse, House
            {700000, 1200000, 1600000},  // Natal: Flat, Townhouse, House
            {750000, 1300000, 1800000}   // Cape: Flat, Townhouse, House
        };

        // Create a DecimalFormat instance to format numbers with commas
        DecimalFormat df = new DecimalFormat("#,###");

        // Print the table header for property prices
        System.out.printf("%-10s %-10s %-12s %-12s%n", "", "FLAT", "TOWNHOUSE", "HOUSE");
        System.out.println("--------------------------------------------");

        // Loop through each province to print property prices
        for (int i = 0; i < provinces.length; i++)
        {
            // Print the province name and formatted property prices
            System.out.printf("%-10s R %-8.0f R %-10.0f R %-10.0f%n", 
                               provinces[i],
                               propertyPrices[i][0],
                               propertyPrices[i][1],
                               propertyPrices[i][2]);
        }
        
        System.out.println(); // Print a blank line for better readability
        
        // Loop through each province to calculate and print average property prices
        for(int i = 0; i < provinces.length; i++)
        {
            double total = 0; // Variable to hold the total prices for the current province
            
            // Loop through each property type to sum up the prices
            for (int j = 0; j < propertyTypes.length; j++)
            {
                total += propertyPrices[i][j]; // Add the property price to total
            }
            
            // Calculate the average price for the current province
            double average = total / propertyTypes.length;
            
            // Print the average property price for the province, formatted with commas
            System.out.println("Average property prices in " 
            + provinces[i]
            + ": \tR"
            + df.format(average)
            );
        }
    }
}
