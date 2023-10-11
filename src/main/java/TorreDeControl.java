import java.util.List;

public class TorreDeControl {

    private Operario operario;
    private List<Pista> pistas;
    private List<Volador> voladores;


    public TorreDeControl(Operario operario, List<Pista> pistas, List<Volador> voladores) {
        this.operario = operario;
        this.pistas = pistas;
        this.voladores = voladores;
    }

    public void gestionarAterrizajes(){
        for(Volador volador : voladores){
            gestionarAterrizaje(volador);
        }
    }

    private void gestionarAterrizaje(Volador volador){
        Pista pistaUno = pistas.get(0);
        Pista pistaDos = pistas.get(1);

        if(volador instanceof Avion){
            volador.aterrizar(pistaUno);
        }
        if(volador instanceof Helicoptero){
            if(operario.autorizarAterrizaje(volador)){
                volador.aterrizar(pistaDos);
            } else {
                System.out.println("No es posible aterrizar. ");
            }
        }
    }

}
