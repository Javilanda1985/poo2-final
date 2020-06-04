package FinalPoo2;

public class Carro extends Thread {
    private String marca;
    private int km;

    public Carro(String marca, int km) {
        super();
        this.marca = marca;
        this.km = km;
    }
    @Override
    public void run() {
        System.out.println("El " + marca + " inicia recorrido");
        for(int i =1;i<=km;i++)
        {
            System.out.println("El "+ marca +" en el kilometro " + i + " km");
        }
        System.out.println("El "+ marca +" terminó el recorrido");

    }

}
