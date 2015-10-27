package org.agilar.csd.tdd;

public class Utils {
	
	public static int convertToNumerOrZero(String str)  
	{  
	  int valueConverter = 0;
	  try  
	  {  
		  valueConverter = Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
		  valueConverter = 0;  
	  }  
	  return valueConverter;  
	}

}
