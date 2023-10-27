package Criterios;

import Clases.Elemento;

public class CriterioAnd implements Criterio{
    private Criterio f1;
    private Criterio f2;
    public CriterioAnd (Criterio f1,Criterio f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return f1.cumple(elemento) && f2.cumple(elemento);
    }
}
