/*
 * 10> Write a program to find below ones from the given string
    a> the positions of substring
    b> repeated count of substring
    c> remove the occurrence of the substring from main string and print
    i/p: 
        Main string: String s = "This is my palace"
        substring: is
    o/p:sub-string: is
        indexes: 2,5
        repeated count: 2
        main string after removal: "Th  my palace"
 */
import java.util.Scanner;
public class SubString {
	Scanner sc;
	int repeat;
	String str;
	String subString;
	String[] word;
	
	SubString(){
		sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		str=sc.nextLine();
		System.out.println("Enter the sub-string to match :");
		subString=sc.next();
		
	}
	public void wordCount(){

		word=str.split(" ");
		for(int index=0;index<word.length;index++){
			if(word[index].contains(subString)){
				//String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
				
				repeat++;
			}
		}
		System.out.println("repeated count : "+repeat);
		/*
		 * boolean is_match=true;
		for(int i=0;i<str.length();i++){
			
			for(int j=0;j<subString.length();j++){
				if(str.charAt(i)!=subString.charAt(j)){
					is_match=false;
				}
			}
			
		}
		*/
		
		
		str=str.replaceAll(subString, "");
		System.out.println(str);
         
		
	}
	public static void main(String args[]){
		SubString s=new SubString();
		s.wordCount();


	}

}
