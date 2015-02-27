package za.ac.cput.project;

/**
 * Created by student on 2015/02/27.
 */
public class Reptile extends Animal implements Oviparous {
    private final String Sound = "Non-Vocal, makes use of body language";
    private final String Child = "Hatch-ling";
    private final String LifeExpectancy = "Between 1 and 40+ Years";
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
    public String HatchingPeriod()
    {
        return "Between 15 and 31 Days";
    }
    public String SkinCovering()
    {
        return "Scales and or Shell";
    }
}
