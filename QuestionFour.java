/********************************************************
* Author: Jackson Mowatt Gok (20568818)                 *
* Purpose: The file to use for the final assessment.    *
* Date: 12/06/2022                                      *
*********************************************************/

import java.util.*;
import java.io.*;

public class QuestionFour
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double theDistance = 0.0;   // To store the calculated distance value in
        

        String id_code = "";
        double lat = 0;
        double lon = 0;
        String horiz_datum = "";
        double easting = 0;
        double northing = 0;
        SurveyMarker surveyMarkerOne = new SurveyMarker();
        SurveyMarker surveyMarkerTwo = new SurveyMarker();


        System.out.println("Welcome to the SurveyMarker Application");
        System.out.println("Please enter the data for the two SurveyMarker objects");
        for(int i = 0; i < 2; i ++){
            if(i == 0){
                System.out.println("SurveyMarker One:");
            }
            System.out.print("> id_code: ");
            try{
                id_code = sc.nextLine();
                System.out.println();
                System.out.print("> lat: ");
                lat = sc.nextDouble();
                System.out.println();
                System.out.print("> lon: ");
                lon = sc.nextDouble();
                System.out.println();
                System.out.print("> horiz_datum: ");
                sc.nextLine();
                horiz_datum = sc.nextLine();
                System.out.println();
                System.out.print("> easting: ");
                easting = sc.nextDouble();
                System.out.println();
                System.out.print("> northing: ");
                northing = sc.nextDouble();
                System.out.println();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Incorrect input! Entire array is invalid because " + e.getMessage());
            }
            if(i == 0){
                surveyMarkerOne = new SurveyMarker(id_code, lat, lon, horiz_datum, easting, northing);
                System.out.println();
                System.out.println("SurveyMarker Two");
            }
            if(i == 1){
                surveyMarkerTwo = new SurveyMarker(id_code, lat, lon, horiz_datum, easting, northing);
            }
        }

        theDistance = distanceBetweenPoints((surveyMarkerOne.getLat()), (surveyMarkerOne.getLon()), (surveyMarkerTwo.getLat()), (surveyMarkerTwo.getLon()));
        System.out.println("The distance is: " + theDistance);

        sc.close();
    }

    /******************************************************
    * Purpose: To calculate the distance between 2 points *
    * Date: 
    * IMPORTS:  latOne   (Real)                           *
    *           lonOne   (Real)                           *
    *           latTwo   (Real)                           *
    *           lonTwo   (Real)                           *
    * EXPORTS:  distance (Real)                           *
    *******************************************************/

    private static double distanceBetweenPoints(double latOne, double lonOne, double latTwo, double lonTwo)
    {
        double distance = 0.0;
        distance = Math.sqrt((lonTwo - lonOne)*(lonTwo - lonOne) + (latTwo - latOne)*(latTwo - latOne));
        return distance;
    }
}