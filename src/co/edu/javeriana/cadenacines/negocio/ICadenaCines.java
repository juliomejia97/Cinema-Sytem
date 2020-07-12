package co.edu.javeriana.cadenacines.negocio;

import java.util.List;

public interface ICadenaCines {
	

	public void agregarCentroComercial(CentroComercial centroNuevo); 
	
	public void agregarCine(List<Cine> nuevosCines, Cine cineAgregar);
	
	public void agregarPeliculaMap(Pelicula nuevaPelicula, long pCodigo); 
	
	public void agregarPeliculaList(Pelicula nuevaPelicula); 
	
	public void agregarFuncionGala(FuncionDeGala funcionAgregar, Pelicula peliculaFuncion, Cine cineFuncion);
	
	public void agregarFuncionCorriente(FuncionCorriente funcionAgregar, Pelicula peliculaFuncion, Cine cineFuncion);
	
	public void agregarClienteMiembro(ClienteMiembro clienteAgregar); 
	
	public void agregarClienteParticular(ClienteParticular clienteAgregar); 
	
	public void comprarBoleta(List<Boleta> boletasCliente, Boleta boletaAsignar);
}
