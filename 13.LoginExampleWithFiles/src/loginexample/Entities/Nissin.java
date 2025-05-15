package loginexample.Entities;

import loginexample.Entities.Interfaces.IFreno;

public class Nissin implements IFreno {
    private boolean frenoActivo;

    @Override
    public void aplicarFreno() {
        frenoActivo = true;
        System.out.println("Freno Nissin aplicado.");
    }

    @Override
    public void liberarFreno() {
        frenoActivo = false;
        System.out.println("Freno Nissin liberado.");
    }

    @Override
    public boolean estadoFreno() {
        return frenoActivo;
    }
}