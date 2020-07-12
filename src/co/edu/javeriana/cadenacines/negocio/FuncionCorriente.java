package co.edu.javeriana.cadenacines.negocio;

import java.util.Date;

public class FuncionCorriente extends Funcion{

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
	 * Constructor de funci�n corriente
	 * @param fechaDate
	 * @param pTarifaBase
	 */
	public FuncionCorriente(Date fechaDate, long pTarifaBase, Cine pCine) {
		super(fechaDate, pTarifaBase, pCine);
	}

	//-------------
	// M�todos
	//------------
	
	/**
	 * M�todo toSring de funci�n corriente
	 */
	public String toString() {
		return "FuncionCorriente ["+super.toString()+"]";
	}
	
	/**
	 * Calcular valor de una boleta de una funci�n corriente
	 */
	public long calcularValorBoleta() {
		long valorBoleta = 0;
		valorBoleta = tarifaBase;
		return valorBoleta;
	}

	/**
	 * M�todo para comparar funciones seg�n id
	 */
	public int compareTo(Funcion otraFuncion) {
		int respuesta = (int) (id - otraFuncion.getId());
		return respuesta;
	}

}
