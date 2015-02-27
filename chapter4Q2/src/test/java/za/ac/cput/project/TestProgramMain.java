package za.ac.cput.project;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class TestProgramMain {
    @BeforeClass
    public static void beforeClass()
    {

    }
    @Test
    public void testAnimalType()
    {
        System.out.println("Request Type From User");
        ProgramMain test = new ProgramMain();
        String aniType = test.AnimalType();
        Assert.assertNotNull("The variable is null", aniType);
    }
    @Test
    public void testPetName()
    {
        System.out.println("Request Pet Name From User");
        ProgramMain test = new ProgramMain();
        String petName = test.AniPetName();
        Assert.assertNotNull("Pet name cannot be left null", petName);
    }
    @Test
    public void testPetAge()
    {
        System.out.println("Request Pet Age From User");
        ProgramMain test = new ProgramMain();
        int petAge = test.AniPetAge();
        Assert.assertNotNull("Pet age cannot be left null", petAge);
    }
    @Test
    public void testPetGender()
    {
        System.out.println("Request Pet Gender From User");
        ProgramMain test = new ProgramMain();
        String petGender = test.AniGender();
        Assert.assertNotNull("Pet gender cannot be left null", petGender);
    }
    @Test
    public void testBreedOrSpecies()
    {
        System.out.println("Request Pet Breed or Species From User");
        ProgramMain test = new ProgramMain();
        String petBreedorSpecies = test.AniBreedorSpecies();
        Assert.assertNotNull("Pet breed or species cannot be left null", petBreedorSpecies);
    }
    @Test
    public void testDisplayPetDetails()
    {
        System.out.println("Display Details For User");
        //ProgramMain test = new ProgramMain();
        String petDetails = "";
        Assert.assertNotNull("Pet details cannot return null", petDetails);
    }

    @AfterClass
    public static void afterClass()
    {


    }
}
