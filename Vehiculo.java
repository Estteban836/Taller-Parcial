public class Vehiculo {
    // Atributos privados
    private String placa;
    private String marca;
    private Motor motor;

    // Primer constructor: solo recibe placa y marca, el motor se instancia con valores por defecto
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(1400, 240, 4, "diesel"); // Valores por defecto para el motor
    }

    // Segundo constructor: recibe placa, marca y todos los atributos del motor
    public Vehiculo(String placa, String marca, int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(cilindrada, velocidadMax, caballosFuerza, tipoCombustible);
    }

    // Métodos Getters y Setters para los atributos de la clase Vehiculo
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return motor.getCilindrada();
    }

    public void setCilindrada(int cilindrada) {
        motor.setCilindrada(cilindrada);
    }

    public double getVelocidadMax() {
        return motor.getVelocidadMax();
    }

    public void setVelocidadMax(double velocidadMax) {
        motor.setVelocidadMax(velocidadMax);
    }

    public int getCaballosFuerza() {
        return motor.getCaballosFuerza();
    }

    public void setCaballosFuerza(int caballosFuerza) {
        motor.setCaballosFuerza(caballosFuerza);
    }

    public String getTipoCombustible() {
        return motor.getTipoCombustible();
    }

    public void setTipoCombustible(String tipoCombustible) {
        motor.setTipoCombustible(tipoCombustible);
    }

    // Método para imprimir las características del vehículo y del motor
    public void imprimir() {
        System.out.println("Características del vehículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        motor.imprimir(); // Llamamos al método imprimir del motor
    }
}
