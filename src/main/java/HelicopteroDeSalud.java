public class HelicopteroDeSalud extends Helicoptero{

    @Override
    public void aterrizar(Pista pista) {
        System.out.println("Aterrizando helicoptero de salud en " + pista.toString());
    }
}
