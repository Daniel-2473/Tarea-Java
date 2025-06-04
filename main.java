public class main {
    
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