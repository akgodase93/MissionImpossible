package javaLogicalPgms;

public class StringLengthWithoutLengthMethod {
	
	public static int length(String str)
	{	char[] c=str.toCharArray();
		int len=0;
		for(char charArray: c )
		{
			len++;	
		}
		return len;
	}
	public static void main(String[] args) 
	{
		String str="abc"; 
		
		int lenthofstring=length(str);
		System.out.println(lenthofstring); //3
	}

}
