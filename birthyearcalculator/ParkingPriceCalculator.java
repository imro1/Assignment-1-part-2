//price calculator for the parking 
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class ParkingPriceCalculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please input how long your car has parked in minutes: ");
        int minutes = console.nextInt();

        System.out.printf("\n%-25s: %d", "Parking time (minutes)", minutes);
        System.out.printf("\n%-25s: %d", "Parking time (hours)", hours(minutes));
        System.out.printf("\n%-25s: %.2f\n", "Price", price(hours(minutes)));
    }

    //converting the minutes into hours
    public static int hours(int minutes) {
        final double TIME_CONVERSION = 60;
        return (int) Math.ceil(minutes / TIME_CONVERSION);
    }

    //calculating the price
    public static double price(int hours) {
        final double price = 2;
        return price * hours;
    }
}