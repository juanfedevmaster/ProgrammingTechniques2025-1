package loginexample.Entities;

import loginexample.Entities.Interfaces.IFreno;

public class Brembo implements IFreno {
    private boolean frenoActivo;

    @Override
    public void aplicarFreno() {
        frenoActivo = true;
        System.out.println("Freno Brembo aplicado.");
    }

    @Override
    public void liberarFreno() {
        frenoActivo = false;
        System.out.println("Freno Brembo liberado.");
    }

    @Override
    public boolean estadoFreno() {
        return frenoActivo;
    }
}