package taller4;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class VentanaDetalleCarta extends JFrame {

    public VentanaDetalleCarta(Carta carta) {
        setTitle(carta.getNombre());
        setSize(500,400);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        area.setEditable(false);

        String texto = "";

        texto += "Nombre: " + carta.getNombre() + "\n";
        texto += "Tipo: " + carta.getTipo() + "\n";
        texto += "Rareza: " + carta.getRareza() + "\n";

        VisitorCarta calculador = new CalcularPoder();

        texto += "Poder: " + carta.aceptar(calculador) + "\n\n";
        if(carta instanceof Pokemon) {
            Pokemon p = (Pokemon) carta;
            texto += "Daño: " + p.getDaño() + "\n";
            texto += "Energías: " + p.getCantEnergias();

        }
        else if(carta instanceof Item) {
            Item i = (Item) carta;
            texto += "Bonificación: " + i.getBonificacion();

        }
        else if(carta instanceof Supporter) {
            Supporter s = (Supporter) carta;
            texto += "Efectos por turno: " + s.getEfectosPorTurno();

        }
        else if(carta instanceof Energy) {
            Energy e = (Energy) carta;
            texto += "Elemento: " + e.getElemento();
        }

        area.setText(texto);

        add(area, BorderLayout.CENTER);

        setVisible(true);
    }
    private ImageIcon cargarImagen(Carta carta) {

        File archivo = new File("imagenes/" + carta.getNombre() + ".png");

        ImageIcon icono;

        if(archivo.exists()) {
            icono = new ImageIcon(archivo.getPath());
        }
        else {
            icono = new ImageIcon("imagenes/default.png");
        }

        Image imagen = icono.getImage().getScaledInstance(250,350,Image.SCALE_SMOOTH);

        return new ImageIcon(imagen);
    }
}