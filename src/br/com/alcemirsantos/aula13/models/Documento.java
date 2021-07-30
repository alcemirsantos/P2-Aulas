package br.com.alcemirsantos.aula13.models;

public abstract class Documento {
	protected String numero;

	protected abstract boolean validar(String umValor);
	
	@Override
	public boolean equals(Object o) {
		if(o ==  null ) return false;
		if(!(o instanceof Documento)) return false;
		Documento documentoComparado = (Documento) o; // type cast
		boolean result = this.numero.equals(documentoComparado.numero);
		return result;
	}
}
