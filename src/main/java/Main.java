import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year;

        System.out.print("Ingrese el dia (1 - 31): ");
        day = scanner.nextInt();

        System.out.print("Ingrese el mes (1 - 12): ");
        month = scanner.nextInt();

        System.out.print("Ingrese el anio (1900 - 2099): ");
        year = scanner.nextInt();

        DateClass date = new DateClass(day, month, year);
        DateValidator validator = new DateValidator(date);

        if (validator.dateIsValid()){
            System.out.println("La fecha " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + " es válida");
        } else {
            System.out.println("La fecha " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() + " NO es válida");
        }
    }
}
