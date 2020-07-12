package co.edu.javeriana.cadenacines.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import co.edu.javeriana.cadenacines.negocio.Boleta;
import co.edu.javeriana.cadenacines.negocio.CadenaCines;
import co.edu.javeriana.cadenacines.negocio.CentroComercial;
import co.edu.javeriana.cadenacines.negocio.Cine;
import co.edu.javeriana.cadenacines.negocio.Cliente;
import co.edu.javeriana.cadenacines.negocio.ClienteMiembro;
import co.edu.javeriana.cadenacines.negocio.ClienteParticular;
import co.edu.javeriana.cadenacines.negocio.Funcion;
import co.edu.javeriana.cadenacines.negocio.FuncionDeGala;
import co.edu.javeriana.cadenacines.negocio.ICadenaCines;
import co.edu.javeriana.cadenacines.negocio.Pelicula;
import co.edu.javeriana.cadenacines.negocio.Silla;
import co.edu.javeriana.cadenacines.presentacion.Utils;

public class ManejadorArchivos {

	/**
	 * Método que carga los datos de los centros comerciales desde un archivo.
	 * @param ruta del archivo a cargar.
	 * @param cadena 
	 * @throws IOException cuando no encuentra el archivo.
	 */
	public static void leerCentros(String ruta, ICadenaCines cadena) throws FileNotFoundException
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea = br.readLine();//#CENTRO COMERCIAL o #FIN
			while(!linea.equals("#FIN"))
			{
				if(linea.equals("#CENTRO COMERCIAL")){
					linea = br.readLine();//#Nombre
					String nombreCentroComercial = br.readLine();
					linea = br.readLine();//#CINES
					CentroComercial nuevoCentro = new CentroComercial(nombreCentroComercial);                                          
					if(linea.equals("#CINES")){
						List<Cine> nuevosCines= nuevoCentro.getCines();  
						linea = br.readLine();//#sala-----------capacidad o #FIN CENTRO
						while (!linea.equals("#FIN CENTRO")){
							linea = br.readLine();
							String datosCine[]=linea.trim().split("\\*");
							String nombreSala=datosCine[0].trim();
							long capacidad=Long.parseLong(datosCine[1].trim());
							linea = br.readLine();//#SILLAS
							linea = br.readLine();//#fila-----numero-----tipo
							linea = br.readLine();
							Cine nuevoCine =new Cine(nombreSala, capacidad, nuevoCentro);
							while (!linea.equals("0")){
								String datosSillas[]=linea.trim().split("\\*");
								String silla=datosSillas[0].trim();
								int numeroSilla=Integer.parseInt(datosSillas[1].trim());
								String tipo = datosSillas[2].trim();
								Silla nuevaSilla=new Silla(silla, numeroSilla, tipo);							
								nuevoCine.getSillas().add(nuevaSilla);
								Collections.sort(nuevoCine.getSillas());
								linea = br.readLine();
							}
							if(!CadenaCines.buscarNombreSala(nombreSala, nuevosCines)){
								cadena.agregarCine(nuevosCines, nuevoCine);
							}
							linea = br.readLine();//#sala-----------capacidad o #FIN CENTRO
						}

					}
					if(!CadenaCines.buscarCentro(nombreCentroComercial)){
						cadena.agregarCentroComercial(nuevoCentro);
					}
				}
				linea = br.readLine();//#CENTRO COMERCIAL o #FIN
			}
			br.close();
		} 
		catch ()
		{

		}
	}

	/**
	 * Método que carga los datos de los clientes desde un archivo.
	 * @param pUrl - ruta del archivo a cargar.
	 * @param cadena
	 * @return cantidad de datos leidos.
	 * @throws IOException cuando no se encuentra el archivo.
	 * @throws ParseException cuando se ingresa la fecha de membresía en un formato incorrecto.
	 */
	public static int ingresarCliente(String pUrl, ICadenaCines cadena) throws FileNotFoundException, ParseException
	{
		int datosLeidos = 0;
		String url = pUrl;
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(url));
			String linea = br.readLine();

			while (linea != "#FIN" && linea != null)
			{
				if(linea.startsWith("#"))
				{
					linea = br.readLine();
				}
				else
				{
					String datos[] = linea.trim().split("\\*");
					String pNombre = datos[0].trim();
					String pEmail = datos[1].trim();
					String pTipoC = datos[2].trim();

					if(Utils.buscarCliente(pNombre, cadena.getClientes()) == false)
					{
						if(pTipoC.equalsIgnoreCase("miembro"))
						{
							String pFechaM = datos[3].trim();
							Date fechaMembresia = Utils.convertirAFechaMembresia(pFechaM);
							ClienteMiembro clienteAgregar = new ClienteMiembro(pNombre, pEmail, fechaMembresia);
							cadena.agregarClienteMiembro(clienteAgregar);

						}else if(pTipoC.equalsIgnoreCase("particular"))
						{
							ClienteParticular clienteAgregar = new ClienteParticular(pNombre, pEmail);
							cadena.agregarClienteParticular(clienteAgregar);

						}
						linea = br.readLine();
						datosLeidos++;
					}
					else
					{
						linea = br.readLine();
					}
				}
			}
			br.close();
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		catch (ParseException ex) 
		{
			ex.printStackTrace();
		}

		return datosLeidos;
	}

	/**
	 * Método que carga los datos de las películas desde un archivo.
	 * @param pUrl - ruta del archivo a cargar.
	 * @param peliculas HashMap de películas.
	 * @param cadena
	 * @return cantidad de datos leidos.
	 * @throws IOException cuando no encuentra el archivo.
	 */
	public static int ingresarPeliculas(String pUrl, Map<Long, Pelicula> peliculas, ICadenaCines cadena) throws FileNotFoundException
	{
		int datosLeidos = 0;
		String url = pUrl;
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(url));
			String linea = br.readLine();

			while (linea != "#FIN" && linea != null)
			{
				if(linea.startsWith("#"))
				{
					linea = br.readLine();
				}
				else
				{
					String datos[] = linea.trim().split("\\*");
					Long pCodigo = Long.parseLong(datos[0].trim());
					String pNombre = datos[1].trim();
					String pDescripcion = datos[2].trim();

					if (Utils.buscarPelicula(pNombre, peliculas) == false)
					{	
						Pelicula pelicula = new Pelicula(pCodigo, pNombre, pDescripcion);
						cadena.agregarPeliculaMap(pelicula, pCodigo);
						cadena.agregarPeliculaList(pelicula);
						linea = br.readLine();
						datosLeidos++;
					}
					else
					{
						linea = br.readLine();
					}
				}
			}
			br.close();
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}

		return datosLeidos;
	}

}
