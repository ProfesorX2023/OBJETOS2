package poo.clases;

public class Vehiculo {
    //1. Atributos
    String fabricante;
    String modelo;
    double ccc;
    int year;
    boolean sport;
    int speed;

    //2. Constructres

    public Vehiculo(){

    }
    //Sobrecarga de funciones o métodos
    public Vehiculo(String fabricante, String modelo, double ccc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ccc = ccc;
        this.year = year;
        this.sport = sport;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Vehiculo(String fabricante, int year){
        this.fabricante = fabricante;
        this.year = year;
    }
    //3. Métodos (Comportamiento)
    public void acelerar(int cantidad){
        this.speed += cantidad;

    }

}
