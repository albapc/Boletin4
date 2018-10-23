
package boletin4_3;


public class Circulo {
    private double radio;
    private static double pi= 3.14;
    
public Circulo(){
}
public Circulo(double radio, double pi){
    this.radio= radio;
    this.pi= pi;
}
public double calcularArea(){
   double area;
   area= Math.pow(radio, 2) * pi;
   System.out.println("El área del círculo es: "+area);
   return area;
}
public double calcularLonxitude(){
    double lonxitude;
    lonxitude= 2*pi*radio;
    System.out.println("La longitud del círculo es: "+lonxitude);
    return lonxitude;
}
public void setRadio(double radio){
    this.radio= radio;
}
}
