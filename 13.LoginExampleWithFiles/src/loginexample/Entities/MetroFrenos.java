package loginexample.Entities;

import loginexample.Entities.Interfaces.IFreno;

public class MetroFrenos implements IFreno {
    private boolean frenoActivo;

    @Override
    public void aplicarFreno() {
        frenoActivo = true;
        System.out.println("Freno MetroFrenos aplicado.");
    }

    @Override
    public void liberarFreno() {
        frenoActivo = false;
        System.out.println("Freno MetroFrenos liberado.");
    }

    @Override
    public boolean estadoFreno() {
        return frenoActivo;
    }
}