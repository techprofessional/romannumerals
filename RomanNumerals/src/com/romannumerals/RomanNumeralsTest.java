package com.romannumerals;

import static org.techtest.core.IsEqual.*;
import static org.techtest.core.Is.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

	private RomanNumeral number;

	@Before
	public void setUp() throws Exception {
		number = new RomanNumeral();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void zero() {
		String romanNumber = number.fromInt(0);
		
		assertThat(romanNumber, equalTo(""));
	}
	
	@Test
	public void negativeNumber(){
		String romanNumber = number.fromInt(-1);
		
		assertThat(romanNumber, equalTo(""));
	}
	
	@Test
	public void one() {
		String romanNumber = number.fromInt(1);
		
		assertThat(romanNumber, equalTo("I"));
	}

	@Test
	public void two() {
		String romanNumber = number.fromInt(2);
		
		assertThat(romanNumber, equalTo("II"));
	}
	
	@Test
	public void three() {
		String romanNumber = number.fromInt(3);
		
		assertThat(romanNumber, equalTo("III"));
	}
	
	@Test
	public void five(){
		String romanNumber = number.fromInt(5);
		
		assertThat(romanNumber, equalTo("V"));
	}
	
	@Test
	public void six(){
		String romanNumber = number.fromInt(6);
		
		assertThat(romanNumber, equalTo("VI"));
	}
	
	@Test
	public void seven(){
		String romanNumber = number.fromInt(7);
		
		assertThat(romanNumber, equalTo("VII"));
	}

	@Test
	public void eight(){
		String romanNumber = number.fromInt(8);
		
		assertThat(romanNumber, equalTo("VIII"));
	}
	
	@Test
	public void ten(){
		String romanNumber = number.fromInt(10);
		
		assertThat(romanNumber, equalTo("X"));
	}
	
	@Test
	public void eleven(){
		String romanNumber = number.fromInt(11);
		
		assertThat(romanNumber, equalTo("XI"));
	}
	
	@Test
	public void twelve(){
		String romanNumber = number.fromInt(12);
		
		assertThat(romanNumber, equalTo("XII"));
	}
	
	@Test
	public void thirteen(){
		String romanNumber = number.fromInt(13);
		
		assertThat(romanNumber, equalTo("XIII"));
	}
	
	@Test
	public void fifteen(){
		String romanNumber = number.fromInt(15);
		
		assertThat(romanNumber, equalTo("XV"));
	}
	
	@Test
	public void sixteen(){
		String romanNumber = number.fromInt(16);
		
		assertThat(romanNumber, equalTo("XVI"));
	}
	
	@Test
	public void twenty(){
		String romanNumber = number.fromInt(20);
		
		assertThat(romanNumber, equalTo("XX"));
	}
	
	@Test
	public void four(){
		String romanNumber = number.fromInt(4);
		
		assertThat(romanNumber, equalTo("IV"));
	}
	
	@Test
	public void fourteen(){
		String romanNumber = number.fromInt(14);
		
		assertThat(romanNumber, equalTo("XIV"));
	}
	
	@Test
	public void twentyThree(){
		String romanNumber = number.fromInt(23);
		
		assertThat(romanNumber, equalTo("XXIII"));
	}
	
	@Test
	public void twentyFour(){
		String romanNumber = number.fromInt(24);
		
		assertThat(romanNumber, equalTo("XXIV"));
	}
	
	@Test
	public void twentyFive(){
		String romanNumber = number.fromInt(25);
		
		assertThat(romanNumber, equalTo("XXV"));
	}
	
	@Test
	public void twentySix(){
		String romanNumber = number.fromInt(26);
		
		assertThat(romanNumber, equalTo("XXVI"));
	}
	
	@Test
	public void thirty(){
		String romanNumber = number.fromInt(30);
		
		assertThat(romanNumber, equalTo("XXX"));
	}
	
	@Test
	public void thirtyThree(){
		String romanNumber = number.fromInt(30);
		
		assertThat(romanNumber, equalTo("XXX"));
	}
	
	@Test
	public void thirtyFour(){
		String romanNumber = number.fromInt(34);
		
		assertThat(romanNumber, equalTo("XXXIV"));
	}
	
	@Test
	public void thirtyEight(){
		String romanNumber = number.fromInt(38);
		
		assertThat(romanNumber, equalTo("XXXVIII"));
	}
	
	@Test
	public void nine(){
		String romanNumber = number.fromInt(9);
		
		assertThat(romanNumber, equalTo("IX"));
	}
	
	@Test
	public void nineteen(){
		String romanNumber = number.fromInt(19);
		
		assertThat(romanNumber, equalTo("XIX"));
	}
	
	@Test
	public void twentyNine(){
		String romanNumber = number.fromInt(29);
		
		assertThat(romanNumber, equalTo("XXIX"));
	}
	
	@Test
	public void thirtyNine(){
		String romanNumber = number.fromInt(39);
		
		assertThat(romanNumber, equalTo("XXXIX"));
	}
	
	@Test
	public void fifty(){
		String romanNumber = number.fromInt(50);
		
		assertThat(romanNumber, equalTo("L"));
	}
	
	@Test
	public void fiftyThree(){
		String romanNumber = number.fromInt(53);
		
		assertThat(romanNumber, equalTo("LIII"));
	}
	
	@Test
	public void fiftyFour(){
		String romanNumber = number.fromInt(54);
		
		assertThat(romanNumber, equalTo("LIV"));
	}
	
	@Test
	public void fiftyFive(){
		String romanNumber = number.fromInt(55);
		
		assertThat(romanNumber, equalTo("LV"));
	}
	
	@Test
	public void fiftySix(){
		String romanNumber = number.fromInt(56);
		
		assertThat(romanNumber, equalTo("LVI"));
	}
	
	@Test
	public void forty(){
		String romanNumber = number.fromInt(40);
		
		assertThat(romanNumber, equalTo("XL"));
	}
	
	@Test
	public void fortyOne(){
		String romanNumber = number.fromInt(41);
		
		assertThat(romanNumber, equalTo("XLI"));
	}
	
	@Test
	public void fortyFour(){
		String romanNumber = number.fromInt(44);
		
		assertThat(romanNumber, equalTo("XLIV"));
	}
	
	@Test
	public void fortyFive(){
		String romanNumber = number.fromInt(45);
		
		assertThat(romanNumber, equalTo("XLV"));
	}
	
	@Test
	public void fortyNine(){
		String romanNumber = number.fromInt(49);
		
		assertThat(romanNumber, equalTo("XLIX"));
	}
	
	@Test
	public void sixty(){
		String romanNumber = number.fromInt(60);
		
		assertThat(romanNumber, equalTo("LX"));
	}
	
	@Test
	public void seventy(){
		String romanNumber = number.fromInt(70);
		
		assertThat(romanNumber, equalTo("LXX"));
	}
	
	@Test
	public void eighty(){
		String romanNumber = number.fromInt(80);
		
		assertThat(romanNumber, equalTo("LXXX"));
	}
	
	@Test
	public void eightyFour(){
		String romanNumber = number.fromInt(84);
		
		assertThat(romanNumber, equalTo("LXXXIV"));
	}
	
	@Test
	public void eightyNine(){
		String romanNumber = number.fromInt(89);
		
		assertThat(romanNumber, equalTo("LXXXIX"));
	}
	
	@Test
	public void oneHundred(){
		String romanNumber = number.fromInt(100);
		
		assertThat(romanNumber, equalTo("C"));
	}
	
	@Test
	public void ninety(){
		String romanNumber = number.fromInt(90);
		
		assertThat(romanNumber, equalTo("XC"));
	}
	
	@Test
	public void ninetyOne(){
		String romanNumber = number.fromInt(91);
		
		assertThat(romanNumber, equalTo("XCI"));
	}
	
	@Test
	public void ninetyFour(){
		String romanNumber = number.fromInt(94);
		
		assertThat(romanNumber, is("XCIV"));
	}
	
	@Test
	public void ninetySix(){
		String romanNumber = number.fromInt(96);
		
		assertThat(romanNumber, equalTo("XCVI"));
	}
	
	@Test
	public void ninetyNine(){
		String romanNumber = number.fromInt(99);
		
		assertThat(romanNumber, equalTo("XCIX"));
	}
	
	@Test
	public void oneHundredAndOne(){
		String romanNumber = number.fromInt(101);
		
		assertThat(romanNumber, equalTo("CI"));
	}
	
	@Test
	public void oneHundredAndFour(){
		String romanNumber = number.fromInt(104);
		
		assertThat(romanNumber, equalTo("CIV"));
	}
	
	@Test
	public void oneHundredAndEight(){
		String romanNumber = number.fromInt(108);
		
		assertThat(romanNumber, equalTo("CVIII"));
	}
	
	@Test
	public void oneHundredAndNine(){
		String romanNumber = number.fromInt(109);
		
		assertThat(romanNumber, equalTo("CIX"));
	}
	
	@Test
	public void oneHundredAndTen(){
		String romanNumber = number.fromInt(110);
		
		assertThat(romanNumber, equalTo("CX"));
	}
	
	@Test
	public void oneHundredAndForty(){
		String romanNumber = number.fromInt(140);
		
		assertThat(romanNumber, equalTo("CXL"));
	}
	
	@Test
	public void oneHundredAndFifty(){
		String romanNumber = number.fromInt(150);
		
		assertThat(romanNumber, equalTo("CL"));
	}
	
	@Test
	public void oneHundredAndSeventy(){
		String romanNumber = number.fromInt(170);
		
		assertThat(romanNumber, equalTo("CLXX"));
	}
	
	@Test
	public void oneHundredAndNinety(){
		String romanNumber = number.fromInt(190);
		
		assertThat(romanNumber, equalTo("CXC"));
	}
	
	@Test
	public void twoHundred(){
		String romanNumber = number.fromInt(200);
		
		assertThat(romanNumber, equalTo("CC"));
	}
	
	@Test
	public void threeHundred(){
		String romanNumber = number.fromInt(300);
		
		assertThat(romanNumber, equalTo("CCC"));
	}
	
	/*@Test
	public void fiveHundred(){
		String romanNumber = number.fromInt(500);
		
		assertThat(romanNumber, equalTo("D"));
	}*/
	
	
	
}
