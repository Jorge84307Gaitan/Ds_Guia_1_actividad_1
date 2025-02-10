package actividad1;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("############################################");
		System.out.println("# Desarrollo de Software                   #");
		System.out.println("# Guia 1 - Actividad 1                     #");
		System.out.println("# Estudiante: Jorge Steven Gaitan Barreto  #");
		System.out.println("############################################");
		System.out.println("");
		
		// 1. Crear 4 Tipos
		Carnico miCarnico = new Carnico();
		miCarnico.setNombre("CARNICO");
		
		Enlatado miEnlatado = new Enlatado();
		miEnlatado.setNombre("ENLATADO");
		
		Fruta miFruta = new Fruta();
		miFruta.setNombre("FRUTA");
		
		Lacteo miLacteo = new Lacteo();
		miLacteo.setNombre("LACTEO");
		
		
		// 2. Crea 4 Productos 
		Producto productoCarnico = new Producto();
		productoCarnico.setTipo(miCarnico);
		productoCarnico.codigo = 1111111;
		productoCarnico.nombre = "PorkyMarck";
		productoCarnico.expiracion = "11/11/2016";
		productoCarnico.nombreFabricante="Carnes Porky S.A";
		productoCarnico.cantidadDelInventario = 50;
		productoCarnico.presioUnitario = 5000;
		
		Producto productoEnlatado = new Producto();
		productoEnlatado.setTipo(miEnlatado);		
		productoEnlatado.codigo = 22222222;
		productoEnlatado.nombre = "Sardinas En lata";
		productoEnlatado.expiracion = "11/11/2027";
		productoEnlatado.nombreFabricante="Sardinas S.A";
		productoEnlatado.cantidadDelInventario = 60;
		productoEnlatado.presioUnitario = 6000;
		
		
		Producto productoFruta = new Producto();
		productoFruta.setTipo(miFruta);
		productoFruta.codigo = 3333333;
		productoFruta.nombre = "ensalada de fruta";
		productoFruta.expiracion = "11/11/2028";
		productoFruta.nombreFabricante="cultivos S.A";
		productoFruta.cantidadDelInventario = 80;
		productoFruta.presioUnitario = 16000;
		
		
	
		Producto productoLacteo = new Producto();
		productoLacteo.setTipo(miLacteo);
		productoLacteo.codigo = 4444444;
		productoLacteo.nombre = "leche deslactosada";
		productoLacteo.expiracion = "11/11/2029";
		productoLacteo.nombreFabricante="lacteos S.A";
		productoLacteo.cantidadDelInventario = 32;
		productoLacteo.presioUnitario = 3000;
		
		
		
		// 3. Agrgar los 4 productos creados a la Tienda
		Tienda miTienda = new Tienda(4);
		miTienda.nombre = "Tienda D1 - La Igualdad S.A.";
		miTienda.direccion = "Cll Falsa 123";
		miTienda.telefono = "3123434566";
		
		miTienda.agregarProducto(productoCarnico);
        miTienda.agregarProducto(productoEnlatado);
        miTienda.agregarProducto(productoFruta);
        miTienda.agregarProducto(productoLacteo);
        

        
		// 3.1 crear en a clase Tiene un metodo que reciba unProducto y lo agregue al listado de productos

		miTienda.imprimirResumen();
		
		
		
		
		
	}

}
