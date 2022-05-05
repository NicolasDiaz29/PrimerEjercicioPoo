package Vista;

import java. awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
//import javafx.scene.paint.Color;

public class PanelEntradaDatos extends JPanel
{
    //----------
    // Atributos
    //----------
    private JLabel lX;
    private JLabel lY;
    private JLabel lImagen;
    private ImageIcon iImagen;
    private JTextField tfX;
    private JTextField tfY;


    //----------
    // Metodos
    //----------

    /**Metodo constructor */
    public PanelEntradaDatos()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.YELLOW);

        //Crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("imagen.jpg"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(10,20,220,130);
        this.add(lImagen);

        //Crear y agregar etiqueta X
        lX = new JLabel("X = ");
        lX.setBounds(240,50,120,20);
        this.add(lX);

        tfX = new JTextField();
        tfX.setBounds(265, 50, 120,20);
        this.add(tfX);

         //Crear y agregar etiqueta Y
         lY = new JLabel("Y = ");
         lY.setBounds(240,50,120,80);
         this.add(lY);

        tfY = new JTextField();
        tfY.setBounds(265, 80, 120,20);
        this.add(tfY);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Datos de entrada");
        borde.setTitleColor(Color.BLACK);;
        this.setBorder((borde));

    }

    // Metodos de acceso a la información
    public String gettfX()
    {
        return tfX.getText();
    }

    public String gettfY()
    {
        return tfY.getText();
    }

    // Metodo borrar cajas de texto
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
    }
}
