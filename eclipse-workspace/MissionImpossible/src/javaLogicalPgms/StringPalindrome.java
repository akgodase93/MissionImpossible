package javaLogicalPgms;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		String str="MOm";
		String revString="";
		System.out.println("Orignal String: "+str);
		for(int i=str.length()-1; i>=0; i--)
		{
			revString=revString+ str.charAt(i);
		}
		System.out.println("Reverse String: "+revString);
		
		if(str.equalsIgnoreCase(revString))
		{
			System.out.println("String is Palindrome");
		}
		
		else
			System.out.println("String is Not Palindrome");
	}

}
