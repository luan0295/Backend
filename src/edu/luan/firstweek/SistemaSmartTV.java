package edu.luan.firstweek;

public class SistemaSmartTV {
    
    boolean ligada = false;
    int canal = 1;   
    int volume = 25;
 
       public void aumentarVolume (){
        volume ++;
    }
       public void diminuirVolume (){
        volume = volume -1;
    }

       public void aumentarCanal (){
        canal ++;
        System.out.println("Aumentando o canal em : +1");
    }
       public void diminuirCanal (){
        canal = canal -1;
    }
    
       public void ligar(){
        ligada=true;
    }
       public void desligar(){
        ligada = false;
    }
}
