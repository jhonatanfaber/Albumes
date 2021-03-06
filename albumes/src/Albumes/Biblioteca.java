package Albumes;
import java.util.*;

public class Biblioteca {
	private Set<Album> albumes;
	
	
	public Biblioteca(){
		albumes = new HashSet<>();
	}
	
	public void añadeÁlbum(Album a){
		if(!albumes.contains(a)){
			albumes.add(a);
		}else{
			albumes.remove(a);
			albumes.add(a);
		}
	}
	
	public Album dameÁlbum(String name){
		for (Album album : albumes) {
			if(name.equals(album.dameNombre())){
				return album;
			}
		}
		return null;
	}
	
	public void eliminaÁlbum(String name){
		for (Album album : albumes) {
			if(album.dameNombre().equals(name)){
				albumes.remove(album);
			}
		}
	}
	
	public Set <Cancion> dameCancionesRepetidas(){
		Map<Cancion,Integer> mapa = new HashMap<>();
		Set<Cancion> canciones = new HashSet<>();
		for (Album album : albumes) {
			for (int i = 0; i < album.númeroDeCanciones(); i++) {
				Integer count = mapa.get(album.dameCanción(i));
				if(mapa.containsKey(album.dameCanción(i))){
					mapa.put(album.dameCanción(i), count+1);
				}else{
					mapa.put(album.dameCanción(i), 1);
				}
			//	mapa.put(album.dameCanción(i), (mapa.containsKey(album.dameCanción(i)) ? count+1: 1);
			}
		}
		//Set<Map.Entry<String, Integer>> ordenado = mapa.entrySet()(
		//for (Map.Entry<Cancion,Integer> lista : ordenado)
		for (Map.Entry<Cancion,Integer> lista : mapa.entrySet()) {
			if(lista.getValue() > 1 ){
				canciones.add(lista.getKey());
			}
		}
		return canciones;
	}
	
// ***************** Solo para list *****************
//	 class ComparadoraChachi implements Comparator <Map.Entry<String, Integer>>{
//	     public int compare (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
//		     if(a.getValue() < b.getValue()) return 1;
//           if(a.getValue() > b.getValue())return -1;
//           return a.getKey().compareTo(b.getKey());
//	     }
//	 }
//  SortedSet<Map.Entry<String,Integer>> ordenado = new TreeSet<>();
//  Collections.sort(ordenado,new ComparadoraChachi());
//	ordenado.addAll(mapa.entrySet());
//****************************************************
	
	
	public List<String> dameIntérpretes(){
		Map<String,Integer> mapa = new HashMap<>();
		for(Album album: albumes){
			for(int i = 0; i < album.númeroDeCanciones();i++){
				if(mapa.containsKey(album.dameCanción(i).dameIntérprete())){
					Integer count = mapa.get(album.dameCanción(i).dameIntérprete());
					mapa.put(album.dameCanción(i).dameIntérprete(), count+1);
				}else{
					mapa.put(album.dameCanción(i).dameIntérprete(),1);
				}
			}
		}
		//SortedSet
		Set<Map.Entry<String, Integer>> ordenado = new TreeSet<>(new Comparator <Map.Entry<String, Integer>>(){
			
			// si lo hago en el orden normal (a<b return -1   a>b return 1...) se ordenaria de menor a mayor
			// al metodo le paso 2 parametros de tipo map que son los que se van a ir comparando.
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
				if(a.getValue() < b.getValue()) return 1;
				if(a.getValue() > b.getValue()) return -1;
				// si tenemos el mismo numero de interpetes interpretando canciones, usamos el compareTo, que me los ordena
				// por orden alfabetico, si quiero que sea orden alfabetico inverso, pongo un - detras de -a.getKey().compareTo...
				return a.getKey().compareTo(b.getKey());
			}
		});
		ordenado.addAll(mapa.entrySet());
		//System.out.println("despues"+ordenado);
		List<String> lista = new ArrayList<>();
		for(Map.Entry<String,Integer> loop : ordenado){
			lista.add(loop.getKey());
		}
		return lista;
	}
	
	@Override
	public String toString(){
        String aux = "";
        for(Album album:albumes){
            aux += album +"\n";
        }
        return aux;
    }

}
