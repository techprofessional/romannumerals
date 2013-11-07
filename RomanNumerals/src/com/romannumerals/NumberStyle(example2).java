

import java.text.*;

/**
 * Utility class to convert numbers to values like 4=d=D=iv=IV.
 */
public class NumberStyle
{
    /**
     * The maximum number for roman number conversion, 3000.
     */
    public static final int ROMAN_MAX = 3000;
    public static final char ROMAN_THOUSAND = 'M';
    public static final char ROMAN_FIVE_HUNDRED = 'D';
    public static final char ROMAN_HUNDRED = 'C';
    public static final char ROMAN_FIFTY = 'L';
    public static final char ROMAN_TEN = 'X';
    public static final char ROMAN_FIVE = 'V';
    public static final char ROMAN_ONE = 'I';

    public static final long ENGLISH_MAX = 999000000000000L;

    public static final String[] ONES = { "zero", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };

    public static final String[] TENS = { "zero", "ten", "twenty", "thirty",
            "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    public static final String HUNDRED = "hundred";
    public static final String THOUSAND = "thousand";
    public static final String MILLION = "million";
    public static final String BILLION = "billion";
    public static final String TRILLION = "trillion";

    public static final String ALPHA = "ZABCDEFGHIJKLMNOPQRSTUVWXY";

    /**
     * Convert an int to a roman numeral in all caps.
     * 
     * @param anInt
     *            The int to convert
     * @return The string containing the roman numeral
     */
    public static String convertToBigRoman(int anInt)
    {
        return convertToRoman(anInt, true);
    }

    /**
     * Convert an int to a roman numeral in lower case.
     * 
     * @param anInt
     *            The int to convert
     * @return The string containing the roman numeral
     */
    public static String convertToLittleRoman(int anInt)
    {
        return convertToRoman(anInt, false);
    }

    /**
     * Convert an int to a roman numeral.
     * 
     * @param anInt
     *            The int to convert
     * @param withCaps
     *            Whether or not to use caps
     * @return The string containing the roman numeral
     */
    protected static String convertToRoman(int anInt, boolean withCaps)
    {
        boolean wasNeg = (anInt < 0);
        int thousands, fivehundreds, hundreds, fifties, tens, fives, ones, i;
        StringBuffer buffer = new StringBuffer();

        if(wasNeg) anInt = -anInt;

        if(anInt < ROMAN_MAX)
        {
            thousands = anInt / 1000;
            fivehundreds = (anInt % 1000) / 500;
            hundreds = (anInt % 500) / 100;
            fifties = (anInt % 100) / 50;
            tens = (anInt % 50) / 10;
            fives = (anInt % 10) / 5;
            ones = (anInt % 5);

            if(thousands != 0)
            {
                for(i = thousands; i > 0; i--)
                {
                    buffer.append(ROMAN_THOUSAND);
                }
            }

            if(fivehundreds != 0)
            {
                if(hundreds == 4)
                {
                    buffer.append(ROMAN_HUNDRED);
                    buffer.append(ROMAN_THOUSAND);
                }
                else
                {
                    buffer.append(ROMAN_FIVE_HUNDRED);

                    for(i = hundreds; i > 0; i--)
                    {
                        buffer.append(ROMAN_HUNDRED);
                    }
                }
            }
            else
            {
                if(hundreds == 4)
                {
                    buffer.append(ROMAN_HUNDRED);
                    buffer.append(ROMAN_FIVE_HUNDRED);
                }
                else
                {
                    for(i = hundreds; i > 0; i--)
                    {
                        buffer.append(ROMAN_HUNDRED);
                    }
                }
            }

            if(fifties != 0)
            {
                if(tens == 4)
                {
                    buffer.append(ROMAN_TEN);
                    buffer.append(ROMAN_HUNDRED);
                }
                else
                {
                    buffer.append(ROMAN_FIFTY);

                    for(i = tens; i > 0; i--)
                    {
                        buffer.append(ROMAN_TEN);
                    }
                }
            }
            else
            {
                if(tens == 4)
                {
                    buffer.append(ROMAN_TEN);
                    buffer.append(ROMAN_FIFTY);
                }
                else
                {
                    for(i = tens; i > 0; i--)
                    {
                        buffer.append(ROMAN_TEN);
                    }
                }
            }

            if(fives != 0)
            {
                if(ones == 4)
                {
                    buffer.append(ROMAN_ONE);
                    buffer.append(ROMAN_TEN);
                }
                else
                {
                    buffer.append(ROMAN_FIVE);
                    for(i = ones; i > 0; i--)
                    {
                        buffer.append(ROMAN_ONE);
                    }
                }
            }
            else
            {
                if(ones == 4)
                {
                    buffer.append(ROMAN_ONE);
                    buffer.append(ROMAN_FIVE);
                }
                else
                {
                    for(i = ones; i > 0; i--)
                    {
                        buffer.append(ROMAN_ONE);
                    }
                }
            }

        }

        if(wasNeg) buffer.insert(0, '-');

        String retVal = buffer.toString();

        if(!withCaps) retVal = retVal.toLowerCase();

        return retVal;
    }

    /**
     * Convert an int to a string equivalent, like 4->D.
     * 
     * @param anInt
     *            The int to convert
     * @return The string, in Upper case
     */
    public static String convertToAlpha(int anInt)
    {
        boolean wasNeg = (anInt < 0);
        StringBuffer buffer = new StringBuffer();
        int mod, div;

        if(wasNeg)
            anInt = -anInt;

        mod = anInt % 26;
        div = anInt / 26;
        if(mod == 0)
            div -= 1;

        while(anInt > 0)
        {
            buffer.insert(0, ALPHA.charAt(mod));
            anInt = div;
            div = (anInt / 26);
            mod = anInt % 26;
            if(mod == 0)
                div -= 1;
        }

        if(wasNeg)
            buffer.insert(0, '-');

        return buffer.toString();
    }

    /**
     * Convert an int to a string equivalent, like 4->D.
     * 
     * @param anInt
     *            The int to convert
     * @return The string, in lower case
     */
    public static String convertToLittleAlpha(int anInt)
    {
        String retVal = convertToAlpha(anInt);

        return retVal.toLowerCase();
    }

    public static String convertToEnglish(int anInt)
    {
        return convertToEnglish((long) anInt);
    }

    public static String convertToEnglish(long anInt)
    {
        boolean wasNeg = (anInt < 0);
        long trillions, billions, millions, thousands, hundreds, tens, ones, i;
        StringBuffer buffer = new StringBuffer();
        boolean gotOne = false;

        if(wasNeg)
            anInt = -anInt;

        if(anInt < ENGLISH_MAX)
        {
            trillions = anInt / 1000000000000L;
            billions = anInt % 1000000000000L / 1000000000;
            millions = anInt % 1000000000 / 1000000;
            thousands = anInt % 1000000 / 1000;
            ones = anInt % 1000;

            if(trillions != 0)
            {
                formatToEnglish(trillions, buffer);
                buffer.append(" ");
                buffer.append(TRILLION);
                gotOne = true;
            }

            if(billions != 0)
            {
                if(gotOne) buffer.append(", ");
                formatToEnglish(billions, buffer);
                buffer.append(" ");
                buffer.append(BILLION);
                gotOne = true;
            }

            if(millions != 0)
            {
                if(gotOne) buffer.append(", ");
                formatToEnglish(millions, buffer);
                buffer.append(" ");
                buffer.append(MILLION);
                gotOne = true;
            }

            if(thousands != 0)
            {
                if(gotOne) buffer.append(", ");
                formatToEnglish(thousands, buffer);
                buffer.append(" ");
                buffer.append(THOUSAND);
                gotOne = true;
            }

            if(ones == 0 && !gotOne)
            {
                formatToEnglish(ones, buffer);
            }
            else if(ones != 0)
            {
                if(gotOne) buffer.append(", ");
                formatToEnglish(ones, buffer);
            }
        }

        if(wasNeg)
            buffer.insert(0, "negative ");

        return buffer.toString();
    }

    protected static void formatToEnglish(long number, StringBuffer buffer)
    {
        long hundreds = number / 100;
        long tens = number % 100 / 10;
        long ones = number % 10;
        boolean gotOne = false;

        if(hundreds > 0)
        {
            buffer.append(ONES[(int) hundreds]);
            buffer.append(" ");
            buffer.append(HUNDRED);
            gotOne = true;
        }

        if(tens > 1)
        {
            if(gotOne)
                buffer.append(" ");
            buffer.append(TENS[(int) tens]);
            gotOne = true;
        }

        if(tens == 1)
        {
            if(gotOne)
                buffer.append(" ");
            buffer.append(ONES[(int) (ones + 10)]);
        }
        else if(ones > 0)
        {
            if(gotOne)
                buffer.append(" ");
            buffer.append(ONES[(int) ones]);
        }
        else if(number == 0)
        {
            buffer.append(ONES[0]);
        }
    }

    public static String convertToReadableMemorySize(long size)
    {

        long megabytes = (long) Math.pow(2, 20);
        long kilobytes = (long) Math.pow(2, 10);
        long gigabytes = (long) Math.pow(2, 30);

        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMaximumFractionDigits(3);

        double relSize = 0.0d;
        long absSize = Math.abs(size);
        String id = "";

        if((absSize / gigabytes) >= 1)
        {
            relSize = (double) absSize / (double) gigabytes;
            id = "GB";
        }
        else if((absSize / megabytes) >= 1)
        {
            relSize = (double) absSize / (double) megabytes;
            id = "MB";
        }
        else if((absSize / kilobytes) >= 1)
        {
            relSize = (double) absSize / (double) kilobytes;
            id = "KB";
        }
        else
        {
            relSize = absSize;
            id = "b";
        }
        return format.format((size < 0 ? -1 : 1) * relSize) + id;
    }
}
