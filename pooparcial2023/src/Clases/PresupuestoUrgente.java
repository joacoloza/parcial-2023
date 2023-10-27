package Clases;

import java.util.Vector;

public class PresupuestoUrgente extends Presupuesto {
    private float porcentaje;
    public PresupuestoUrgente (String nombre,float porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    @Override
    public int getTiempo() {
        int max = -1;
        for (Elemento trabajo : listaDeTareas){
            int aux = trabajo.getTiempo();
            if (aux > max ){
                max = aux;
            }
        }
        return max;
    }

    @Override
    public int getEmpleados() {
        int sumaEmp = 0;
        for (Elemento trabajo : listaDeTareas){
            sumaEmp = sumaEmp + trabajo.getEmpleados();
        }
        return sumaEmp;
    }

    @Override
    public Vector<String> gerMateriales() {
        Vector<String> listaM = new Vector<>();
        for (Elemento trabajo : listaDeTareas){
            listaM.addAll(trabajo.gerMateriales());
        }
        return listaM;
    }

    @Override
    public float getCosto() {
        float suma = 0;
        for (Elemento trabajo : listaDeTareas){
            suma = suma + trabajo.getCosto();
        }
        return suma * porcentaje;
    }

    @Override
    public Presupuesto crearCopia() { return new PresupuestoUrgente(this.nombre,this.porcentaje); }
}

