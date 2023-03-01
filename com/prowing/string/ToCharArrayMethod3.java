package com.prowing.string;

public class ToCharArrayMethod3 {

		public static void main(String[] args) {
			
		
		
		
		String line = "india is my country india have 27 state";

		
		String []words=line.split(" ");
		
		int wordscount=0;
		for (int i=0;i<words.length;i++) {
			
			for (int j=0;j<words.length;j++)  
			{
				if(words[i].equals(words[j])) {
					
					wordscount++;
				}
			}
			System.out.println(words[i]+ " occours " + wordscount +" times ");
			
			wordscount=0;
		}
		}
}
		
		
		
		
		

