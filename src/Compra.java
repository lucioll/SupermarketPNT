import java.util.Collections;
import java.util.List;

public class Compra{
	private List<Producto> productos;
	
	public Compra() {}
	
	public Compra(List<Producto> productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		String output = "";
		for(Producto producto: productos) {
			output = output + producto.toString() + "\n";
		}
		
		output = output + "=============================" + "\n";
		
		//Hago que se ordene por precio
		Collections.sort(productos);
		
		output = output + "Producto más caro: " + productos.get(productos.size()-1).get_nombre() + "\n";
		output = output + "Producto más barato: " + productos.get(0).get_nombre() + "\n";
		
		return output;
	}
}
