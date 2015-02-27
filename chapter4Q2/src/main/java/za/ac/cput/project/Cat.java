package za.ac.cput.project;

import javax.swing.*;

/**
 * Created by student on 2015/02/27.
 */
public class Cat extends Animal implements Mammal {
    private final String Sound = "Meow";
    private final String Child = "Kitten";
    private final String LifeExpectancy = "Between 12 and 20 Years";
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
        return "Between 58 and 63 Days";
    }
    public String HairOrFur()
    {
        String strHairOrFurColour = "";
        strHairOrFurColour = JOptionPane.showInputDialog(null, "Please enter the coat colour of your cats hair or fur:");

        return strHairOrFurColour;
    }
}
