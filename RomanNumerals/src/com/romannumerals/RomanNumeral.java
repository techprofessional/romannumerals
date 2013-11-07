package com.romannumerals;


public class RomanNumeral {

	private int[] numbers = new int[] { 500, 100, 90, 50, 40, 10, 5, 4};
	
	private String[] romanNumerals = new String[]{ "", "C", "XC", "L", "XL", "X", "V", "IV" };
	
	public String fromInt(int n) {
		if(n <= 0)
			return "";
		
		if(n < 4){
			String romanNumeral = "";
			for(int i = 0; i < n; i++){
				romanNumeral += "I";
			}
			return romanNumeral;
		}else if(n < 9){
			String five = "V";
			if(n > 5){
				return five + fromInt(n - 5);
			}else{
				return fromInt(5 - n) + five;
			}
		}else if(n < 40){
			String ten = "X";
			if(n > 10){
				return ten + fromInt(n - 10);
			}else{
				return fromInt(10 - n) + ten;
			}
		}else if(n < 90){
			if(n >= 50){
				return "L" + fromInt(n - 50);
			}else if(n < 90){
				String forty = "XL";
				return forty + fromInt(n - 40);
			}
		}else{
			if(n >= 100){
				return "C" + fromInt(n - 100);
			}else{
				return "XC" + fromInt(n - 90);
			}
		}
		
		return "";

	}
	
}
