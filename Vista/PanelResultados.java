package Vista;

import java. awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javafx.scene.paint.Color;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //----------
    // Atributos
    //----------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //----------
    // Metodos
    //----------
    
    /**Metodo constructor */
    public PanelResultados()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.RED);

        //Crear y agregar area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,450,130);
        this.add(spResultado);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Panel resultados");
        borde.setTitleColor(Color.BLACK);;
        this.setBorder((borde));
    }
    
    //Metodos de acceso a la información
    public void mostrarResultado(int pMayor)
    {
        taResultado.setText("El número mayor es: " + pMayor);
    }

    //Borrar resultado
    public void borrar()
    {
        taResultado.setText("");
    }
}
