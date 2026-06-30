package taller4;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelColeccion extends JFrame {

    private DefaultListModel<Carta> modelo;
    private JList<Carta> lista;
    private JComboBox<String> comboOrden;

    public PanelColeccion() {

        setTitle("Colección");
        setSize(700, 600);
        setLocationRelativeTo(null);

        comboOrden = new JComboBox<>();
        
        comboOrden.addItem("Predeterminado");
        comboOrden.addItem("Nombre");
        comboOrden.addItem("Rareza");
        comboOrden.addItem("Poder");

        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);

        lista.setCellRenderer((list, value, index, isSelected, cellHasFocus)
                -> new javax.swing.JLabel(value.getNombre()));

        comboOrden.addActionListener(e -> ordenar());
        lista.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {

                    Carta carta = lista.getSelectedValue();

                    if (carta != null) {
                        new VentanaDetalleCarta(carta);
                    }
                }
            }
        });

        add(comboOrden, BorderLayout.NORTH);
        add(new JScrollPane(lista), BorderLayout.CENTER);

        cargarCartas();

        setVisible(true);
        
        
    }

    private void cargarCartas() {

        modelo.clear();

        for (Carta c : SistemaImpl.getInstancia().getColeccion()) {
            modelo.addElement(c);
        }
    }

    private void ordenar() {

        String opcion = comboOrden.getSelectedItem().toString();

        SistemaImpl sistema = SistemaImpl.getInstancia();

        switch(opcion) {

            case "Nombre":
                sistema.ordenarNombre();
                
                break;

            case "Rareza":
                sistema.odenarRareza();
                break;

            case "Poder":
                sistema.ordenarPoder();
                break;
        }

        cargarCartas();
    }
}