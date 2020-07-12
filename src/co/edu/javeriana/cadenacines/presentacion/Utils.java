package co.edu.javeriana.cadenacines.presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import co.edu.javeriana.cadenacines.negocio.CadenaCines;
import co.edu.javeriana.cadenacines.negocio.CentroComercial;
import co.edu.javeriana.cadenacines.negocio.Cine;
import co.edu.javeriana.cadenacines.negocio.Cliente;
import co.edu.javeriana.cadenacines.negocio.Funcion;
import co.edu.javeriana.cadenacines.negocio.Pelicula;

public class Utils {

	//-------------
	//Constantes
	//-------------

	//-------------
	//Atributos
	//-------------

	//-------------
	//Relaciones
	//-------------

	//-------------
	//Constructor
	//-------------

	//-------------
	//Métodos
	//-------------

	/**
	 * Método que se encarga de convertir los datos ingresados en la fecha de membresía de un cliente.
	 * @param pFecha - fecha de membresía. 
	 * @return Fecha de membresía convertida en un Date.
	 * @throws ParseException cuando la fecha de membresía se ingresa en un formato incorrecto.
	 */
	public static Date convertirAFechaMembresia(String pFecha) throws ParseException 
	{
		Date fecha = null; 
		SimpleDateFormat formatoIngresado = new SimpleDateFormat("yyyy/MM/dd"); //Se le da el formato base que será ingresado por el usuario
		fecha = formatoIngresado.parse(pFecha);
		return fecha;
	}

	/**
	 * Método que se encarga de convertir los datos ingresados en la fecha y hora de una función.
	 * @param pFecha - fecha de la función.
	 * @return Fecha de una función convertida en un Date.
	 * @throws ParseException cuando la fecha se ingresa en un formato incorrecto.
	 */
	public static Date convertirAFechayHora(String pFecha) throws ParseException 
	{
		Date fecha = null; 
		SimpleDateFormat formatoIngresado = new SimpleDateFormat("yyyy/MM/dd"+"H:mm"); //Se le da el formato base que será ingresado por el usuario
		fecha = formatoIngresado.parse(pFecha);
		return fecha;
	}

	
}