public class AvionComercial extends Avion{

    @Override
    public void aterrizar(Pista pista) {
        System.out.println("Aterrizando avion comercial en " + pista.toString());
    }
}
