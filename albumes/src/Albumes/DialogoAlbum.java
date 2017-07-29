package Albumes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DialogoAlbum extends JDialog {

	private JButton añadirCancion, finalizar, cancelar;
	private JTextArea area;
	private JScrollPane scroll;

	public DialogoAlbum(JFrame jf, Album album) {
		setTitle("Nuevo Album");
		 setModal(true);

		JPanel norte = new JPanel();
		norte.add(añadirCancion = new JButton("añadir cancion"));
		norte.add(new JScrollPane(area = new JTextArea(10, 20)));
		 area.setEditable(false);

		JPanel sur = new JPanel();
		sur.add(finalizar = new JButton("finalizar"));
		sur.add(cancelar = new JButton("Cancelar"));

		Container panel = getContentPane();
		panel.add(norte, BorderLayout.NORTH);
		panel.add(sur, BorderLayout.SOUTH);

		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		añadirCancion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DialogoCancion dialogoCan = new DialogoCancion(DialogoAlbum.this);
				Cancion cancion = new Cancion(dialogoCan.getTitulo(), dialogoCan.getInterprete(),
						Integer.parseInt(dialogoCan.getDuracion()));
				album.añadeCanción(cancion);
				area.setText(album.toString());
			}
		});
		
		finalizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public String textoAlbum(){
		return area.getText();
	}

}