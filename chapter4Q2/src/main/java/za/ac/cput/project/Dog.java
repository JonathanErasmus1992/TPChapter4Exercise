package za.ac.cput.project;

import javax.swing.*;

/**
 * Created by student on 2015/02/27.
 */
public class Dog extends Animal implements Mammal{
    private final String Sound = "Bark";
    private final String Child = "Puppy";
    private final String LifeExpectancy = "Between 7 and 20 Years";
    public Dog()
    {
        super();
    }
    public String getSound()
    {
        return Sound;
    }
    public String getChild()
    {
        return Child;
    }
    public String getLifeExpectancy()
    {
        return LifeExpectancy;
    }
    public String BirthPeriod()
    {
        return "Between 58 and 65 Days";
    }
    public String HairOrFur()
    {
        String strHairOrFurColour = "";
        strHairOrFurColour = JOptionPane.showInputDialog(null, "Please enter the coat colour of your dogs hair or fur:");
        return strHairOrFurColour;
    }
}
