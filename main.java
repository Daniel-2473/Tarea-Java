public class Main {
   public static void imprimir_opciones() {
    System.out.println("Calculadora de funciones trigonométricas");
    System.out.println("1: Seno (sen)"); //La idea es que el usuario ingrese algún número para seleccionar la función
    System.out.println("2: Coseno (cos)");
    System.out.println("3: Tangente (tan)");
    System.out.println("4: Arcoseno (arcsen)");
    System.out.println("5: Arcocoseno (arccos)");
    System.out.println("6: Arcotangente (arctan)");
    System.out.println("7: Seno hiperbólico (senh)");
    System.out.println("8: Coseno hiperbólico (cosh)");
    System.out.println("9: Tangente hiperbólico (tanh)");
   }

   public static void main(String[] args){
    imprimir_opciones();
   }
}

class funciones_hiperblicas {
    public double senh(double angulo) {
        double res = (Math.pow(Math.E, angulo) - Math.pow(Math.E, -angulo))/2;
        return res;
    }

    public double cosh(double angulo) {
        double res = (Math.pow(Math.E, angulo) + Math.pow(Math.E, -angulo))/2;
        return res;
    }

    public double tanh(double angulo) {
        double res = senh(angulo)/cosh(angulo);
        return res;
    }
}