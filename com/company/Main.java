package com.company;

public class Main {

    public static void main(String[] args) {
	    String apples = "Apples";
	    int appleQuantity = 8;
	    int applePrice = 100 * 8;
	    String oranges = "Oranges";
	    int orangeQuantity = 12;
	    int orangePrice = 80 * 12;

	    String column1Heading = "Fruit";
	    String column2Heading = "Quantity";
	    String column3Heading = "Price";

        System.out.printf("%-12s %-8s %2s %n", column1Heading,column2Heading,column3Heading);
        System.out.printf("%-12s %-8d %2d cents%n", apples,appleQuantity,applePrice);
        System.out.printf("%-12s %-8d %2d cents%n", oranges,orangeQuantity,orangePrice);
    }
}
/* Output:

Fruit        Quantity Price
Apples       8        100 cents
Oranges      12       80 cents

*/