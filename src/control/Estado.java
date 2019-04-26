package control;

import modelo.poblacion.Seres;

public class Estado {

	private float demanda;
	private int numeroSeres;
	private int dineroActual;

	public Estado(float demanda, int numeroSeres, int dineroActual) {
		super();
		this.demanda = demanda;
		this.numeroSeres = numeroSeres;
		this.dineroActual = dineroActual;
	}

	public boolean fallecimiento(Seres seres) {
		boolean resultado = false;
		if (seres.generarEdad() >= seres.getEsperanzaVida()) {
			resultado = true;
			return resultado;
		}
		return resultado;
	}

	public void pagarTrabajador() {

	}

	public void comprobarProduccion() {
		// TODO
	}

	public void comprobarPorcentajeTrabajadores() {
		// TODO
	}

	public float getDemanda() {
		return demanda;
	}

	public int getNumeroSeres() {
		return numeroSeres;
	}

	public int getDineroActual() {
		return dineroActual;
	}
}
