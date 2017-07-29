package Albumes;

import java.util.*;

public class Album {
	private String name;
	private List<Cancion> lista;
	
	public Album(String name){
		this.name=name;
		lista=new ArrayList<>();
	}
	
	public String dameNombre(){
		return name;
	}
	
	public int n�meroDeCanciones(){
		return lista.size();
	}
	
	public Cancion dameCanci�n(int pos){
		if(pos >= 0 && pos < lista.size()){
			return lista.get(pos);
		}
		return null;
	}
	
	public void a�adeCanci�n(Cancion song){
		lista.add(song);
	}
	
	public void quitaCanci�n(int pos){
		if(pos >= 0 && pos < lista.size()){
			lista.remove(pos);
		}
	}
	
	public int duraci�n(){
		int total = 0;
		for(Cancion cancion: lista){
			total += cancion.dameDuraci�n();
		}
		return total;
	}
	
	@Override
	public String toString(){
		String res = dameNombre() +":\n";
		for(int i = 0; i < lista.size();i++){
			res+= i+1 +") "+ lista.get(i) +"\n";
		}
		return res;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Album ){
			Album album = (Album) obj;
			//return album.dameNombre().equals(name);
			return name.equals(album.dameNombre());
		}
		return false;
	}
	
	@Override
    public int hashCode(){
    	return name.hashCode();
    }
	
	
}
