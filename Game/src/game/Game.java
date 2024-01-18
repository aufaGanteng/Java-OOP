
package game;


public class Game {

    
    public static void main(String[] args) {
        //objek
        Player Hero = new Player ();
        
        //atribut
        Hero.name = "Aufa";
        Hero.speed = 78;
        Hero.healthPoin = 100;
        
        //method
        Hero.run();
        
        if(Hero.isDead()){
            System.out.println("Game Over!");
        }
        
   
    
    }
    
}
    
