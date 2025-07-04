package A6_ejemploClaroInterfaces;

import java.lang.constant.DynamicCallSiteDesc;
import java.net.StandardSocketOptions;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio ) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * (radio*radio);
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Ratando el circulo");
    }
}
