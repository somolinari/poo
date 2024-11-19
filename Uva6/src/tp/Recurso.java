package tp;

import java.util.List;

public class Recurso {
    private String tipo;
    private int cantidad;
    private String descripcion;

    public Recurso(String tipo, int cantidad, String descripcion) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Clase interna Calendario
    public static class Calendario {
        private List<Evento> eventos;

        public Calendario(List<Evento> eventos) {
            this.eventos = eventos;
        }

        public void mostrarCalendario() {
            for (Evento evento : eventos) {
                System.out.println("Evento: " + evento.getNombre() + " - Fecha: " + evento.getFecha());
            }
        }

        public void agregarEventoAlCalendario(Evento evento) {
            eventos.add(evento);
        }
    }
}


