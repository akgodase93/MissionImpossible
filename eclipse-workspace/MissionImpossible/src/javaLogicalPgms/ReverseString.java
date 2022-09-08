package javaLogicalPgms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="akshay";
		String revString="";
		for(int i=str.length()-1; i>=0 ; i--)
		{
			char c=str.charAt(i);
			revString=revString + c;
			
		}
		System.out.println(revString);
		
	}

}
