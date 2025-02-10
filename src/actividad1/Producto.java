package actividad1;

public class Producto {
	
	public int codigo;
	public String nombre;
	private TipoProducto tipo;
	public String expiracion;
	public String nombreFabricante;
	public int cantidadDelInventario;
	public int presioUnitario;
	
	public TipoProducto getTipo() {
		return this.tipo;
		
	}
	
		
	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}
	
	
}

