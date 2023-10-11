import java.util.Arrays;

public class Alumno {

    private String nombre;
    private String apellido;
    private Nota[] notas;

    public Alumno(String nombre, String apellido, Nota[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public float obtenerPromedio(){
        if(notas.length == 0){
            return 0;
        }
        float sum = 0;
        for(Nota nota : notas) {
           sum += nota.getNota();
        }
        float promedio = sum / notas.length;

        // Formateamos promedio para que se redondee a "X.0" || "X.5"
        promedio = Math.round(promedio * 2) / 2.0f;
        return promedio;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + '\t' +
                "Apellido: " + apellido + '\t' +
                "Promedio: " + obtenerPromedio();
    }
}
