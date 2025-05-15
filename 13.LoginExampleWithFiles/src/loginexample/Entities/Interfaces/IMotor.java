package loginexample.Entities.Interfaces;

public interface IMotor {
    // Método para encender el motor
    void encenderMotor();

    // Método para apagar el motor
    void apagarMotor();

    // Método para verificar el estado del motor
    boolean estadoMotor();

    // Método para obtener la potencia del motor
    int obtenerPotencia();
}