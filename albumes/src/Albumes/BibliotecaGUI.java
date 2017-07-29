package Albumes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BibliotecaGUI extends JFrame {
	private JTextArea lista;
	private JButton otro;
	private Biblioteca miBiblioteca;
	

	private void initBiblioteca() {

		miBiblioteca = new Biblioteca();
		Cancion canci�n1 = new Cancion("song1", "i1", 90);
		Cancion canci�n2 = new Cancion("song2", "i1", 90);
		Cancion canci�n3 = new Cancion("song3", "i2", 120);
		Cancion canci�n4 = new Cancion("song1", "i2", 120);
		Cancion canci�n5 = new Cancion("song3", "i2", 120);
		Cancion canci�n6 = new Cancion("song4", "i3", 150);
		Cancion canci�n7 = new Cancion("song1", "i3", 150);

		Album �lbum1 = new Album("�lbum 1");
		�lbum1.a�adeCanci�n(canci�n1);
		�lbum1.a�adeCanci�n(canci�n2);
		�lbum1.a�adeCanci�n(canci�n3);

		Album �lbum2 = new Album("�lbum 2");
		�lbum2.a�adeCanci�n(canci�n4);
		�lbum2.a�adeCanci�n(canci�n5);
		�lbum2.a�adeCanci�n(canci�n6);
		�lbum2.a�adeCanci�n(canci�n7);

		miBiblioteca.a�ade�lbum(�lbum1);
		miBiblioteca.a�ade�lbum(�lbum2);
	}

	public BibliotecaGUI(String t) {
		super(t);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initBiblioteca();
		Container p = getContentPane();
		lista = new JTextArea(20, 25);
		otro = new JButton("A�adir �lbum");

		p.add(new JScrollPane(lista), BorderLayout.CENTER);
		JPanel rellenoBot�n = new JPanel();
		rellenoBot�n.add(otro);
		p.add(rellenoBot�n, BorderLayout.WEST);
		lista.setEditable(false);
		lista.setText(miBiblioteca.toString());

		otro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = JOptionPane.showInputDialog("Introduzca el nombre de un album");
				if(n != null && n.length() > 0){
					Album pepe = new Album(n);
					DialogoAlbum dialogAlb = new DialogoAlbum(BibliotecaGUI.this, pepe);
					lista.append(dialogAlb.textoAlbum() +"\n");
				}

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BibliotecaGUI("Mi biblioteca");
	}
}
