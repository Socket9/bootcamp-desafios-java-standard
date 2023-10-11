public class AvionPrivado extends Avion{

    @Override
    public void aterrizar(Pista pista) {
        System.out.println("Aterrizando avion privado en " + pista.toString());
    }
}
