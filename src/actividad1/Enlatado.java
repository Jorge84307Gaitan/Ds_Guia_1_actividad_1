package actividad1;

public class Enlatado extends TipoProducto  {

	private String mensaje;
	
	public Enlatado() 
	{
		this.mensaje = "Enlatado Alto en Sodio";
		
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
