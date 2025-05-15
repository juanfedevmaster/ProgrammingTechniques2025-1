package loginexample.Entities;

import loginexample.Entities.Interfaces.IMotor;

public class TeslaMotor implements IMotor {
    private boolean motorEncendido;
    private int potencia;

    public TeslaMotor(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void encenderMotor() {
        motorEncendido = true;
        System.out.println("Motor Tesla encendido.");
    }

    @Override
    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor Tesla apagado.");
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