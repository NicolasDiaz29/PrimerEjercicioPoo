package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    // ---------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

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

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,170,476,160);
        this.add(miPanelOperaciones);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,327,476,160);
        this.add(miPanelResultados);


        // Caracteristicas de la ventana
        this.setTitle("Mayor de 2 enteros");
        this.setSize(500,530);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}