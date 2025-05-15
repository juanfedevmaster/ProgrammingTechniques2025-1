package loginexample.Entities;

import loginexample.Entities.Interfaces.IMotor;

public class ToyotaMotor implements IMotor {
    private boolean motorEncendido;
    private int potencia;

    public ToyotaMotor(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void encenderMotor() {
        motorEncendido = true;
        System.out.println("Motor Toyota encendido.");
    }

    @Override
    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor Toyota apagado.");
    }

    @Override
    public boolean estadoMotor() {
        return motorEncendido;
    }

    @Override
    public int obtenerPotencia() {
        return potencia;
    }
}