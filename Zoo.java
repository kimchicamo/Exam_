import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    private ArrayList<Bird> zooBirds;
    int countBlueBirds(){
        int count = 0; 
        for(Bird  bird : zooBirds){
            if(bird.getColor().equals("blue")){
                count++;
            }
        }
        return count;
    }
    
    
}

