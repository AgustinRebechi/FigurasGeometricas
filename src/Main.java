//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo("r",5.0,5.0);
        rect.calcularArea();

        Circulo circ = new Circulo("c",1.0);
        circ.calcularArea();
    }
}
