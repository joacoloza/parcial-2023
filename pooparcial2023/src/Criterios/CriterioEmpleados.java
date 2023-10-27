package Criterios;

import Clases.Elemento;

public class CriterioEmpleados implements Criterio{
    private int emepleados;
    public CriterioEmpleados (int emepleados){ this.emepleados = emepleados;}

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getEmpleados() < emepleados;
    }
}
