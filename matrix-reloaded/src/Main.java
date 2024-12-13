public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        System.out.println("3. Estadísticas Simples");

        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1, 2 o 3): ");

        if (opcion == 1) {
            System.out.println("Menú de Agentes de la Resistencia");
            // Lógica para agentes
        } else if (opcion == 2) {
            System.out.println("Menú de Control de Anomalías");
            // Lógica para anomalías
        } else if (opcion == 3) {
            mostrarEstadisticasSimples();
        } else {
            System.out.println("Opción no válida. Adiós.");
        }
    }

    private static void mostrarEstadisticasSimples() {
        System.out.println("Estadísticas del Sistema:");
        System.out.println("Total de agentes registrados: 0");
        System.out.println("Total de anomalías registradas: 0");
    }
}

class ConsoleUtils {
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Intenta de nuevo.");
            return leerEntero(mensaje);
        }
    }
}
