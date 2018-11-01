import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Producto> list = new ArrayList<Producto>();
		list.add(new Bebida("Coca-Cola Zero", 20, 1.5f));
		list.add(new Bebida("Coca-Cola", 18, 1.5f));
		list.add(new Perfumeria("Shampoo Sedal", 19, 500));
		list.add(new Frutas_Verduras("Frutillas", 64, "kilo"));
		Compra compra1 = new Compra(list);
	
		System.out.println(compra1);
	}

}
