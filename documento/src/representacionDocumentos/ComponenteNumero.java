package representacionDocumentos;

public class ComponenteNumero extends Componente {
	private int num;

	public ComponenteNumero(int num) {
		this.num = num;
	}
	
	public String toString(){
		return String.valueOf(num);
		//return Integer.toString(num);
	}
	
	public int nCaracteres(){
		return String.valueOf(num).length();
	}
	
	public int nPalabras(){
		return 1;
	}
	
	public Componente copia(){
		Componente component = new ComponenteNumero(num);
		return component;
	}

}
