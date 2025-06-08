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

   public static double senh(double angulo) {
        double res = (Math.pow(Math.E, angulo) - Math.pow(Math.E, -angulo))/2;
        return res;
    }

    public static double cosh(double angulo) {
        double res = (Math.pow(Math.E, angulo) + Math.pow(Math.E, -angulo))/2;
        return res;
    }

    public static double tanh(double angulo) {
        double res = senh(angulo)/cosh(angulo);
        return res;
    }

   public static void main(String[] args){
    imprimir_opciones();
   }
}
/* 
 Así lo tenia pensado, que el usuario primera eliga que tipo de 
 funcion trigonometrica quiere medir, que luego ese valor meterlo a un switch
 y dentro de ese switch en cada caso preguntarle cual quiere medir(sen,cos,tan)
 y que meta el valor del angulo, para meter otro switch con los 3 casos
*/
import java.util.Scanner;//importamos el scanner, es como el input

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creamos una variable que sirve como scanner
        System.out.println("=== Calculadora de funciones trigonométricas ===");
        System.out.println("1: Funciones normales (sin, cos, tan)");
        System.out.println("2: Funciones inversas (arcsin, arccos, arctan)");
        System.out.println("3: Funciones hiperbólicas (sinh, cosh, tanh)");
        System.out.print("Seleccione una categoría (1-3): ");//El usuario elige cual funcion quiere
        int categoria = sc.nextInt();

        double valor, resultado = 0.0;
        switch (categoria) {// poner case 1 para las normales y case 3 para las hiperbólicas
            case 2:
                System.out.println("1: Arcoseno (arcsin)");
                System.out.println("2: Arcocoseno (arccos)");
                System.out.println("3: Arcotangente (arctan)");
                System.out.print("Seleccione una función (1-3): ");
                int opcionInversa = sc.nextInt();

                System.out.print("Ingrese el valor numérico (entre -1 y 1 para arcsin/arccos): ");
                valor = sc.nextDouble();
                /*
                El Math tiene funcion para calcular para normales, inversas e hiperbolas
                para ahorrar las funciones que estabas usando para sacar las
                hiperbolicas, ya que estas usando math para calcular, use la funcion
                que saca de una la hiperbolica
                */

                switch (opcionInversa) { 
                    case 1:
                        if (valor >= -1 && valor <= 1) {
                            resultado = Math.toDegrees(Math.asin(valor));
                        } else {
                            System.out.println("Error: arcsin solo acepta valores entre -1 y 1.");
                            sc.close();
                            return;
                        }
                        break;
                    case 2:
                        if (valor >= -1 && valor <= 1) {
                            resultado = Math.toDegrees(Math.acos(valor));
                        } else {
                            System.out.println("Error: arccos solo acepta valores entre -1 y 1.");
                            sc.close();
                            return;
                        }
                        break;
                    case 3:
                        resultado = Math.toDegrees(Math.atan(valor));
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        sc.close();
                        return;
                }
                System.out.println("Resultado: " + resultado + "°");
                break;
         }

   }
}
