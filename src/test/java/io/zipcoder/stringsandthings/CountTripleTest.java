package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountTripleTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }

    @Test
    public void countTripleTest1(){
        Integer expected = 1;
        Integer actual = stringsAndThings.countTriple("abcXXXabc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest2(){
        Integer expected = 3;
        Integer actual = stringsAndThings.countTriple("xxxabyyyycd");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countTripleTest3(){
        Integer expected = 0;
        Integer actual = stringsAndThings.countTriple("a");
        Assert.assertEquals(expected, actual);
    }


}
