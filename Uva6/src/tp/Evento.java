package tp;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	    private int id;
	    private String nombre;
	    private String fecha;
	    private String ubicacion;
	    private String descripcion;
	    private List<Asistente> asistentes;

	    public Evento(int id, String nombre, String fecha, String ubicacion, String descripcion) {
	        this.id = id;
	        this.nombre = nombre;
	        this.fecha = fecha;
	        this.ubicacion = ubicacion;
	        this.descripcion = descripcion;
	        this.asistentes = new ArrayList<>();
	    }

	    public void agregarAsistente(Asistente asistente) {
	        asistentes.add(asistente);
	    }

	    public void eliminarAsistente(Asistente asistente) {
	        asistentes.remove(asistente);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public String getUbicacion() {
	        return ubicacion;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public List<Asistente> getAsistentes() {
	        return asistentes;
	    }
	}

