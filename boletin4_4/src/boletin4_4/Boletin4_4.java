package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        Restaurante obxResultado = new Restaurante();

        Restaurante obxResultado2 = new Restaurante(8, 6);
        obxResultado2.setKgPolbo(8);
        obxResultado2.setKgPatacas(6);
        obxResultado2.engadirPatacas(3);
        obxResultado2.engadirPolbo(4);
        obxResultado.getNumClientes();
        obxResultado2.amosarPatacas();
        obxResultado2.amosarPolbo();

    }
}