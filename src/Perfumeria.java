
public class Perfumeria extends Producto{
	
	private String nombre;
	
	private int precio;
	
	private int contenido;
	
	public Perfumeria() {}
	
	public Perfumeria(String nombre, int precio, int contenido) {
		super(nombre,precio);
		this.nombre = nombre;
		this.precio = precio;
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// " + "Contenido: " + contenido + "ml"+  " /// " + "Precio: $" + precio;
	}
	
}
