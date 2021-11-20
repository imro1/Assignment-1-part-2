/*
 * I am making a code for a Webaddressextractor using substring.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Imran Maslianov
 */
public class WebAddressExtractor {
    
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        
        //user's input
        System.out.print("Please input a web address: ");
        String webAddress = console.nextLine();
        
        //declaring the dots
        int f = webAddress.indexOf('.');
        int s = webAddress.indexOf('.',f +1);
     
        //address output
        System.out.println("Address   : " + webAddress.toLowerCase());
        
        //heading output
        String heading = webAddress.substring(0,f);
        System.out.println("Heading   : " + heading.toLowerCase());
        
        //company output
        String company = webAddress.substring(f+1,s);
        System.out.println("Company   : " + company.toLowerCase());
        
        //extension output
        String extension = webAddress.substring(s+1);
        System.out.println("Extension : " + extension.toLowerCase());
    }
    
}