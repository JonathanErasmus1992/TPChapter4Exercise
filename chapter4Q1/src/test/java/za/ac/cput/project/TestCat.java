package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestCat {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testFurOrHairColour()
    {
        System.out.println("Request Colour From User");
        Cat test = new Cat();
        String strTest = test.HairOrFur();
        Assert.assertNotNull("Hair or Fur Colour Cannot Be Null", strTest);
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
