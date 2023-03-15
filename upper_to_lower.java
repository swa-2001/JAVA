//CONVERT STRING FROM UPPER TO LOWER CASE WITHOUT BUILT IN FUNCTIONS
package practice;
import java.util.*;
public class Leetcode1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String word=sc.next();
        // String lowercase_word=word.toLowerCase();
        // System.out.println(lowercase_word);
        String lowercase_word="";
        for(int i=0;i<word.length();i++){
            if((int)word.charAt(i)>=65&&(int)word.charAt(i)<=90){
                char c=(char)((int)word.charAt(i)+32);
                lowercase_word+=c;
            }
            else{
                lowercase_word+=word.charAt(i);
            }
        }
        System.out.println(lowercase_word);
    }
	}

