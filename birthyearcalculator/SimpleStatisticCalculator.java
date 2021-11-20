/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author imran
 */
public class SimpleStatisticCalculator {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        
        //input
        System.out.print("Please input 5 numbers separated by space: ");
        double num1 = console.nextInt();
        double num2 = console.nextInt();
        double num3 = console.nextInt();
        double num4 = console.nextInt();
        double num5 = console.nextInt();
        
        //output
        System.out.printf("\n%-20s: %.2f %.2f %.2f %.2f %.2f", "Numbers",
                num1, num2, num3, num4, num5);
        System.out.printf("\n%-20s: %.2f", "Mean", average(num1, num2, num3, num4, num5));
        System.out.printf("\n%-20s: %.2f", "Minimum", minimum(num1, num2, num3, num4, num5));
        System.out.printf("\n%-20s: %.2f", "Maximum", maximum(num1, num2, num3, num4, num5));
        System.out.printf("\n%-20s: %.2f\n", "Standard Deviation",standardD(num1, num2, num3, num4, num5));
    }   
    //calculating the average
    public static double average(double num1, double num2, double num3, double num4, double num5){
        return(num1+num2+num3+num4+num5)/5;
    }       
    
    //finding the smallest number(minimum)
    public static double minimum(double num1, double num2, double num3, double num4, double num5){
        if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
            return num1;
        }else if(num2<num1 && num1<num3 && num2<num4 && num2<num5){
            return num2;
        }else if(num3<num2 && num3<num1 && num3<num4 && num3<num5){
            return num3;
        }else if(num4<num2 && num4<num3 && num4<num1 && num4<num5){
            return num4;
        }else{
            return num5;
        }
    }
    //finding the greatest number(maximum)
    public static double maximum(double num1, double num2, double num3, double num4, double num5) {
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            return num1;
        }else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            return num2;
        }else if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
            return num3;
        }else if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
            return num4;
        }else {
            return num5;
        }
    }   
    //calculating the standard deviation
    public static double standardD(double num1, double num2, double num3, double num4, double num5){
        double n = Math.pow(Math.abs(num1 - average(num1,num2,num3,num4,num5)),2)
                +Math.pow(Math.abs(num2 - average(num1, num2, num3, num4, num5)), 2)
                +Math.pow(Math.abs(num3 - average(num1, num2, num3, num4, num5)), 2)
                +Math.pow(Math.abs(num4 - average(num1, num2, num3, num4, num5)), 2)
                +Math.pow(Math.abs(num5 - average(num1, num2, num3, num4, num5)), 2);
        return Math.sqrt(n / 5);
    }
}