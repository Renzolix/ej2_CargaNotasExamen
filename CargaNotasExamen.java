public class CargaNotasExamen {

    public void procesarCalificacion(String entradaNota, double[] acta, int posicion) {
        acta[posicion] = Double.parseDouble(entradaNota);
    }

    public static void main(String[] args) {
        CargaNotasExamen servicio = new CargaNotasExamen();
        double[] acta = new double[3];

        // Prueba 1: Cadena no numérica (NumberFormatException)
        try {
            System.out.println("--- Prueba 1: Formato inválido ---");
            servicio.procesarCalificacion("Nueve", acta, 0);
        } catch (NumberFormatException e) {
            System.err.println("Error: La entrada no es un número válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Posición fuera de los límites del acta.");
        } finally {
            System.out.println("Proceso de auditoría de nota finalizado.\n");
        }

        // Prueba 2: Índice fuera de rango (ArrayIndexOutOfBoundsException)
        try {
            System.out.println("--- Prueba 2: Índice fuera de rango ---");
            servicio.procesarCalificacion("8.5", acta, 5);
        } catch (NumberFormatException e) {
            System.err.println("Error: La entrada no es un número válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Posición fuera de los límites del acta.");
        } finally {
            System.out.println("Proceso de auditoría de nota finalizado.");
        }
    }
}