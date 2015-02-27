package za.ac.cput.project;

/**
 * Created by student on 2015/02/27.
 */
public class Animal {
    private String petname = "";
    private int age = 0;
    private String gender = "";
    private String breedorspecies = "Not Compulsory";
    public Animal(){}
    public Animal(String pn, int a, String g, String bos)
    {
        petname = pn;
        age = a;
        gender = g;
        breedorspecies = bos;
    }
    public void setPetName( String pn)
    {
        petname = pn;
    }
    public String getPetName()
    {
        return petname;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
    public void setGender(String g)
    {
        gender = g;
    }
    public String getGender()
    {
        return gender;
    }
    public void setBreedorSpecies(String bos)
    {
        breedorspecies = bos;
    }
    public String getBreedorSpecies()
    {
        return breedorspecies;
    }
}
