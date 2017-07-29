package Albumes;

/**
 * Clase Cancion que representa canciones 
 * 
 * @author JDGD
 * @vesion 17/11/2016
 * 
 */
public class Cancion {
    private String t�tulo;     // nombre de la canci�n
    private String int�rprete; // nombre del int�rprete
    private int duraci�n;      // duraci�n de la canci�n en segundos

    /**
     * Constructor al que se le pasa el t�tulo, 
     * el int�rprete y la duraci�n de la canci�n
     * 
     * @param t�tulo nombre de la canci�n
     * @param int�rprete nombre del int�rprete
     * @param duraci�n tiempo de la canci�n en segundos
     */ 
    public Cancion(String t�tulo, String int�rprete, int duraci�n) {
        this.t�tulo = t�tulo;
        this.int�rprete = int�rprete;
        this.duraci�n = duraci�n;
    }

    /**
     * Devuelve el nombre de la canci�n
     * 
     * @return t�tulo de la canci�n
     */ 
    public String dameT�tulo() { 
        return t�tulo;
    }

    /**
     * Devuelve el nombre del int�rprete de la canci�n
     * 
     * @return int�rprete de la canci�n
     */ 
    public String dameInt�rprete() {
        return int�rprete;
    }

    /**
     * Devuelve la duraci�n de la canci�n
     * 
     * @return duraci�n de la canci�n
     */ 
    public int dameDuraci�n() {
        return duraci�n;
    }

    /**
     * @return String con la concatenaci�n entre corchetes del t�tulo, 
     * el int�rprete y la duraci�n de la canci�n, separados por un espacio.
     */ 
    @Override
    public String toString() { 
        return "[T�tulo:"+t�tulo+" int�rprete:"+int�rprete+" duraci�n:"+duraci�n+"]";
    }
    
    @Override
    public boolean equals(Object obj){
    	if(obj instanceof Cancion){
    		Cancion cancion = (Cancion) obj;
    		return cancion.dameT�tulo().equals(t�tulo);
    	}
    	return false;
    }
    
    @Override
    public int hashCode(){
    	return t�tulo.hashCode();
    }
    
    

}
