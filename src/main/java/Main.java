import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Jorge");
        Persona p2 = new Persona("Marta");
        Persona p3 = new Persona("Monica");

        CollectionCustom<Persona> personas = new CollectionCustom<>();

        System.out.println("Cantidad: " + personas.size());
        personas.add(p1);
        personas.add(p2);
        personas.addFirst(p3);
        System.out.println("Cantidad: " + personas.size());

        personas.listCollection();
        System.out.println("\n");
        personas.remove(p1);
        personas.listCollection();

        System.out.println("\n");
        personas.removeAll();
        System.out.println("Cantidad despues de removeAll(): " + personas.size());

        System.out.println("\n");
        personas.add(p1);
        System.out.println("Está vacío?  " + personas.isEmpty());



    }
}
