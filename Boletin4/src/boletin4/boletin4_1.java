
package boletin4;


public class boletin4_1 {


    public static void main(String[] args) {
       Coche obxCoche= new Coche();
       
       Coche obxCoche2= new Coche();
       obxCoche2.acelerar(20);
       System.out.println("Velocidade aceleración do coche= "+obxCoche2.getVelocidade()+" km/h");
       obxCoche2.frenar(13);
       System.out.println("Velocidade frenado do coche = "+obxCoche2.getVelocidade()+" km/h");
    }
    
}
