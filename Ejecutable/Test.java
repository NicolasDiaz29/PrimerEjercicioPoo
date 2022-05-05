package Ejecutable;

import Controlador.Controlador;
import Modelo.Mayor2Enteros;
import Vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Mayor2Enteros miModelo = new Mayor2Enteros(0, 0);
        Controlador miControlador = new Controlador(miVentana, miModelo);
    } 
}
