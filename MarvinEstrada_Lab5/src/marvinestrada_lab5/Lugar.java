package marvinestrada_lab5;
public class Lugar {
    private String nombre;
    private String direccion;
    private int nivel_seguridad;
    private Carretera entrada;
    private Carretera salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivel_seguridad, Carretera entrada, Carretera salida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivel_seguridad = nivel_seguridad;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(int nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }

    public Carretera getEntrada() {
        return entrada;
    }

    public void setEntrada(Carretera entrada) {
        this.entrada = entrada;
    }

    public Carretera getSalida() {
        return salida;
    }

    public void setSalida(Carretera salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", direccion=" + direccion + ", nivel_seguridad=" + nivel_seguridad + ", entrada=" + entrada + ", salida=" + salida + '}';
    }
}