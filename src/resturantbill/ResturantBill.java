/*
 * Peter Horne-Deus
 * resturantBill.java
 * This program calculates a bill for a resturant 
 * September 20, 2018
 */

package resturantbill;

import java.text.*;
/**
 *
 * @author pehor9164
 */
public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double mealCost = 27.99;
       double tax = 0.13;
       double mealTax = tax*(mealCost);
       double total = mealCost + mealTax;
       DecimalFormat x = new DecimalFormat ("##.##");
       
       System.out.println("Resturant Bill");
       System.out.println("**************" + "\n");
       System.out.println("Meal:\t$" + mealCost );
       System.out.println("Tax:\t$" + x.format(mealTax));
       System.out.println("Total:\t$" + x.format(total));
    }
    
}
