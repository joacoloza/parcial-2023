package Criterios;

import Clases.Elemento;

public class CriterioNot implements Criterio {
    Criterio f;
    public CriterioNot (Criterio f) {this.f = f;}

    @Override
    public boolean cumple(Elemento elemento) {
        return !f.cumple(elemento);
    }
}
