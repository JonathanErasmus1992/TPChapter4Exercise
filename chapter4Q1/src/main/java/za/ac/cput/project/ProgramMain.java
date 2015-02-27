package za.ac.cput.project;

import javax.swing.*;

/**
 * Created by student on 2015/02/27.
 */
public class ProgramMain {
    public static void main(String[] args)
    {
        ProgramMain runPro =  new ProgramMain();
        JOptionPane.showMessageDialog(null, "\t\t*****Welcome to Pet Knowledge*****");
        String strAniType = "";
        while(!strAniType.equals("Exit"))
        {
            String petName = "", petGender = "", petBreedOrSpecies = "";
            int age = 0;
            strAniType = runPro.AnimalType();
            if(strAniType.equals("Dog"))
            {

                Dog dog = new Dog();
                dog.setPetName(runPro.AniPetName());
                dog.setAge(runPro.AniPetAge());
                dog.setGender(runPro.AniGender());
                dog.setBreedorSpecies(runPro.AniBreedorSpecies());
                String strColour = dog.HairOrFur();

                String display = "Pet Name: " + dog.getPetName()+ "\nPet Age: " + dog.getAge() + "\nPet Gender: " + dog.getGender() + "\nBreed or Species: " + dog.getBreedorSpecies() + "\nFur or Hair Colour: " + strColour + "\nPet Child: " + dog.getChild() + "\nPet Sound: "
                        + dog.getSound() + "\nLife Expectancy: " + dog.getLifeExpectancy() + "\nBirth Period: " + dog.BirthPeriod();
                JOptionPane.showMessageDialog(null, display);
            }
            else if(strAniType.equals("Cat"))
            {
                Cat cat = new Cat();
                cat.setPetName(runPro.AniPetName());
                cat.setAge(runPro.AniPetAge());
                cat.setGender(runPro.AniGender());
                cat.setBreedorSpecies(runPro.AniBreedorSpecies());
                String strColour = cat.HairOrFur();

                String display = "Pet Name: " + cat.getPetName()+ "\nPet Age: " + cat.getAge() + "\nPet Gender: " + cat.getGender() + "\nBreed or Species: " + cat.getBreedorSpecies() + "\nFur or Hair Colour: " + strColour + "\nPet Child: " + cat.getChild() + "\nPet Sound: "
                        + cat.getSound() + "\nLife Expectancy: " + cat.getLifeExpectancy() + "\nBirth Period: " + cat.BirthPeriod();
                JOptionPane.showMessageDialog(null, display);
            }
            else if(strAniType.equals("Bird"))
            {
                Bird bird = new Bird();
                bird.setPetName(runPro.AniPetName());
                bird.setAge(runPro.AniPetAge());
                bird.setGender(runPro.AniGender());
                bird.setBreedorSpecies(runPro.AniBreedorSpecies());

                String display = "Pet Name: " + bird.getPetName()+ "\nPet Age: " + bird.getAge() + "\nPet Gender: " + bird.getGender() + "\nBreed or Species: " + bird.getBreedorSpecies()  + "\nSkin Covering: " + bird.SkinCovering() + "\nPet Child: " + bird.getChild() + "\nPet Sound: "
                        + bird.getSound() + "\nLife Expectancy: " + bird.getLifeExpectancy() + "\nBirth Period: " + bird.HatchingPeriod();
                JOptionPane.showMessageDialog(null, display);
            }
            else if(strAniType.equals("Reptile"))
            {
                Reptile reptile = new Reptile();
                reptile.setPetName(runPro.AniPetName());
                reptile.setAge(runPro.AniPetAge());
                reptile.setGender(runPro.AniGender());
                reptile.setBreedorSpecies(runPro.AniBreedorSpecies());
                String display = "Pet Name: " + reptile.getPetName()+ "\nPet Age: " + reptile.getAge() + "\nPet Gender: " + reptile.getGender() + "\nBreed or Species: " + reptile.getBreedorSpecies()  + "\nSkin Covering: " + reptile.SkinCovering() + "\nPet Child: " + reptile.getChild() + "\nPet Sound: "
                        + reptile.getSound() + "\nLife Expectancy: " + reptile.getLifeExpectancy() + "\nBirth Period: " + reptile.HatchingPeriod();
                JOptionPane.showMessageDialog(null, display);
            }
        }
        JOptionPane.showMessageDialog(null, "\t\t*****Thank Your For Using Pet Knowledge*****");
    }
    public String AnimalType()
    {
        String[] types = {"Dog", "Cat", "Bird", "Reptile", "Exit"};
        String strAnimalType = ( String )JOptionPane.showInputDialog( null, "Please Choose The Type of Pet You Have", "Choose Food Item", JOptionPane.QUESTION_MESSAGE,
                null, types, types[ 0 ] );
        return strAnimalType;
    }
    public String AniPetName()
    {
        String petName = "";
        petName = JOptionPane.showInputDialog(null, "Please enter the name of your pet:");
        return petName;
    }
    public int AniPetAge()
    {
        int petAge = 0;
        petAge =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age of your pet:"));
        return petAge;
    }
    public String AniGender()
    {
        String[] gender = {"Male", "Female"};
        String strAnimalGender = ( String )JOptionPane.showInputDialog( null, "Please Choose Animal Gender", "Choose Food Item", JOptionPane.QUESTION_MESSAGE,
                null, gender, gender[ 0 ] );
        return strAnimalGender;
    }
    public String AniBreedorSpecies()
    {
        String petBreedOrSpecies = "Not Compulsory";
        petBreedOrSpecies = JOptionPane.showInputDialog(null, "Please enter the breed or species of your pet:");
        return petBreedOrSpecies;
    }
    public String DisplayPetDetails()
    {
        return "display";
    }
}
