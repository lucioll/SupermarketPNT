
public class Producto implements Comparable<Producto> {
	private int precio;
	
	private String nombre;
	
	public String get_nombre() {
		return nombre;
	}
	
	public int get_precio() {
		return precio;
	}
	
	public Producto() {
		
	}
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	//Comparo productos por precio
	public int compareTo(Producto other) {
	    return Integer.compare(this.precio, other.get_precio());
	}
}
