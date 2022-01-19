package entendendoRetornoJava;

public class Main {
    public static void main(String[] args) {
        ///Retornos

        System.out.println(" Exercício retornos");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println(" Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println(" Área do retângulo:" + areaRetangulo);

        double areaTrapézio = Quadrilatero.area(7,8,9);
        System.out.println(" Área do trapézio:" + areaTrapézio);

    }


}
