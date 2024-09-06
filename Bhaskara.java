public class Bhaskara {
    private double varA;
    private double varB;
    private double varC;

    public Bhaskara(double varA, double varB, double varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public double[] total(){
        double delta = varB * varB - 4 * varA * varC;
        double[] formula = new double[2];
        if (delta >= 0){
            double x1 = (-varB + Math.sqrt(delta)) / (2 * varA);
            double x2 = (-varB - Math.sqrt(delta)) / (2 * varA);
            formula[0] = x1;
            formula[1] = x2;

        }else {
            System.out.println("Equação não possui numeros de raizes reais");
            return null;
        }

        return formula;
    }

}