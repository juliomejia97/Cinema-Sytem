package co.edu.javeriana.cadenacines.negocio;

public class ClienteParticular extends Cliente{
	
	//-------------
	// Constantes
	//-------------


	//-------------
	// Atributos
	//-------------


	//-------------
	// Relaciones
	//-------------


	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de un cliente partícular. 
	 * @param pNombre
	 * @param pEmail
	 */
	public ClienteParticular(String pNombre, String pEmail) {
		super(pNombre, pEmail);
	}

	//-------------
	// Métodos
	//------------
	/**
	 * Método que calcula el valor de una boleta de un cliente Particular según las relgas de negocio.
	 */
	public long valorBoleta(long valorFuncion, Boleta boletaCliente) {
		long valorBoleta;
		TipoSilla tipoSilla = boletaCliente.getSillaBoleta().getTipoSilla();
		if(tipoSilla.name().equalsIgnoreCase("primera"))
		{
			valorFuncion = (long) (valorFuncion + (valorFuncion*0.3));
		}
		valorBoleta = valorFuncion;
		return valorBoleta;
	}

	/**
	 * Método toString de cliente particular
	 */
	public String toString() {
		return "ClienteParticular ["+ super.toString()+ "]";
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		int respuesta = nombre.compareTo(otroCliente.getNombre());
		return respuesta;
	}
	
	
}
