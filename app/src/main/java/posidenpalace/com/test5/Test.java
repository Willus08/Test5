package posidenpalace.com.test5;

/**
 * Created by Android on 7/21/2017.
 */

public class Test {

    private static final String TAG = "test";

    public static void main(String[] args) {
        System.out.println(parentesesCheck("{}()[]"));
        System.out.println(subStringCount("catcowcat","cow",2));
    }

    public static  boolean parentesesCheck(String p){


          if (p.charAt(0) == '{'||p.charAt(0) == '['||p.charAt(0) == '(')
            {

                char send ='1';
                if (p.charAt(0) == '{')
                    send = '}';
                if (p.charAt(0) == '(')
                    send = ')';
                if (p.charAt(0) == '[')
                    send = ']';
                return paraHelper(p.substring(1), send);
              
            }


        return false;

    }


    public static boolean paraHelper(String sub, char expected) {
      
            if (sub.charAt(0) == expected) {
                return true;
            }else if (sub.charAt(0) == '{'||sub.charAt(0) == '['||sub.charAt(0) == '(')
            {
                char send ='1';
                if (sub.charAt(0) == '{')
                    send = '}';
                if (sub.charAt(0) == '(')
                    send = ')';
                if (sub.charAt(0) == '[')
                    send = ']';
//
                return paraHelper(sub.substring(1), send);
            }
        
        return false;
    }



    public static boolean subStringCount(String largeString, String smallString, int i){

        int count = 0;
        for (int j = 0; j < largeString.length(); j++) {
            if (j+ smallString.length() <= largeString.length()){
                if (largeString.substring(j,j+smallString.length()).equals(smallString)){
                    count++;
                }
            }

        }

        return (count == i);
    }
}
