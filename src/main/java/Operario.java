public class Operario {
    private String nombre;

    public Operario(String nombre) {
        this.nombre = nombre;
    }

    public boolean autorizarAterrizaje(Volador volador){
        if(volador instanceof HelicopteroDeSalud){
            return true;
        } else {
            return false;
        }
    }
}

