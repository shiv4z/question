import java.util.*;
public class Strings {

    public static String subString(String s,int si,int ei){
        String sb ="";
        for(int i=si;i<ei;i++){
            sb += s.charAt(i);
        }
        return sb;
    }

    public static String largest(String[] arr){
        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
           if(largest.compareTo(arr[i] )< 0){
             largest = arr[i];
           }
        }
        return largest;
    }

    public static String firstWordUpper(String s){
        StringBuilder sb= new StringBuilder(""); 
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i =1; i<s.length(); i++){
              if(s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
              }else{
                sb.append(s.charAt(i));
              }
        }
        return sb.toString();
    }

    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count >1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length-1)){
                return false;
            }
            length--;
        }
        return true;
    }

    public static float displacement(String dir){
        int x = 0, y = 0;
        for(int i = 0; i < dir.length(); i++){
            if(dir.charAt(i) == 'E'){
                x++;
            }else if(dir.charAt(i) == 'W'){
                x--;
            }else if(dir.charAt(i) == 'N'){
                y++;
            }else if(dir.charAt(i) == 'S'){
                y--;
            }
        }
        int x1 = x*x;
        int y1 = y*y;
        float dist = (float)Math.sqrt(x1+y1);
        return dist;
    }

    public static int vowelCount(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) == 'i'
        || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
            count++;
        }
        }
         return count;
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            int count = 0;
             for(int j =0; j < str2.length(); j++){
                if(ch == str2.charAt(j)){
                    count++;
                }
             }
             if(count == 0){
                return false;
             }
        }
        return true;
        }
        
    }

    public static boolean checkAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            char[] charSeq1 = str1.toCharArray();
            char[] charSeq2 = str2.toCharArray();
            
            Arrays.sort(charSeq1);
            Arrays.sort(charSeq2);
            boolean isresult = Arrays.equals(charSeq1, charSeq2);
            if(isresult){
                return true;
            }else{
                return false;
            }


        }
        
    }
    public static void main(String[] args){
    //    String s = "HELLOWORLD";
    //    System.out.println(subString(s, 0, 5 ));
       
    //    String s = "hI i aM sHIV pRASAD";
    //    System.out.println(firstWordUpper(s));

    //    String s = "aaabbccsssaaa";
    //    System.out.println(stringCompression(s));

    //    String s = "shiv";
    //    System.out.println(isPalindrome(s));

    //    String dir = "WNEENESENNN";
    //    System.out.println(displacement(dir));

    //    String s = "My name is shiv prasad";
    //    System.out.println(vowelCount(s));
        
        String str1 = "raced";
        String str2 = "cared";
        //System.out.println(isAnagram(str1, str2));
        System.out.println(checkAnagrams(str1, str2));
        

    }
}