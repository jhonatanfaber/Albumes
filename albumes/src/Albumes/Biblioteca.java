package Albumes;
import java.util.*;

public class Biblioteca {
	private Set<Album> albumes;
	
	
	public Biblioteca(){
		albumes = new HashSet<>();
	}
	
	public void aÒade¡lbum(Album a){
		if(!albumes.contains(a)){
			albumes.add(a);
		}else{
			albumes.remove(a);
			albumes.add(a);
		}
	}
	
	public Album dame¡lbum(String name){
		for (Album album : albumes) {
			if(name.equals(album.dameNombre())){
				return album;
			}
		}
		return null;
	}
	
	public void elimina¡lbum(String name){
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
			for (int i = 0; i < album.n˙meroDeCanciones(); i++) {
				Integer count = mapa.get(album.dameCanciÛn(i));
				if(mapa.containsKey(album.dameCanciÛn(i))){
					mapa.put(album.dameCanciÛn(i), count+1);
				}else{
					mapa.put(album.dameCanciÛn(i), 1);
				}
			//	mapa.put(album.dameCanciÛn(i), (mapa.containsKey(album.dameCanciÛn(i)) ? count+1: 1);
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
	
	
	public List<String> dameIntÈrpretes(){
		Map<String,Integer> mapa = new HashMap<>();
		for(Album album: albumes){
			for(int i = 0; i < album.n˙meroDeCanciones();i++){
				if(mapa.containsKey(album.dameCanciÛn(i).dameIntÈrprete())){
					Integer count = mapa.get(album.dameCanciÛn(i).dameIntÈrprete());
					mapa.put(album.dameCanciÛn(i).dameIntÈrprete(), count+1);
				}else{
					mapa.put(album.dameCanciÛn(i).dameIntÈrprete(),1);
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
