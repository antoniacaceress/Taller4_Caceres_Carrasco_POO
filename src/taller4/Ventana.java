package taller4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public static void main(String[] args) {
		SistemaImpl.getInstancia().leerArchivo();
		new Ventana();

	}

	public Ventana() {
		setTitle("Pokemon TCG");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton adm = new JButton("Administración");
        JButton coleccion = new JButton("Colección");

        adm.addActionListener(e -> {
            new PanelAdministracion();
        });

        coleccion.addActionListener(e -> {
            new PanelColeccion();
        });

        panel.add(adm);
        panel.add(coleccion);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
        
	}

	
	
	
	
}
