package Clases;

import Criterios.Criterio;
import java.util.Vector;

public abstract class Presupuesto extends Elemento {
    protected Vector<Elemento> listaDeTareas;
    public Presupuesto (String nombre){
        super(nombre);
        listaDeTareas = new Vector<>();
    }
    public abstract Presupuesto crearCopia ();
    public void addElem (Elemento elemento){listaDeTareas.add(elemento);}

    public Vector <Elemento> listar (Criterio criterio){
        Vector <Elemento> listaCumple = new Vector<>();
        for (Elemento trabajo : listaDeTareas){
            listaCumple.addAll(trabajo.listar(criterio));
        }
        return listaCumple;
    }
}
