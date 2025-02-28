
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025; 
    public int getDriverAge(int yearOfBirth){
        int age = currentYear - yearOfBirth;
        if(age >=16 ){
            System.out.println("Driver can drive");
        }
        else{
            int yearLeft = 16 - age;
            System.out.println("Driver can't drive. You are" + age + "You need to wait" + yearLeft);
        }
        return age;
    }
        
}

