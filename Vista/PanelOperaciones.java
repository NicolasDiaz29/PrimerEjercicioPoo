package Vista;

import java. awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javafx.scene.paint.Color;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------
    // Atributos
    //----------
    public JButton btHallar;
    public JButton btBorrar;
    public JButton btSalir;

    //----------
    // Metodos
    //----------
    
    /**Metodo constructor */
    public PanelOperaciones()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.BLUE);

        //Crear y agregar botón hallar
        btHallar = new JButton("Hallar");
        btHallar.setBounds(45,40,100,20);
        this.add(btHallar);
        btHallar.setActionCommand("hallar");

        //Crear y agregar botón borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(190,40,100,20);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agregar botón salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(335,40,100,20);
        this.add(btSalir);
        btSalir.setActionCommand("salir");

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Panel operaciones");
        borde.setTitleColor(Color.BLACK);;
        this.setBorder((borde));
    }
}

