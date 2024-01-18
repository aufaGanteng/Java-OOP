
package game;


public class mobilMatic {
    //atribut
    int bensin;
    int masukGigi;
    int kecepatan;
    String merek;
    
    //method
    void berjalan(){
        bensin--;
        if(bensin > 0){
            kecepatan++;
            System.out.println("Mobil berjalan");
        } else {
            System.out.println("Bensin habis, Mobil tidak bisa berjalan");
        }
    }
    
    void matikanMesin(){
        if(masukGigi > 0){
            System.out.println("Mesin tidak bisa dimatikan karena mobil berjalan");
        } else {
            System.out.println("Mesin mati");
            
        }
    }
    
    void mundur(){
        if(masukGigi < 0){
            System.out.println("Mobil mundur");
        } else {
            System.out.println("Mobil tidak bisa mundur karena gigi tidak Mundur");
        }
        
    }
    void belok(){
        masukGigi--;
        kecepatan--;
        System.out.println("Mobil belok");
    }
    
    void maju(){
        if(masukGigi > 0){
            System.out.println("Mobil maju");
        } else {
            System.out.println("Mobil tidak bisa maju karena gigi netral/mundur");
        
        
    }
    
    
        
    }
            
    
}
