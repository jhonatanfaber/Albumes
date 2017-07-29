package Albumes;

//import static org.junit.Assert.assertEquals;

public class UsaBiblioteca{
    static public void main(String[] args){
        Cancion canci�n1 = new Cancion("song1","i1",90);
        Cancion canci�n2 = new Cancion("song2","i1",90);
        Cancion canci�n3 = new Cancion("song3","i2",120);
        Cancion canci�n4 = new Cancion("song1","i2",120);
        Cancion canci�n5 = new Cancion("song3","i2",120);
        Cancion canci�n6 = new Cancion("song4","i3",150);
        Cancion canci�n7 = new Cancion("song1","i3",150);

// DESCOMENTAR Y USAR CUANDO EST�N IMPLEMENTADOS
        Album �lbum1 = new Album("�lbum 1");
        �lbum1.a�adeCanci�n(canci�n1);
        �lbum1.a�adeCanci�n(canci�n2);
        �lbum1.a�adeCanci�n(canci�n3);        
//        System.out.println(�lbum1);
//        				
        Album �lbum2 = new Album("�lbum 2");
        �lbum2.a�adeCanci�n(canci�n4);
        �lbum2.a�adeCanci�n(canci�n5);
        �lbum2.a�adeCanci�n(canci�n6);
        �lbum2.a�adeCanci�n(canci�n7);
//        System.out.println(�lbum2);
//
        Album �lbum3 = new Album("�lbum 2");
        �lbum3.a�adeCanci�n(canci�n1);
//        System.out.println(�lbum3);
        
        Biblioteca miBiblioteca = new Biblioteca();
		miBiblioteca.a�ade�lbum(�lbum1);
		miBiblioteca.a�ade�lbum(�lbum2);
        System.out.println(miBiblioteca.dameCancionesRepetidas());

// Resultado mostrado en consola:
// �lbum 1:                                                                        
// 1) [T�tulo:song1 int�rprete:i1 duraci�n:90]                                     
// 2) [T�tulo:song2 int�rprete:i1 duraci�n:90]                                     
// 3) [T�tulo:song3 int�rprete:i2 duraci�n:120]                                    
                                                                                 
// �lbum 2:                                                                        
// 1) [T�tulo:song1 int�rprete:i2 duraci�n:120]                                    
// 2) [T�tulo:song3 int�rprete:i2 duraci�n:120]                                    
// 3) [T�tulo:song4 int�rprete:i3 duraci�n:150]                                    
// 4) [T�tulo:song1 int�rprete:i3 duraci�n:150]                                    

        //DESCOMENTAR para ejecutar la clase de pruebas con JUnit
//        org.junit.runner.JUnitCore.main("BibliotecaTest");
    }
}
