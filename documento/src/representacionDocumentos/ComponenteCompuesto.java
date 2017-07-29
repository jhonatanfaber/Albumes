package representacionDocumentos;

public class ComponenteCompuesto extends Componente {
	private Componente[] lista;
	private int count;
	
	public ComponenteCompuesto(){
		lista=new Componente[100];
		count=0;
	}
	
	public void añade(Componente component){
		if(count < 100){
			lista[count]=component;
			count++;
		}
	}
	
	public int cardinal() {
		return count;
	}
	
	public void modifica(int pos,Componente component){
		if(pos>=0 && pos < lista.length){
			lista[pos]=component;
		}
	}
	
	public String toString(){
		String res="";
		for (int i = 0; i < count; i++) {
			res+= lista[i] +" ";
		}
		return res;
	}
	
	public int nCaracteres(){
		String text = toString();
		return text.replaceAll(" ","").length();
		
	}
	
	public int nPalabras(){
		String text =toString();
		return text.split("\\s+").length;
		
	}
	
	public Componente copia(){
		ComponenteCompuesto cp = new ComponenteCompuesto();
		for (int i = 0; i < count; i++) {
			cp.añade(lista[i]);
		}
		return cp;
	}
	

}
