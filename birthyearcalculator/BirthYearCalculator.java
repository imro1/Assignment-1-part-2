/*
i am making a birthday year calculator with the century and decade indicators
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author imran maslianov
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //user's input
        System.out.print("Please enter a birth year: ");
        String year = console.nextLine();
        
        //output
        System.out.println("Birth Year: " + year);
        System.out.println("Century   : " +centuryFirst(year));
        System.out.println("Decade    : " + decadeSecond(year));
    }
        //return for century
    public static int centuryFirst(String year){
        return Integer.parseInt(year.substring(0,2))+1;
    }
        //return for decade
    public static String decadeSecond(String year){
        return year.charAt(2)+"0";
    }
}
