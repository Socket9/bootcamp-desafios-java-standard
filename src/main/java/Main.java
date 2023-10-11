import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Nota[] notasAlumno1 = {new Nota(123,6.0f), new Nota(124,9.0f), new Nota(125,7.5f)};
        Nota[] notasAlumno2 = {new Nota(123,7.0f), new Nota(124, 8.0f), new Nota(125, 6.5f)};
        Nota[] notasAlumno3 = {new Nota(123,4.0f), new Nota(124, 5.5f), new Nota(125, 9.5f)};
        Nota[] notasAlumno4 = {new Nota(123,8.0f), new Nota(124, 7.5f), new Nota(125, 8.5f)};
        Nota[] notasAlumno5 = {new Nota(123,7.5f), new Nota(124, 7.0f), new Nota(125, 6.0f)};

        Alumno[] alumnos = {
                new Alumno("Juan", "Perez", notasAlumno1),
                new Alumno("Maria", "Gomez", notasAlumno2),
                new Alumno("Pedro", "Rodriguez", notasAlumno3),
                new Alumno("Ana", "Lopez", notasAlumno4),
                new Alumno("Carlos", "Martinez", notasAlumno5)
        };
        * */

        // Carga de datos
        Alumno[] alumnos = CargadorDeAlumnos.cargarAlumnos();

        // Procesar datos
        // El método promedio redondea a "X.0" || "X.5"

        Alumno[] alumnosConNotaMasAlta =  Procesador.obtenerAlumnosConNotaMasAlta(alumnos);
        Alumno[] alumnosConNotaMasBaja = Procesador.obtenerAlumnosConNotaMasBaja(alumnos);
        Alumno[] alumnosQuePromocionan = Procesador.obtenerAlumnosQuePromocionan(alumnos);
        Alumno[] alumnosQueRecursan = Procesador.obtenerAlumnosQueRecursan(alumnos);

        // Listar información

        System.out.println("\n");
        System.out.println("Alumnos con el promedio mas alto");
        Printer.print(alumnosConNotaMasAlta);

        System.out.println("\n");
        System.out.println("Alumnos con el promedio mas bajo");
        Printer.print(alumnosConNotaMasBaja);

        System.out.println("\n");
        System.out.println("Alumnos que promocionan");
        Printer.print(alumnosQuePromocionan);

        System.out.println("\n");
        System.out.println("Alumnos que recursan");
        Printer.print(alumnosQueRecursan);

    }
}
