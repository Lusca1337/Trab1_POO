public class Main {
    public static void main(String[] args) {
        System.out.println("Questão A:");

        Bhaskara variaveis = new Bhaskara(5, 10, 2);
        double[] formula = variaveis.total();
        if (formula != null) {
            System.out.println("x1: "+ formula[0]);
            System.out.println("x2: "+ formula[1]);
        }

        System.out.println("-------------------------");

        System.out.println("Questão B:");

        double[] n = {7, 10, 13, 18, 20};
        CV cv1 = new CV(n);

        System.out.printf("CV: %.2f" ,cv1.calCV());
        System.out.println("");

        System.out.println("--------------------------");

        System.out.println("Questão C:");

        JurosComposto juros = new JurosComposto(2200, 10, 4);

        System.out.printf("Montante : %.2f %n",juros.jurosTotal());
        System.out.printf("Juros: %.2f",juros.juros());

    }
}
