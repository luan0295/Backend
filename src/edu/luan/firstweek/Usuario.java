package edu.luan.firstweek;

public class Usuario {
    public static void main(String[] args) {
        SistemaSmartTV SistemaSmartTV = new SistemaSmartTV();
        System.out.println("TV LIGADA ? " + SistemaSmartTV.ligada);
        System.out.println("CANAL ATUAL : " + SistemaSmartTV.canal);
        System.out.println("VOLUME ATUAL : " + SistemaSmartTV.volume);
   
    SistemaSmartTV.ligar();
    System.out.println("TV ligada? " + SistemaSmartTV.ligada);

//Agora vamos desligar a TV
    SistemaSmartTV.desligar();
    System.out.println("TV ligada? " + SistemaSmartTV.ligada);

//aumentar o volume e diminuir em sequência
    SistemaSmartTV.aumentarVolume();
    System.out.println("volume atual da tv é "+SistemaSmartTV.volume);
    SistemaSmartTV.diminuirVolume();
    System.out.println("volume atual da tv é "+SistemaSmartTV.volume);

//aumentar canais e diminuir também
    SistemaSmartTV.aumentarCanal();
    System.out.println("Canal atual é : " + SistemaSmartTV.canal);
}
}
