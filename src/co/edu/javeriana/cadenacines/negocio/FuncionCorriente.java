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
	 * Constructor de función corriente
	 * @param fechaDate
	 * @param pTarifaBase
	 */
	public FuncionCorriente(Date fechaDate, long pTarifaBase, Cine pCine) {
		super(fechaDate, pTarifaBase, pCine);
	}

	//-------------
	// Métodos
	//------------
	
	/**
	 * Método toSring de función corriente
	 */
	public String toString() {
		return "FuncionCorriente ["+super.toString()+"]";
	}
	
	/**
	 * Calcular valor de una boleta de una función corriente
	 */
	public long calcularValorBoleta() {
		long valorBoleta = 0;
		valorBoleta = tarifaBase;
		return valorBoleta;
	}

	/**
	 * Método para comparar funciones según id
	 */
	public int compareTo(Funcion otraFuncion) {
		int respuesta = (int) (id - otraFuncion.getId());
		return respuesta;
	}

}
