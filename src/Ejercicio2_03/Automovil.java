package Ejercicio2_03;

/**
 * Esta clase define objetos de tipo Automóvil con una marca, modelo, motor,
 * tipo de combustible, tipo de automóvil, número de puertas, cantidad de
 * asientos, velocidad máxima, color y velocidad actual.
 *
 * @version 1.2/2020
 */
public class Automovil {
// Atributo que define la marca de un automóvil

    String marca;
// Atributo que define el modelo de un automóvil
    int modelo;
// Atributo que define el motor de un automóvil
    int motor;
// Tipo de combustible como un valor enumerado

    enum tipoCom {
        GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
        GAS_NATURAL
    }
// Atributo que define el tipo de combustible
    tipoCom tipoCombustible;
// Tipo de automóvil como un valor enumerado

    enum tipoA {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,
        EJECUTIVO, SUV
    }
// Atributo que define el tipo de automóvil
    tipoA tipoAutomóvil;
// Atributo que define el número de puertas de un automóvil
    int númeroPuertas;
// Atributo que define la cantidad de asientos de un automóvil
    int cantidadAsientos;
// Atributo que define la velocidad máxima de un automóvil
    int velocidadMáxima;
// Color del automóvil como un valor enumerado

    enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA,
        AMARILLO, VERDE, AZUL, VIOLETA
    }
// Atributo que define el color de un automóvil
    tipoColor color;
// Atributo que define la velocidad de un automóvil
    int velocidadActual = 0;

    /**
     * Constructor de la clase Automóvil
     *
     * @param marca Parámetro que define la marca de un automóvil
     * @param modelo Parámetro que define el modelo (año de fabricación) de un
     * automóvil
     * @param motor Parámetro que define el volumen del cilindraje del motor
     * (puede ser gasolina, bioetanol, diésel, biodiesel o gas natural)
     * @param tipoAutomóvil Parámetro que define el tipo de automóvil (puede ser
     * Carro de ciudad, Subcompacto, Compacto, Familiar, Ejecutivo o SUV)
     * @param númeroPuertas Parámetro que define el número de puertas de un
     * automóvil 77 Clases y objetos
     * @param cantidadAsientos Parámetro que define la cantidad de asientos que
     * tiene el automóvil
     * @param velocidadMáxima Parámetro que define la velocidad máxima permitida
     * al automóvil
     * @param color Parámetro que define el color del automóvil (puede ser
     * Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul o Violeta)
     */
    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomóvil, int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
    }

    /**
     * Método que devuelve la marca de un automóvil
     *
     * @return La marca de un automóvil
     */
    String getMarca() {
        return marca;
    }

    /**
     * Método que devuelve el modelo de un automóvil
     *
     * @return El modelo de un automóvil
     *
     */
    int getModelo() {
        return modelo;
    }

    /**
     * Método que devuelve el volumen en litros del cilindraje del motor de un
     * automóvil
     *
     * @return El volumen en litros del cilindraje del motor de un automóvil
     */
    int getMotor() {
        return motor;
    }

    /**
     * Método que devuelve el tipo de combustible utilizado por el motor de un
     * automóvil
     *
     * @return El tipo de combustible utilizado por el motor de un automóvil
     */
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Método que devuelve el tipo de automóvil
     *
     * @return El tipo de automóvil
     */
    tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }

    /**
     * Método que devuelve el número de puertas de un automóvil
     *
     * @return El número de puertas que tiene un automóvil
     */
    int getNúmeroPuertas() {
        return númeroPuertas;
    }

    /**
     * Método que devuelve la cantidad de asientos de un automóvil
     *
     * @return La cantidad de asientos que tiene un automóvil
     */
    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    /**
     * Método que devuelve la velocidad máxima de un automóvil
     *
     * @return La velocidad máxima de un automóvil
     */
    int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    /**
     * Método que devuelve el color de un automóvil
     *
     * @return El color de un automóvil
     */
    tipoColor getColor() {
        return color;
    }

    /**
     * Método que devuelve la velocidad actual de un automóvil
     *
     * @return La velocidad actual de un automóvil
     */
    int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Método que establece la marca de un automóvil
     *
     * @param marca Parámetro que define la marca de un automóvil
     */
    void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que establece el modelo de un automóvil
     *
     * @param modelo Parámetro que define el modelo de un automóvil
     */
    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que establece el volumen en litros del motor de un automóvil
     *
     * @param motor Parámetro que define el volumen en litros del motor de un
     * automóvil
     */
    void setMotor(int motor) {
        this.motor = motor;
    }

    /**
     * Método que establece el tipo de combustible de un automóvil
     *
     * @param tipoCombustible Parámetro que define el tipo de combustible de un
     * automóvil
     */
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Método que establece el tipo de automóvil
     *
     * @param tipoAutomóvil Parámetro que define el tipo de automóvil
     */
    void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }

    /**
     * Método que establece el número de puertas de un automóvil
     *
     * @param númeroPuertas Parámetro que define el número de puertas de un
     * automóvil
     */
    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    /**
     * Método que establece la cantidad de asientos de un automóvil
     *
     * @param cantidadAsientos Parámetro que define la cantidad de asientos de
     * un automóvil
     */
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    /**
     * Método que establece la velocidad máxima de un automóvil
     *
     * @param velocidadMáxima Parámetro que define la velocidad máxima de un
     * automóvil
     */
    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    /**
     * Método que establece el color de un automóvil
     *
     * @param color Parámetro que define el color de un automóvil
     */
    void setColor(tipoColor color) {
        this.color = color;
    }

    /**
     * Método que establece la velocidad de un automóvil
     *
     * @param velocidadActual Parámetro que define la velocidad actual de un
     * automóvil
     */
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * Método que incrementa la velocidad de un automóvil
     *
     * @param incrementoVelocidad Parámetro que define la cantidad a incrementar
     * en la velocidad actual de un automóvil
     */
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
            /* Si el incremento de velocidad no supera la velocidad
máxima */
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            /* De otra manera no se puede incrementar la velocidad y
se genera mensaje */
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    /**
     * Método que decrementa la velocidad de un automóvil
     *
     * @param marca Parámetro que define la cantidad a decrementar en la
     * velocidad actual de un automovil
     *
     */
    void desacelerar(int decrementoVelocidad) {
        /* La velocidad actual no se puede decrementar alcanzando un
valor negativo */
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            /* De otra manera no se puede decrementar la velocidad y
se genera mensaje */
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    /**
     * Método que coloca la velocidad actual de un automóvil en cero
     */
    void frenar() {
        velocidadActual = 0;
    }

    /**
     * Método que calcula el tiempo que tarda un automóvil en recorrer cierta
     * distancia
     *
     * @param distancia Parámetro que define la distancia a recorrer por el
     * automóvil (en kilómetros)
     */
    double calcularTiempoLlegada(int distancia) {
        return distancia / velocidadActual;
    }

    /**
     * Método que imprime en pantalla los valores de los atributos de un
     * automóvil
     */
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
    }

}
