package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    // ---------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelEntradaDatos2 miPanelEntradaDatos2;
    public PanelEntradaDatos3 miPanelEntradaDatos3;

    //--------
    // Metodos
    // -------

    /**Método constructor */
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,476,160);
        this.add(miPanelEntradaDatos);

        miPanelEntradaDatos2 = new PanelEntradaDatos2();
        miPanelEntradaDatos2.setBounds(10,150,476,160);
        this.add(miPanelEntradaDatos2);

        miPanelEntradaDatos3 = new PanelEntradaDatos3();
        miPanelEntradaDatos3.setBounds(10,300,476,160);
        this.add(miPanelEntradaDatos3);


        // Caracteristicas de la ventana
        this.setTitle("Mayor de 2 enteros");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}