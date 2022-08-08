import java.util.Scanner;
import java.lang.*;
import java.net.PortUnreachableException;
class Guesser{
    int guessNum;

    public int GuessNumber()
    {

        int minRange = 1;
        int maxrange = 100; 
        // System.out.println("");
         guessNum = (int)(Math.random()*(maxrange-minRange)+minRange);
         return guessNum;

         
    }
}

class Player{

    int Number;

     public int playersGuessNumber(){
        System.out.println("\nGuess the Number between 1 to 100");
        Scanner sc = new Scanner(System.in);

        Number = sc.nextInt();
        return Number;
     }

    
}

class Comparison{

    int numberFromGuesser;
    int numberFromPlayer;

     public void collectNumberFromGuesser(){
        Guesser g = new Guesser();
       numberFromGuesser = g.GuessNumber();

     }

     public void collectNumberFromGPlayer(){
      Player p1 = new Player();
      numberFromPlayer = p1.playersGuessNumber();

     }
    public boolean compare(){
        if(numberFromGuesser==numberFromPlayer)
        {
        
            System.out.println("\nWow your guees is correct !! Congratulation.......................\n");
         
            return true;

        }
        else if(Math.abs(numberFromGuesser-numberFromPlayer)<5)
        {
            
            System.out.println("\nYou are very closed...");
            return false;
        }
        else if(numberFromGuesser-numberFromPlayer<0)
        {
            System.out.println("\nToo high!!!");
            return false;
        }
        else if(numberFromGuesser-numberFromPlayer>5)
        {
            System.out.println("\nToo Low!!!");
            return false;
        }
        else{
            System.out.println("wrong guess try again! ");
        }
     return false;
        
    }

}

public  class guessNumber {
    public static void main(String[] args) {
    
     Comparison comp = new Comparison();
     comp.collectNumberFromGuesser();
     boolean k;
     int attempt = 0;
      while(true)
      {
          comp.collectNumberFromGPlayer();
          k = comp.compare();
          attempt++;
          if(k==true)
          {
            System.out.println("Your Number of Attempt : "+attempt);
            System.exit(0);
          }


      }

  
      
    }
}
