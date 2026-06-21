package taller4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public static void main(String[] args) {
		new Ventana();

	}

	public Ventana() {
		setTitle("Ventana");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel tituloApp = new JPanel();
		JLabel titulo = new JLabel("Aplicación Pokemon TCG");
		JPanel botones = new JPanel();
		JButton botonAdm = new JButton("Administración");
		JButton botonColec = new JButton("Ver colección");
		
		botonAdm.addActionListener(e -> {
			abrirVentanaAdm();
		});
		
		botonColec.addActionListener(e -> {
			abrirVentanaColec();
		});
		
		botones.add(botonAdm);
		botones.add(botonColec);
		
		tituloApp.add(titulo);
		add(tituloApp, BorderLayout.NORTH);
		add(botones, BorderLayout.CENTER);
		setVisible(true);
	}

	private void abrirVentanaColec() {
		
		
	}

	private void abrirVentanaAdm() {
		
		
	}
	
	
	
	
}
