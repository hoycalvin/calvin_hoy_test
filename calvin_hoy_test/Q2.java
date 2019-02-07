import java.util.*;

public class Q2{     
    public static float strToFloat(String convertStr){
        float val = Float.parseFloat(convertStr);
        return val;
    }

	public static void versionControl(String v1, String v2){
        String strV1 = v1.replaceAll("[^0.0-9.0]", "");
        String strV2 = v2.replaceAll("[^0.0-9.0]", "");
        Float fltV1 = strToFloat(strV1);
        Float fltV2 = strToFloat(strV2);

        //v1 always comes first in output statements, since it is the "original"
        if(fltV1 > fltV2){
            System.out.println(fltV1 + " is greater than " + fltV2);
        }else if(fltV1 < fltV2){
            System.out.println(fltV1 + " is less than " + fltV2);
        }else{
            System.out.println(fltV1 + " is equal to " + fltV2);
        }
    }


    public static void main(String[] args){

        versionControl("version0.0", "version0.0"); //zero base case
        versionControl("version1", "version1");     //no decimal points, equal
        versionControl("version1", "version2");     //no decimal points, less than
        versionControl("version2", "version1");     //no decimal points, greater than
        versionControl("version1.1", "version1.1"); //decimal points, equal
        versionControl("version1.1", "version1.2"); //decimal points, less than
        versionControl("version1.2", "version1.1"); //decimal points, greater than
        versionControl("version1.123", "version1.12"); //trailing decimals, greater than
        versionControl("version1.14", "version1.142"); //trailing decimals, less than
    }
    
}