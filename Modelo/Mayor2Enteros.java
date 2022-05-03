package Modelo;

public class Mayor2Enteros 
{
     //---------
    // Atributos
    // ---------
    private int x;
    private int y;
    private int Mayor;

    //--------
    // Metodos
    // -------

    /**Metodo constructor*/
    public Mayor2Enteros(int pX, int pY)
    {
        this.x = pX;
        this.y = pY;
        this.Mayor = 0;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public void setY(int y) 
    {
        this.y = y;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }

    public int getMayor() 
    {
        return Mayor;
    }

    public void hallarMayor()
    {
        if(x>y)
        {
            Mayor = x;
        }

        else
        {
            Mayor = y;
        }

    }



}
