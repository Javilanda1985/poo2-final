package FinalPoo2;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        String marca;
        int km;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vehiculo # " + (n+1));
        System.out.print("Marca del vehiculo: ");
        marca = sc.next();
        System.out.print("Kilometros a recorrer: ");
        km = sc.nextInt();
        Carro carro1 = new Carro(marca,km);

        System.out.println("Vehiculo # " + (n+2));
        System.out.print("Marca del vehiculo: ");
        marca = sc.next();
        System.out.print("Kilometros a recorrer: ");
        km = sc.nextInt();
        Carro carro2 = new Carro(marca,km);

        System.out.println("Vehiculo # " + (n+3));
        System.out.print("Marca del vehiculo: ");
        marca = sc.next();
        System.out.print("Kilometros a recorrer: ");
        km = sc.nextInt();
        Carro carro3 = new Carro(marca,km);

        System.out.println();

        carro1.start();
        carro2.start();
        carro3.start();
    }
}
