package control;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.empresa.Factorias;
import modelo.poblacion.Seres;

public class Sede {
	private ArrayList<Factorias> factorias;

	public Sede(ArrayList<Factorias> factorias) {
		super();
		this.factorias = new ArrayList<>();
	}

	public void crearFactoria() {
		this.factorias.add(new Factorias());
	}

	public int produccionTotal() {
		int produccion = 0;
		for (Factorias factoria : factorias) {
			factoria.comprobarProduccion();
		}
		return produccion;
	}
	public ArrayList<Factorias> eliminarJubilados(ArrayList<Integer> listaJubilados) {
		for (Iterator iterator = factorias.iterator(); iterator.hasNext();) {
			Factorias factoria = (Factorias) iterator.next();
			for (Iterator iterator2 = factoria.getPilaTrabajador().iterator(); iterator2.hasNext();) {
				Seres ser = (Seres) iterator2.next();
				if (listaJubilados.contains(ser.getId())) {
					iterator2.remove();
				}
			}
		}
		return null;
	};

	public void numTrabajadores() {
		int contador = 0;
		for (Factorias factoria : factorias) {
			contador = contador + factoria.getPilaTrabajador().size();
		}

	}

	public ArrayList<Factorias> getFactorias() {
		return factorias;
	}

	public void setFactorias(ArrayList<Factorias> factorias) {
		this.factorias = factorias;
	}
}
