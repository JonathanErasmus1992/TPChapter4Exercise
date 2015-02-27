package za.ac.cput.project;

/**
 * Created by student on 2015/02/27.
 */
public class Bird extends Animal implements Oviparous{
    private final String Sound = "Chirp";
    private final String Child = "Chick";
    private final String LifeExpectancy = "Between 7 months and 30+ years";
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
        return "Between 17 and 28 Days";
    }
    public String SkinCovering()
    {
        return "Feathers";
    }
}
