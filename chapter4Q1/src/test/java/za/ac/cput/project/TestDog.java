package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestDog {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testFurOrHairColour()
    {
        System.out.println("Request Colour From User");
        Dog test = new Dog();
        String strTest = test.HairOrFur();
        Assert.assertNotNull("Hair colour cannot be null", strTest);
    }
    @AfterClass
    public static void afterClass()
    {

    }
}
