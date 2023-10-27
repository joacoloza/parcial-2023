package Clases;

import java.util.Vector;

public class PresupuestoComplejo extends Presupuesto {
    protected float descuento;

    public PresupuestoComplejo (String nombre,float descuento){
        super(nombre);
        this.descuento = descuento;
    }

    @Override
    public float getCosto() {
        float suma = 0;
        for (Elemento elemento : listaDeTareas){
            suma = suma + elemento.getCosto();
        }
        return  suma * descuento;
    }

    @Override
    public int getTiempo() {
        int suma = 0;
        for (Elemento trabajo : listaDeTareas){
            suma = suma + trabajo.getTiempo();
        }
        return suma;
    }

    @Override
    public int getEmpleados() {
        int max = -1;
        for (Elemento trabajo : listaDeTareas){
            int aux = trabajo.getEmpleados();
            if (aux > max){
                max = aux;
            }
        }
        return max;
    }

    @Override
    public Vector<String> gerMateriales() {
        Vector<String> listaMat = new Vector<>();
        for (Elemento trabajo : listaDeTareas){
            Vector <String> aux = trabajo.gerMateriales();
            for (String tarea : aux){
                if (!listaMat.contains(tarea)){
                    listaMat.add(tarea);
                }
            }
        }
        return listaMat;
    }

    @Override
    public Presupuesto crearCopia() {return new PresupuestoComplejo(this.nombre,this.descuento);}
}
