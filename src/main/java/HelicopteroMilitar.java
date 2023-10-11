public class HelicopteroMilitar extends Helicoptero{


    @Override
    public void aterrizar(Pista pista) {
        System.out.println("Aterrizando helicoptero militar en " + pista.toString());
    }
}
