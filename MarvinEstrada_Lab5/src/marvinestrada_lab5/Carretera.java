package marvinestrada_lab5;
public class Carretera {
    private int numero;
    private double distancia;
    private Lugar inicio;
    private Lugar finale;

    public Carretera() {
    }

    public Carretera(int numero, double distancia, Lugar inicio, Lugar finale) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.finale = finale;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFinale() {
        return finale;
    }

    public void setFinale(Lugar finale) {
        this.finale = finale;
    }

    @Override
    public String toString() {
        return numero + "";
    }
}