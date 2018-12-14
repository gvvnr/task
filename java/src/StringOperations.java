/*
 * Write a program to use all possible methods of String operations
 */
public class StringOperations {
	public static void main(String args[]){
		String s1="semantic bits";
		String s2="semantic bits";
		String s3=new String("semantic bits");
		
		String name="sonoo";  
		String sf1=String.format("name is %s",name);  
		
		
		
		
		System.out.println(s1==s2);//return true as it compares the address as s2 directs to memory location of s1
		System.out.println(s2==s3);//return false as it compares the address as s3 used new key word separate memory is allocated
		System.out.println(s1.equals(s2));//returns true as compares values inside the string
		System.out.println(s2.equals(s3));//returns true as compares values inside the string
		System.out.println(s1.length());//prints the length of the string
		for(int i=0;i<s1.length();i++){//prints each character in the given string
			System.out.print(s1.charAt(i));
		}
		System.out.println(s1.compareTo(s2));//calculates the length of both the strings
		                               //if length of s1>s2 then prints positive value
		                               //if length of s1<s2 then prints negative value
	                                  ////if length of s1==s2 then prints 0
		String s4=s1.concat("is an IT company");//concat() method concatenates one string with another string
		System.out.println(s4);
		System.out.println(s2.contains("bits"));//returns true if the given string in the contains method is present in the string s2
		System.out.println(s1.endsWith("s"));//returns true if the last word is the string s1 is s
		System.out.println(s1.equalsIgnoreCase(s2));//if both the strings have same characters irrespective of capital or small prints true
		//System.out.println("company name is : %s",s1);
		//System.out.println(format);
		

		
	}

}
