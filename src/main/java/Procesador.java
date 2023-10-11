public class Procesador {

    private static final float MIN_NOTA_PROMOCION = 7;


    public static Alumno[] obtenerAlumnosConNotaMasAlta(Alumno[] arr){
        float notaMasAlta = obtenerNotaMasAlta(arr);
        int cantAlumnosConNotaMasAlta = contarAlumnosConNota(arr, notaMasAlta);
        Alumno[] alumnosConNotaMasAlta = new Alumno[cantAlumnosConNotaMasAlta];
        int i = 0;

        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() == notaMasAlta) {
                alumnosConNotaMasAlta[i] = alumno;
                i++;
            }
        }

        return alumnosConNotaMasAlta;
    }

    public static Alumno[] obtenerAlumnosConNotaMasBaja(Alumno[] arr){
        float notaMasBaja = obtenerNotaMasBaja(arr);
        int cantAlumnosConNotaMasBaja = contarAlumnosConNota(arr, notaMasBaja);
        Alumno[] alumnosConNotaMasBaja = new Alumno[cantAlumnosConNotaMasBaja];

        int i = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() == notaMasBaja) {
                alumnosConNotaMasBaja[i] = alumno;
                i++;
            }
        }

        return alumnosConNotaMasBaja;
    }

    public static Alumno[] obtenerAlumnosQuePromocionan(Alumno[] arr){
        int cantAlumnosQuePromocionan = contarAlumnosQuePromocionan(arr);
        Alumno[] alumnosQuePromocionan = new Alumno[cantAlumnosQuePromocionan];

        int i = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() >= MIN_NOTA_PROMOCION) {
                alumnosQuePromocionan[i] = alumno;
                i++;
            }
        }

        return alumnosQuePromocionan;
    }

    public static Alumno[] obtenerAlumnosQueRecursan(Alumno[] arr){
        int cantAlumnosQueRecursan = contarAlumnosQueRecursan(arr);
        Alumno[] alumnosQueRecursan = new Alumno[cantAlumnosQueRecursan];

        int i = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() < MIN_NOTA_PROMOCION) {
                alumnosQueRecursan[i] = alumno;
                i++;
            }
        }

        return alumnosQueRecursan;
    }

    private static float obtenerNotaMasAlta(Alumno[] arr) {
        float maxNota = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() > maxNota) {
                maxNota = alumno.obtenerPromedio();
            }
        }
        return maxNota;
    }

    private static float obtenerNotaMasBaja(Alumno[] arr) {
        float minNota = 0;
        for (Alumno alumno : arr) {
            if(minNota == 0){
                minNota = alumno.obtenerPromedio();
            }
            if (alumno.obtenerPromedio() < minNota) {
                minNota = alumno.obtenerPromedio();
            }
        }
        return minNota;
    }
    private static int contarAlumnosConNota(Alumno[] arr, float nota) {
        int cantAlumnosConNota = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() == nota) {
                cantAlumnosConNota++;
            }
        }
        return cantAlumnosConNota;
    }
    private static int contarAlumnosQuePromocionan(Alumno[] arr) {
        int cantAlumnosQuePromocionan = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() >= MIN_NOTA_PROMOCION) {
                cantAlumnosQuePromocionan++;
            }
        }
        return cantAlumnosQuePromocionan;
    }

    private static int contarAlumnosQueRecursan(Alumno[] arr) {
        int cantAlumnosQueRecursan = 0;
        for (Alumno alumno : arr) {
            if (alumno.obtenerPromedio() < MIN_NOTA_PROMOCION) {
                cantAlumnosQueRecursan++;
            }
        }
        return cantAlumnosQueRecursan;
    }

}
