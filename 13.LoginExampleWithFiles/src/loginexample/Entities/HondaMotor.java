package loginexample.Entities;

import loginexample.Entities.Interfaces.IMotor;

public class HondaMotor implements IMotor {
    private boolean motorEncendido;
    private int potencia;

    public HondaMotor(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void encenderMotor() {
        motorEncendido = true;
        System.out.println("Motor Honda encendido.");
    }

    @Override
    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor Honda apagado.");
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