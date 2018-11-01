
public class Frutas_Verduras extends Producto{
	
	private String nombre;
	
	private int precio;
	
	private String unidad_de_venta;
	
	public Frutas_Verduras() {
	}
	
	public Frutas_Verduras(String nombre, int precio, String unidad_de_venta) {
		super(nombre,precio);
		this.nombre = nombre;
		this.precio = precio;
		this.unidad_de_venta = unidad_de_venta;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// " + "Precio: $" + precio + " /// " + "Unidad de venta: " + unidad_de_venta;
	}

}
