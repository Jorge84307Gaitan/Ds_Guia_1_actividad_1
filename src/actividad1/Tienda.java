package actividad1;

public class Tienda {
	
	public String nombre;
	public String direccion;
	public String telefono;
	public Producto[] productos;
	
	private int contadorProductos;
	
	public Tienda (int capacidad) {
		this.productos=new Producto[capacidad];
		this.contadorProductos = 0;
		
	}
	
	
	public void agregarProducto(Producto nuevoProducto) {
		if (contadorProductos < productos.length) {
			productos[contadorProductos] = nuevoProducto;
			contadorProductos++;
			
		}else {
			System.out.println("la tienda tiene los sigientes productos(productos)");
		}
	}
	
	

	public void imprimirResumen() 
	{
		System.out.println("");
		System.out.println("-->  Datos de la tienda ");
		System.out.println("");

		
		
		System.out.println("Nombre de la tienda: " + this.nombre);
		System.out.println("Direcciòn: " + this.direccion);
		System.out.println("Telefono: " + this.telefono);

		System.out.println("");
		System.out.println("-->  Inventario: ");
		System.out.println("");
		
		System.out.println("la tienda tiene disponibles " + contadorProductos +" productos");
		
		for(int x = 0; x < this.contadorProductos; x = x + 1) {
	         Producto productoTemp = productos[x];
	         System.out.println("̣̣̣̣̣̣̣̣----------------------");
	         System.out.println("producto # "+ (x + 1));
	         
	 		 System.out.println("nombre: " + productoTemp.nombre);
	 		 System.out.println("tipo de producto: " + productoTemp.getTipo().getNombre());
	 		 System.out.println("codigo: " + productoTemp.codigo);
	 		 System.out.println("expiracion: " + productoTemp.expiracion);
	 		 System.out.println("nombre fabricante: " + productoTemp.nombreFabricante);
	 		 System.out.println("precio: "+ productoTemp.presioUnitario);
	 		 
	 		
	 		 

	      }	
		
	}
	
	
}
