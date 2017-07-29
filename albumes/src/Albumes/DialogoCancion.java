package Albumes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DialogoCancion extends JDialog{
	private JButton aceptar,cancelar;
	private JLabel titulo,interprete,duracion;
	private JTextField campoTitulo,campoInterprete,campoDuracion;
	
	
	public DialogoCancion(DialogoAlbum dialogAlb){
		setTitle("Añade Cancion");
		setModal(true);
		JPanel panelTitulo= new JPanel();
		panelTitulo.add(titulo = new JLabel("titulo"));
		panelTitulo.add(campoTitulo = new JTextField(10));
		
		JPanel panelInterprete= new JPanel();
		panelInterprete.add(interprete = new JLabel("Interprete"));
		panelInterprete.add(campoInterprete = new JTextField(10));
		
		JPanel panelDuracion= new JPanel();
		panelDuracion.add(duracion = new JLabel("Duracion"));
		panelDuracion.add(campoDuracion = new JTextField(10));
		
		JPanel campos = new JPanel(new BorderLayout());
		campos.add(panelTitulo,BorderLayout.NORTH);
		campos.add(panelInterprete,BorderLayout.CENTER);
		campos.add(panelDuracion,BorderLayout.SOUTH);
		
		JPanel botones = new JPanel();
		botones.add(aceptar = new JButton("Aceptar"));
		botones.add(cancelar = new JButton("Cancelar"));
		
		
		Container panel = getContentPane();
		panel.add(campos,BorderLayout.NORTH);
		panel.add(botones,BorderLayout.SOUTH);
		
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		aceptar.addActionListener(new ActionListener() {
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
	
	public String getTitulo(){
		return campoTitulo.getText();
	}
	
	public String getInterprete(){
		return campoInterprete.getText();
	}
	
	public String getDuracion(){
		return campoDuracion.getText();
	}
	
}