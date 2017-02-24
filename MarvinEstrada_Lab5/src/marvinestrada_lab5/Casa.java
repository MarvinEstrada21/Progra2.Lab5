package marvinestrada_lab5;
public class Casa extends Lugar{

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, int nivel_seguridad, Carretera entrada, Carretera salida) {
        super(nombre, direccion, nivel_seguridad, entrada, salida);
    }

    @Override
    public String toString() {
        return super.toString() + "Casa{" + '}';
    }
}