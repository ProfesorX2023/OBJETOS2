package poo.clases;

public class Main {
    public static void main(String[] args) {
        //NombreClase identificador = new NombreClase();

        //Crear un objeto con el constructor vacio
        Vehiculo toyotaYaris = new Vehiculo();

        //Crear un objeto utilizando el constructor con parametros
        Vehiculo fordFocus = new Vehiculo("Ford","Focus",2.1,2010,false);
        System.out.println(fordFocus.fabricante);
        System.out.println(fordFocus.year);
        System.out.println(fordFocus.ccc);
        System.out.println(fordFocus.speed);
        fordFocus.acelerar(50);
        fordFocus.acelerar(50);
        fordFocus.acelerar(50);
        System.out.println(fordFocus.speed);

        Vehiculo mazda3 = new Vehiculo("Mazda","3");

        System.out.println("He comprado un "+mazda3.fabricante+"Modelo "+mazda3.modelo);

        Vehiculo mazda6 = new Vehiculo("Mazda","6");

        System.out.println("He comprado un "+mazda6.fabricante+"Modelo "+mazda6.modelo);


        Motocicletas moto1 = new Motocicletas("Pulsar",2020,false,0,false);

        System.out.println(moto1.modelo);

        System.out.println(moto1.year);

        System.out.println(moto1.speed);

        System.out.println(moto1.scrambler);

        System.out.println(moto1.luces);

        moto1.encerderLuces(true);

        System.out.println(moto1.luces);
    }
}
