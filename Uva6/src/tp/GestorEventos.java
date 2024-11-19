package tp;
import java.util.ArrayList;
import java.util.List;
public class GestorEventos {

    private List<Evento> eventos;
    public GestorEventos() {
        this.eventos = new ArrayList<>();
        new FileManager();
        cargarEventos();
    }

    public void crearEvento(Evento evento) {
        eventos.add(evento);
        FileManager.guardarEventos(eventos);
    }

    public List<Evento> obtenerEventosFuturos() {
        // Implementar lógica para filtrar eventos futuros
        return eventos; // Para simplificar
    }

    public List<Evento> obtenerEventosPasados() {
        // Implementar lógica para filtrar eventos pasados
        return eventos; // Para simplificar
    }

    public void registrarAsistente(int eventoId, Asistente asistente) {
        for (Evento evento : eventos) {
            if (evento.getId() == eventoId) {
                evento.agregarAsistente(asistente);
                FileManager.guardarEventos(eventos);
                break;
            }
        }
    }

    private void cargarEventos() {
        eventos = FileManager.cargarEventos();
    }
}

