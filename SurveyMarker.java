import java.util.*;

public class SurveyMarker extends Station{
    private String horiz_datum;
    private double easting;
    private double northing;

    //Parameters Constructor
    public SurveyMarker(String pId_code, double plat, double plon, String pHoriz_datum, double pEasting, double pNorthing){
        super(pId_code, plat, plon);
        horiz_datum = pHoriz_datum;
        easting = pEasting;
        northing = pNorthing;
    }

    //Copy Constructor
    public SurveyMarker(SurveyMarker pSurveyMarker){
        super(pSurveyMarker);
        horiz_datum = pSurveyMarker.getHorizDatum();
        easting = pSurveyMarker.getEasting();
        northing = pSurveyMarker.getNorthing();
    }

    //Default Constructor
    public SurveyMarker(){
        super();
        horiz_datum = "AAA01";
        easting = 0;
        northing = 0;
    }

    //Following are the Accessors (getters)
    public String getHorizDatum(){
        return horiz_datum;
    }

    public double getEasting(){
        return easting;
    }

    public double getNorthing(){
        return northing;
    }

    //Following are the Mutators (setters)
    public void setHorizDatum(String pHoriz_datum){
        horiz_datum = pHoriz_datum;
    }

    public void setEasting(double pEasting){
        easting = pEasting;
    }

    public void setNorthing(double pNorthing){
        northing = pNorthing;
    }


    public boolean equals(Object inObject){
        boolean isEqual = false;
        SurveyMarker inSurveyMarker = null;
        if(inObject instanceof SurveyMarker){
            inSurveyMarker = (SurveyMarker)inObject;
            if(super.equals(inSurveyMarker)){
                if(horiz_datum.equals(inSurveyMarker.getHorizDatum())){
                    if(easting == inSurveyMarker.getEasting()){
                        if(northing == inSurveyMarker.getNorthing()){
                            isEqual = true;
                        }
                    }
                }
            }
        }
        return isEqual;
    }

    public String toString(){
        String tempString = super.toString();
        String surveyMarkerString;
        surveyMarkerString = "Horiz Datum is " + horiz_datum + "\nEasting is " + easting + "\nNorthing is " + northing + "\n" + tempString; 
        return surveyMarkerString;
    }






}
