package boletin4_4;


public class Restaurante {
   private int kgPolbo;
   private int kgPatacas;

   public Restaurante(){
       kgPolbo= 0;
       kgPatacas= 0;
   }
   public Restaurante (int kgPolbo, int kgPatacas){
       this.kgPolbo= kgPolbo;
       this.kgPatacas= kgPatacas;
   }
   public void setKgPolbo(int kgPolbo){
   }
   public void setKgPatacas(int kgPatacas){
   }

   public void engadirPolbo(int x){
       kgPolbo= kgPolbo+x;
   }
   public void engadirPatacas(int x){
       kgPatacas= kgPatacas+x;
   }
      public int getNumClientes(){
       int numClientes;
       numClientes= kgPatacas+kgPolbo;
       System.out.println("Número de clientes que puede atender: "+numClientes);
       return numClientes;
   }
   public void amosarPolbo(){
       System.out.println("Hay "+kgPolbo+" kg de pulpo en el almacén.");
   }
   public void amosarPatacas(){
       System.out.println("Hay "+kgPatacas+" kg de patatas en el almacén.");
   }
}
