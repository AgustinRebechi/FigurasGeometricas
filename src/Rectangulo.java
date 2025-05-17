public class Rectangulo extends Figura{

    private double lado;
    private double alto;

    public Rectangulo(String nombre, double lado, double alto){
        super(nombre);
        this.lado = lado;
        this.alto = alto;
    }

    @Override
    public void calcularArea(){
        double area = lado * alto;
        System.out.println("El área del rectángulo " + nombre + " es: " + area);
    }


}
