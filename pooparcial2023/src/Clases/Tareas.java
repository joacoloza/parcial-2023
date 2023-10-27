package Clases;

import Clases.Elemento;
import Criterios.Criterio;

import java.util.Vector;

public class Tareas extends Elemento {
    private float costo;
    private int cantEmp;
    private int tiempo;
    private Vector <String> materiales;
    public Tareas(String nombre,float costo, int cantEmp, int tiempo) {
        super(nombre);
        this.costo = costo;
        this.cantEmp = cantEmp;
        this.tiempo = tiempo;
        this.materiales = new Vector<>();
    }
    public void addMaterial (String nuevoMaterial){ materiales.add(nuevoMaterial); }
    @Override
    public float getCosto() { return costo; }

    @Override
    public int getTiempo() {return tiempo;}

    @Override
    public Vector<String> gerMateriales() { return materiales; }

    @Override
    public int getEmpleados() {return cantEmp;}

    @Override
    public Vector<Elemento> listar(Criterio criterio) {
        Vector<Elemento> listaCumple = new Vector<>();
        if (criterio.cumple(this)){
            listaCumple.add(this);
        }
        return listaCumple;
    }
}
