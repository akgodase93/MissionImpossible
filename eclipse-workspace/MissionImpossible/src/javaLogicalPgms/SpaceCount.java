package javaLogicalPgms;

public class SpaceCount {

	public static void main(String[] args) 
	{
		String str="akshay is good boy";
		int count=0;
		for(int i=0; i< str.length()-1; i++)
		{
				char c=str.charAt(i);
				if(c == ' ')
				{
					count ++;
				}
		}
		System.out.println("White Space Count: "+count);
	}

}
