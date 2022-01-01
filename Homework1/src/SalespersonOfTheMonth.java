/*
 * Vincenzo D'Aria
 * CS-152-02
 * Homework 1
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalespersonOfTheMonth {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("C:\\Users\\Vinny\\eclipse-workspace\\Homework1\\src\\salesSlips.txt"); //Opening the salesSlips text file
    Scanner scan = new Scanner(file); //Scanner to read text file
    int[][] sales = new int[6][4]; // array for total sales grouped by salesperson

    //Loop to print text file (debug purposes)
    while (scan.hasNextLine()) {
      System.out.println(scan.nextLine());
    }

    //TODO: Create loop to iterate over # of salespeople and product type



    scan.close(); //scanner closed
  }

}
