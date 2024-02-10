package poo.clases;

public class Motocicletas {
    //Atributos
    String modelo;
    int year;
    boolean scrambler;
    int speed=0;
    boolean luces=false;

    //Constructor

    public Motocicletas(String modelo, int year, boolean scrambler, int speed, boolean luces){
        this.modelo = modelo;
        this.year = year;
        this.scrambler = scrambler;
        this.speed = speed;
        this.luces = luces;

    }

    //Metodos

    public void encerderLuces(boolean valor){
        this.luces = valor;
    }
}
