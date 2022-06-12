/********************************************************
* Author: Jackson Mowatt Gok (20568818)                 *
* Purpose: The file to use for the final assessment.    *
* Date: 12/06/2022                                      *
*********************************************************/

import java.util.*;
import java.io.*;

public class QuestionOne
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int theArray [][] = arrayGenerator();
        
        double theDoubArray [][] = new double[theArray.length][theArray[0].length];
        System.out.println("Enter an amount that all values in the 2D array will be transformed by. You may enter a value between 0.75 and 1.25.");
        double inputDoub = sc.nextDouble();
        for (int row = 0; row < theArray.length; row++) {
            for (int column = 0; column < theArray[0].length; column++) {
                theDoubArray[row][column] = Math.round(((double) theArray[row][column])*inputDoub);
                if((theDoubArray[row][column]) > 65636){
                    theDoubArray[row][column] = -1;
                }
            }
        }
    String arrayToString = Arrays.deepToString(theDoubArray).replaceAll("],", "]," + System.getProperty("line.separator"));
    //System.out.println(Arrays.deepToString(theDoubArray).replaceAll("],", "]," + System.getProperty("line.separator")));
    System.out.println(arrayToString);
    writeOneRow("temp.txt", arrayToString);
    sc.close();
    }

    /******************************************************
    * Purpose: To calculate provide a 2D array            *
    * Date: 12/06/2022                                    *
    * IMPORTS:  Nothing                                   *
    * EXPORTS:  2D array of integers                      *
    *******************************************************/
    public static int[][] arrayGenerator()
    {
        int anArray [][] = {{10, 20, 30, 70, 80, 65536},
                            {40, 50, 60, 10, 20, 30 },
                            {70, 80, 190, 20, 30, 70 },
                            {60, 10, 20, 190, 20, 30},
                            {70, 80, 20, 30, 80, 190},
                            {1, 60, 10, 80, 20, 30}};

        return anArray;
    }

    public static void writeOneRow(String pFilename, String pInputString){
        FileOutputStream fileStrm = null;
        PrintWriter pw;
        try {
            fileStrm = new FileOutputStream(pFilename);
            pw = new PrintWriter(fileStrm);
            pw.println(pInputString);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error in writing to file" + e.getMessage());
        }
    }
}