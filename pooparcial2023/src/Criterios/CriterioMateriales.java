package Criterios;

import Clases.Elemento;

public class CriterioMateriales implements Criterio{
    private String elemento;
    public CriterioMateriales (String elemento) {this.elemento = elemento;}

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.gerMateriales().contains(elemento);
    }
}
