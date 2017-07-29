package representacionDocumentos;

public class ComponenteTexto extends Componente {
	private String text;
	
	public ComponenteTexto(String text) {
		this.text = text;
	}
	public String toString(){
		return text;
		
	}
	
	public int nCaracteres(){
		return text.replaceAll(" ","").length();
	}
	
	public int nPalabras(){
		text=text.trim();
		return text.split("\\s+").length;
	}
	
	public Componente copia(){
		Componente component = new ComponenteTexto(text);
		return component;
		
	}

}
