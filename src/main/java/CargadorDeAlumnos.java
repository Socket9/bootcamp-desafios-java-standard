import java.util.Scanner;

public class CargadorDeAlumnos {

    public static Alumno[] cargarAlumnos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos que desea procesar: ");
        int cantAlumnos = scanner.nextInt();
        System.out.print("Ingrese la cantidad de notas por alumno: ");
        int cantNotas = scanner.nextInt();

        Alumno[] alumnosArr = new Alumno[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++){
            System.out.println("\n");
            System.out.println("Ingrese los datos del alumno " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido: ");
            String apellido = scanner.next();

            Nota[] notas = new Nota[cantNotas];

            for (int j = 0; j < cantNotas; j++){
                System.out.print("Numero de examen: ");
                int numExamen = scanner.nextInt();
                System.out.print("Nota " + (j + 1) + ":");
                float nota = scanner.nextFloat();

                Nota notaAux = new Nota(numExamen, nota);
                notas[j]  = notaAux;
            }

            Alumno alumno = new Alumno(nombre, apellido, notas);

            // Agrego el alumno al array
            alumnosArr[i] = alumno;
        }

        scanner.close();

        return alumnosArr;
    }

}
