import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creamos los voladores
        List<Volador> voladores = List.of(new AvionComercial(), new AvionPrivado(), new HelicopteroMilitar(), new HelicopteroDeSalud());

        // Creamos la torre de control
        Operario op = new Operario("Matias");
        List<Pista> pistas = List.of(new Pista("Pista 1"), new Pista("Pista 2"));

        TorreDeControl torre = new TorreDeControl(op, pistas, voladores);

        torre.gestionarAterrizajes();
    }
}
