package co.edu.javeriana.cadenacines.negocio;

import java.util.Date;

public class ClienteMiembro extends Cliente{

	//-------------
	// Constantes
	//-------------


	//-------------
	// Atributos
	//-------------
	private Date fechaMembresia; //Fecha de la membresia del cliente

	//-------------
	// Relaciones
	//-------------


	//-------------
	// Constructor
	//-------------
	/**
	 * Constructor de un ClienteMiembro
	 * @param pNombre
	 * @param pEmail
	 */
	public ClienteMiembro(String pNombre, String pEmail, Date pFechaMembresia) {
		super(pNombre, pEmail);
		fechaMembresia = pFechaMembresia;
	}

	//-------------
	// Métodos
	//------------
	/**
	 * Método que calcula el valor de la boleta de un cliente Miembro según las reglas de negocio.
	 */
	public long valorBoleta(long valorFuncion, Boleta boletaCliente) {
		long valorBoleta = 0;
		TipoSilla sillaBoleta = boletaCliente.getSillaBoleta().getTipoSilla();
		if(sillaBoleta.name().equalsIgnoreCase("primera"))
		{
			valorFuncion = (long) (valorFuncion + (valorFuncion*0.3));
		}
		valorFuncion = (long) (valorFuncion - (valorFuncion*0.2));
		valorBoleta = valorFuncion;
		return valorBoleta;
	}
	
	/**
	 * Obtener la fecha de la membresia del cliente
	 * @return
	 */
	public Date getFechaMembresia() {
		return fechaMembresia;
	}
	
	/**
	 * Establecer la fecha de membresia del cliente
	 * @param fechaMembresia
	 */
	public void setFechaMembresia(Date fechaMembresia) {
		this.fechaMembresia = fechaMembresia;
	}

	/**
	 * Método toString clienteMiembro
	 */
	public String toString() {
		return "ClienteMiembro [fechaMembresia=" + super.toString() + "]";
	}

	/**
	 * Método de ordenamiento para los clientes mediante nombre
	 */
	public int compareTo(Cliente otroCliente) {
		int respuesta = nombre.compareTo(otroCliente.getNombre());
		return respuesta;
	}
	
	
	
}
