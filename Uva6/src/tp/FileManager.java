package tp;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileManager {

    private static String linea;
	private static Evento evento;

	public static List<Evento> cargarEventos() {
        List<Evento> eventos = new ArrayList<>();
        File archivo = new File("eventos.txt");

        try {
            // Si el archivo no existe, lo crea vacío
            if (!archivo.exists()) {
                System.out.println("El archivo eventos.txt no existe. Se creará uno nuevo.");
                archivo.createNewFile();
            }
            
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((setLinea(reader.readLine())) != null) {
                // Aquí iría el código para procesar cada línea y crear objetos Evento
                // eventos.add(...);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return eventos;
    }

    public static void guardarEventos(List<Evento> eventos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("eventos.txt"))) {
            for (Iterator<Evento> iterator = eventos.iterator(); iterator.hasNext();) {
				setEvento(iterator.next());
			}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static String getLinea() {
		return linea;
	}

	public static String setLinea(String linea) {
		FileManager.linea = linea;
		return linea;
	}

	public static Evento getEvento() {
		return evento;
	}

	public static void setEvento(Evento evento) {
		FileManager.evento = evento;
	}
}
