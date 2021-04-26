import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseMethodTest {
    String str="Hello";
    String str1="Hello ";
    String str2=" Hello";
    String str3="Hello World";
    String str4=" ";
    String str5="  ";


    @Test
    public void getStringReverse(){
        assertEquals("olleH",ReverseMethod.getStringReverse(str));
        assertEquals(" olleH",ReverseMethod.getStringReverse(str1));
        assertEquals("olleH ",ReverseMethod.getStringReverse(str2));
        assertEquals("dlroW olleH",ReverseMethod.getStringReverse(str3));
        assertEquals(" ",ReverseMethod.getStringReverse(str4));
        assertEquals("  ",ReverseMethod.getStringReverse(str5));



    }

}