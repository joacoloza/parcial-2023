package Clases;

import Criterios.Criterio;

import java.util.Vector;

public  abstract class Elemento {
    protected String nombre;

    public Elemento(String nombre){
        this.nombre = nombre;
    }
    public abstract float getCosto();
    public abstract Vector<String> gerMateriales();
    public abstract int getTiempo();
    public abstract int getEmpleados ();
    public abstract Vector<Elemento> listar (Criterio criterio);
}
