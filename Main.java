package impuestos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el consumo de agua en metros cúbicos: ");
        double consumoAgua = scanner.nextDouble();
        System.out.print("Introduce la tarifa del agua por metro cúbico: ");
        double tarifaAgua = scanner.nextDouble();

        Impuestos impuestoAgua = new Impuestos(consumoAgua, tarifaAgua);
        double totalImpuestoAgua = impuestoAgua.calcularImpuesto();
        System.out.println("El impuesto total de agua es: " + totalImpuestoAgua);

        System.out.print("Introduce el consumo de luz en kWh: ");
        double consumoLuz = scanner.nextDouble();
        System.out.print("Introduce la tarifa de la luz por kWh: ");
        double tarifaLuz = scanner.nextDouble();

        Impuestos impuestoLuz = new Impuestos(consumoLuz, tarifaLuz);
        double totalImpuestoLuz = impuestoLuz.calcularImpuesto();
        System.out.println("El impuesto total de luz es: " + totalImpuestoLuz);

        scanner.close();
    }
}
