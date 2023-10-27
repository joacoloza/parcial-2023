package Criterios;
import Clases.Elemento;

public class CriterioTiempo implements  Criterio{
    private int tiempo;
    public CriterioTiempo (int tiempo){this.tiempo = tiempo;}

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getTiempo() < tiempo;
    }
}
