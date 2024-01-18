
package game;


public class Player {
    //atribut
    String name ;
    int speed ;
    int healthPoin ; 
    int damage ;
    int armor ;
            
    //method
    void attack(){
        healthPoin--;
        if(healthPoin<damage){
            System.out.println(" kerusakan "+healthPoin);
        }
        System.out.println(" is attacking... "+damage);
    }
    
    void defense(){
        System.out.println(" Armor defense is... "+armor);
        healthPoin++;
    }
    
    void run(){
        System.out.println(" is running... ");
        System.out.println(" Speed "+speed);
    }
    
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
            
           
    
    
}
