public class Planeta {
    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
        // Atributos de la clase
        private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private int distanciaMediaAlSol = 0;
    private TipoPlaneta tipo;
    private boolean observableASimpleVista = false;
    private double periodoOrbital = 0.0;
    private double periodoRotacion = 0.0;

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipo, boolean observable,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Método para imprimir los atributos
    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaAlSol);
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable a simple vista: " + observableASimpleVista);
        System.out.println("Período orbital (años): " + periodoOrbital);
        System.out.println("Período de rotación (días): " + periodoRotacion);
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen; // Densidad en kg/km³
    }

    // determinar si es exterior
    public boolean esPlanetaExterior() {
        double distanciaEnUA = distanciaMediaAlSol * 1_000_000 / 149_597_870.0; // Convertir a UA
        return distanciaEnUA > 3.4; // Planeta exterior
    }

    // Main para crear objetos y mostrar sus atributos
    public static void main(String[] args) {
        // Crear dos planetas
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778,
                TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta planeta2 = new Planeta("Marte", 2, 6.4171e23, 163.18e9, 6779,
                227, TipoPlaneta.TERRESTRE, false, 1.88, 1.03);

        // Imprimir atributos de los planetas
        System.out.println("Atributos de " + planeta1.nombre + ":");
        planeta1.imprimirAtributos();
        System.out.println("Densidad: " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("¿Es planeta exterior? " + planeta1.esPlanetaExterior());

        System.out.println();

        System.out.println("Atributos de " + planeta2.nombre + ":");
        planeta2.imprimirAtributos();
        System.out.println("Densidad: " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("¿Es planeta exterior? " + planeta2.esPlanetaExterior());
    }
}