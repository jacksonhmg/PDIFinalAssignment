import java.util.*;

public class Station {
    private String id_code;
    private double lat;
    private double lon;


    //Parameters Constructor
    public Station(String pId_code, double plat, double plon){
        id_code = pId_code;
        lat = plat;
        lon = plon;
    }

    //Copy Constructor
    public Station(Station pStation){
        id_code = pStation.getID();
        lat = pStation.getLat();
        lon = pStation.getLon();
    }

    //Default Constructor
    public Station(){
        id_code = "SSM000001";
        lat = 0;
        lon = 0;
    }

    //Following are the Accessors (getters)
    public String getID(){
        return id_code;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    //Following are the Mutators (setters)
    public void setID(String pID){
        id_code = pID;
    }

    public void setLat(double pLat){
        lat = pLat;
    }

    public void setLon(double pLon){
        lon = pLon;
    }


    public boolean equals(Object inObject){
        boolean isEqual = false;
        Station inStation = null;
        if(inObject instanceof Station){
            inStation = (Station)inObject;
            if(id_code.equals(inStation.getID())){
                if(lat == inStation.getLat()){
                    if(lon == inStation.getLon()){
                        isEqual = true;
                    }
                }
            }
        }
        return isEqual;
    }

    public String toString(){
        String stationString;
        stationString = "ID Code is " + id_code + "\nLat is " + lat + "\nLon is " + lon;
        return stationString;
    }

}