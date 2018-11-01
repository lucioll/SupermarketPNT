
public class Bebida extends Producto {
	private String nombre;
	
	private int precio;
	
	private float litros;
	
	public Bebida() {}
	
	public Bebida(String nombre, int precio, float litros) {
		super(nombre,precio);
		this.nombre = nombre;
		this.precio = precio;
		this.litros = litros;		
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// " + "Litros: " + litros + " /// " + "Precio: $" + precio;
	}

}
