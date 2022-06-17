package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class RemoveStringTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void withoutStringTest1(){
        String expected = "He there";
        String actual = stringsAndThings.removeString("Hello there", "llo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest2(){
        String expected = "Hllo thr";
        String actual = stringsAndThings.removeString("Hello there", "e");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest3(){
        String expected = "Hello there";
        String actual = stringsAndThings.removeString("Hello there", "x");
        Assert.assertEquals(expected, actual);
    }

}
