public class Nota {
    private int numeroDeExamen;
    private float nota;

    public Nota(int numeroDeExamen, float nota) {
        this.numeroDeExamen = numeroDeExamen;
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Examen numero: " + numeroDeExamen + "\n" +
                "Nota: " + nota;
    }
}
