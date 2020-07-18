package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        removeAChars(scanner.next());
    }
    public static String removeAChars(String str) {

        if(str.length()<=2) {
            return str.replaceAll("[aA]+", "");
        }else {
            String firstTwoChars = str.substring(0,2).replaceAll("[aA]+", "");
            return firstTwoChars+str.substring(2);
        }
    }
}
