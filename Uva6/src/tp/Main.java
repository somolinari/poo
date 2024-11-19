package tp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEventos gestorEventos = new GestorEventos();

        while (true) {
            System.out.println("1. Crear Evento");
            System.out.println("2. Ver Eventos");
            System.out.println("3. Registrar Asistente");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del evento: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Fecha del evento: ");
                    String fecha = scanner.nextLine();
                    System.out.print("Ubicación del evento: ");
                    String ubicacion = scanner.nextLine();
                    System.out.print("Descripción del evento: ");
                    String descripcion = scanner.nextLine();
                    Evento evento = new Evento(gestorEventos.obtenerEventosFuturos().size() + 1, nombre, fecha, ubicacion, descripcion);
                    gestorEventos.crearEvento(evento);
                    break;
                case 2:
                    System.out.println("Eventos:");
                    for (Evento e : gestorEventos.obtenerEventosFuturos()) {
                        System.out.println(e.getNombre() + " - " + e.getFecha());
                    }
                    break;
                case 3:
                    System.out.print("ID del evento: ");
                    int eventoId = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Nombre del asistente: ");
                    String asistenteNombre = scanner.nextLine();
                    System.out.print("Email del asistente: ");
                    String email = scanner.nextLine();
                    System.out.print("Teléfono del asistente: ");
                    String telefono = scanner.nextLine();
                    Asistente asistente = new Asistente(asistenteNombre, email, telefono);
                    gestorEventos.registrarAsistente(eventoId, asistente);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}