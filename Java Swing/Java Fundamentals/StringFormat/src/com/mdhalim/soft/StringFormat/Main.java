package com.mdhalim.soft.StringFormat;

public class Main {

	public static void main(String[] args) {
		
		//String Format
		 
		//String.format(arg0, arg1)
		
		/* Basic Rules for String formating 
		 * " %(argument index ) (flag) (width) (.precision) type "
		 * 
		 */
		
		/*String stringResult = String.format("Integer: %d\n",20);
		System.out.println(stringResult);*/
		
		/*String floatString = String.format("A Floating point number with 3 decimal digits :%.3f \n", 5.2);
		System.out.println(floatString);*/
		
		/*String floatString2 = String.format("A Floating point number with 10 decimal digits :%.10f \n", 5.45);
		System.out.println(floatString2);*/
		
		/*String stringValue = String.format("String : %s", "Halim");
		System.out.println(stringValue);
		
		String multipleStringValues = String.format("String : %s Integer : %d float : %.2f", "Hi",5,5.9);
		System.out.println(multipleStringValues);*/
		
		 String strValue =String.format("Integer :%4d", 45);
		// System.out.println(strValue);
		 
		 String strValue1 =String.format("Integer :%4d", 45234);
		// System.out.println(strValue1);
		 
		 String strValue2 =String.format("Integer :%-5d", 66);
		// System.out.print(strValue2);
		// System.out.println("ABCDE");
		 
		 
		 String strValue3 =String.format("Integer :%09d", 1);
		 //System.out.println(strValue3);
		 
		 String strValue4 =String.format(" %-15s%-15s%s", "First Cloumn" , "Second Cloumn" , "Third Cloumn");
		 System.out.println(strValue4);
	}

}