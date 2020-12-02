
/**
 * I'm not sure I did the 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//I don't think you ever taught us
import java.util.Scanner;
public class DumbWaysToDie extends DumbWaysToDie
{
    //Based off the Dumb Ways to Die video
        public static void main(String args[]){
        public void play() {
        }
        { 
            String greeting;
            
            int option;
            
            System.out.println("A grizzley bear is in front of you. What do you do?");
            
            System.out.println("Press 1 to poke it with a stick. 2 to not poke it with a stick.");
            
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number for your actions.");
            
            option = myObj.nextInt();
            
            if (option == 1) {
                System.out.println("The grizzley bear ate you. You have died.");
                play();
                playAgain = promptUser;
            } while(playAgain);
            
            if (option == 2) {
                System.out.println("You move past the grizzley bear.");
    }
    }
    {
        String greeting;
    
        int option_2;
        
        System.out.println("You want to catch some pihranna, what do you do?");
        
        System.out.println("Press 1 to use your private parts as pihranna bait, 2 to use something else.");
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number for your actions.");
        
        option_2 = myObj.nextInt();
        
        if (option_2 == 1) {
            System.out.println("Your private parts were eaten. You have died.");
            play();
            playAgain = promptUser;
        }while(playAgain);
        if (option_2 == 2) {
            System.out.println("You caught a pihranna with a leaf that you found... somehow.");
        }
       {
           int option_3;
           
           System.out.println("A nice man with a machete and a hockey mask is at your door. What do you do?");
           
           System.out.println("Press 1 to invite him inside for some coffee, 2 to close the door.");

           System.out.println("Enter number for your actions.");
           
           option_3 = myObj.nextInt();
           
           if (option_3 == 1) {
               System.out.println("You invited him inside, but unfortunately he didn't like your coffee. You died.");
               play();
               playAgain = promptUser;
            }while(playAgain);
            if (option_3 == 2) {
                System.out.println("He was sad that you shut the door and left. But you lived, so that's a plus.");
            }
            {
                int option_4;
                
                System.out.println("You are playing hide and seek, and see a perfectly good clothes dryer. What do you do?");
                
                System.out.println("Press 1 to hide inside the dryer, 2 to hide somewhere else.");

                System.out.println("Enter number for your actions.");
                
                option_4 = myObj.nextInt();
                
                if (option_4 == 1) {
                    System.out.println("You hid inside the dryer. It worked for hide and seek, but then they ended up finding your corpse the next day. You died.");
                    play();
                    playAgain = promptUser;
                }while(playAgain);
                if (option_4 == 2) {
                    System.out.println("You hid somewhere else. Unfortunately, you were found very easily.");
                }
                {
                    
                    int option_5;
                    
                    System.out.println("What's that red button do?");
                    
                    System.out.println("Press 1 to push it. Press 2 to not.");
                    
                    System.out.println("Enter number for your actions.");
                    
                    option_5 = myObj.nextInt();
                    
                    if (option_5 == 1) {
                        System.out.println("Explosion. You died.");
                        play();
                        playAgain = promptUser;
                    }while(playAgain);
                    if (option_5 == 2) {
                        System.out.println("You did not press the button. You also won the game, so that's cool.");
                        play();
                        playAgain = promptUser;
                    }while(playAgain);
}
}
}
}
}
