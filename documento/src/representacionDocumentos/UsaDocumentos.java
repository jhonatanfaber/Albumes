package representacionDocumentos;

import java.util.Date;
/**
 * Clase desde la que se ejecuta el programa principal que usará las clases y métodos creados
 * @version 09-11-2015
 */
public class UsaDocumentos{
    public static void main(String[] args){
        
        // Usaremos el ejemplo dado en la descripción de la práctica
//        long segundosDía = 60 * 60 * 24;
//        ComponenteCompuesto d, p;
          Date hoy = new Date();
        //  hoy.setTime(2222222);
    	  ComponenteTexto a= new ComponenteTexto("hola  me llamo pepe");
//    	  System.out.println(a.nPalabras());
    	  ComponenteNumero b= new ComponenteNumero(45);
    	  ComponenteCompuesto cp = new ComponenteCompuesto();
    	  cp.añade(a);
    	  cp.añade(b);
    	 // System.out.println(cp.nPalabras());
    	  
    	  ComponenteFecha cf = new ComponenteFecha(hoy);
    	  
    	  System.out.println(cf.nCaracteres());
    	  
//    	  System.out.println(b.nCaracteres());
//        p = new ComponenteCompuesto();
//        p.añade(new ComponenteTexto("Ristra "));
//        p.añade(new ComponenteNumero(1));
//        p.añade(new ComponenteTexto("\n"));
//        p.añade(new ComponenteTexto("Fecha de hoy "));
//        p.añade(new ComponenteFecha(hoy));
//        p.añade(new ComponenteTexto("\n"));
//        p.añade(new ComponenteTexto("Fecha de  ayer "));
//        p.añade(new ComponenteFecha(new Date(hoy.getTime() - segundosDía*1000)));
//        p.añade(new ComponenteTexto("\n"));
//        p.añade(new ComponenteTexto("Fecha de hace 30 días ("));
//        p.añade(new ComponenteNumero(86400 * 30));
//        p.añade(new ComponenteTexto(" seg) "));
//        p.añade(new ComponenteFecha( new Date(hoy.getTime() - (segundosDía * 30*1000))));
//        p.añade(new ComponenteTexto("\n"));
//        d = new ComponenteCompuesto();
//        d.añade(new ComponenteTexto("Componente de prueba"));
//        d.añade(new ComponenteTexto("\n"));
//        d.añade(p);
//        d.añade(new ComponenteTexto("Fin componente de prueba"));
//        System.out.println(d);
//        System.out.println("Número de caracteres " + p.nCaracteres());
//        System.out.println("Número de palabras " + p.nPalabras());
//        d.modifica(0, new ComponenteTexto("Inicio modificado"));
//        System.out.println(d);
//        System.out.println("Número de caracteres " + d.nCaracteres());
//        System.out.println("Número de palabras " + d.nPalabras());
        
        // Realizamos los test al final para que se muestre todo lo anterior
      //  org.junit.runner.JUnitCore.main("ComponentesTest"); 
    }
}