
package game;


public class Game {

    
    public static void main(String[] args) {
        //objek
        Player Hero = new Player ();
        Enemy Enemy = new Enemy();
        
        //atribut
        Hero.name = "Aufa";
        Hero.speed = 78;
        Hero.healthPoin = 100;
        Hero.damage = 400;
        Hero.armor = 33;
        
        Enemy.name = "Musuh";
        Enemy.healthpoin = 400;
        Enemy.damage = 100;
        Enemy.armor = 25;
        
        //method
        Hero.run();
        Hero.attack();
        Enemy.defense();
        
        if(Hero.isDead()){
            System.out.println(Hero.name+"Is Dead, Game Over!");
        }
        if(Enemy.isDead()){
            System.out.println(Enemy.name+"Is Dead, Game Over !");
        }
        
   
    
    }
    
}
    
