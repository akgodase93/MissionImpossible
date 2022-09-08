package javaLogicalPgms;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatingAlphabets {

	public static void main(String[] args) 
	{
		String str="akshayshh";
		HashMap<Character, Integer> mp=new HashMap<>();
		for(int i=0; i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		Set<Character> keys=mp.keySet();
		for(Character key: keys)
		{
			System.out.println(key+":"+mp.get(key));
		}
	}

}
