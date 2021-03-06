import java.util.*;

public class Q2{
	//conversion method, converts all strings to floats
    public static float strToFloat(String convertStr){
        float val = Float.parseFloat(convertStr);
        return val;
    }

    public static void versionControl(String v1, String v2){
	//extract float values from string
       	String strV1 = v1.replaceAll("[^0.0-9.0]", "");
        String strV2 = v2.replaceAll("[^0.0-9.0]", "");
	
	//use conversion method and store new floats
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
	//test cases
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

/*
Missing functionality: 
My assumption is that, currently, this is how versions are titled. If titled differently, I would have created 3 more methods
entitled "greaterThan", "lessThan", and "equalTo" and replaced the if statement within versionControl() with calls to the 
three comparative functions. The three functions would have increased testing, where I could check if there are more decimal points,
if letters counted as versions (i.e versionA vs versionB), or other factors not mentioned. But, for now, I kept it simple.
*/
