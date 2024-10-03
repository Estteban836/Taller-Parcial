public class Motor {
    // Atributos privados
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;

    // Constructor para inicializar todos los atributos
    public Motor(int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos Getters y Setters para cada atributo
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Método para imprimir las características del motor
    public void imprimir() {
        System.out.println("Características del motor:");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Velocidad Máx: " + velocidadMax);
        System.out.println("Caballos de Fuerza: " + caballosFuerza);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}
