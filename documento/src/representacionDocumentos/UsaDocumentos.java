package representacionDocumentos;

import java.util.Date;
/**
 * Clase desde la que se ejecuta el programa principal que usar� las clases y m�todos creados
 * @version 09-11-2015
 */
public class UsaDocumentos{
    public static void main(String[] args){
        
        // Usaremos el ejemplo dado en la descripci�n de la pr�ctica
//        long segundosD�a = 60 * 60 * 24;
//        ComponenteCompuesto d, p;
          Date hoy = new Date();
        //  hoy.setTime(2222222);
    	  ComponenteTexto a= new ComponenteTexto("hola  me llamo pepe");
//    	  System.out.println(a.nPalabras());
    	  ComponenteNumero b= new ComponenteNumero(45);
    	  ComponenteCompuesto cp = new ComponenteCompuesto();
    	  cp.a�ade(a);
    	  cp.a�ade(b);
    	 // System.out.println(cp.nPalabras());
    	  
    	  ComponenteFecha cf = new ComponenteFecha(hoy);
    	  
    	  System.out.println(cf.nCaracteres());
    	  
//    	  System.out.println(b.nCaracteres());
//        p = new ComponenteCompuesto();
//        p.a�ade(new ComponenteTexto("Ristra "));
//        p.a�ade(new ComponenteNumero(1));
//        p.a�ade(new ComponenteTexto("\n"));
//        p.a�ade(new ComponenteTexto("Fecha de hoy "));
//        p.a�ade(new ComponenteFecha(hoy));
//        p.a�ade(new ComponenteTexto("\n"));
//        p.a�ade(new ComponenteTexto("Fecha de  ayer "));
//        p.a�ade(new ComponenteFecha(new Date(hoy.getTime() - segundosD�a*1000)));
//        p.a�ade(new ComponenteTexto("\n"));
//        p.a�ade(new ComponenteTexto("Fecha de hace 30 d�as ("));
//        p.a�ade(new ComponenteNumero(86400 * 30));
//        p.a�ade(new ComponenteTexto(" seg) "));
//        p.a�ade(new ComponenteFecha( new Date(hoy.getTime() - (segundosD�a * 30*1000))));
//        p.a�ade(new ComponenteTexto("\n"));
//        d = new ComponenteCompuesto();
//        d.a�ade(new ComponenteTexto("Componente de prueba"));
//        d.a�ade(new ComponenteTexto("\n"));
//        d.a�ade(p);
//        d.a�ade(new ComponenteTexto("Fin componente de prueba"));
//        System.out.println(d);
//        System.out.println("N�mero de caracteres " + p.nCaracteres());
//        System.out.println("N�mero de palabras " + p.nPalabras());
//        d.modifica(0, new ComponenteTexto("Inicio modificado"));
//        System.out.println(d);
//        System.out.println("N�mero de caracteres " + d.nCaracteres());
//        System.out.println("N�mero de palabras " + d.nPalabras());
        
        // Realizamos los test al final para que se muestre todo lo anterior
      //  org.junit.runner.JUnitCore.main("ComponentesTest"); 
    }
}