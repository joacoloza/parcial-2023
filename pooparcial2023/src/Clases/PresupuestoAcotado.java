package Clases;

import Criterios.Criterio;

public class PresupuestoAcotado extends PresupuestoComplejo {
    private Criterio criterio;
    public PresupuestoAcotado (String nombre,float descuento, Criterio criterio){
        super(nombre,descuento);
        this.criterio = criterio;
    }

    @Override
    public void addElem(Elemento elemento) {
        if (criterio.cumple(elemento)){
            super.addElem(elemento);
        }
    }

    @Override
    public Presupuesto crearCopia() {return  new PresupuestoAcotado(this.nombre,this.descuento,this.criterio);}
}
