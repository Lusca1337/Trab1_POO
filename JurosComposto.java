public class JurosComposto {
    private double taxa;
    private double capital;
    private double periodo;

    public JurosComposto(double taxa, double capital, double periodo) {
        this.taxa = taxa;
        this.capital = capital;
        this.periodo = periodo;
    }

    public double jurosTotal(){
        double montante = capital * Math.pow((1 + taxa/100), periodo);
        return montante;
    }

    public double juros(){
        double juros = jurosTotal() - capital;
        return juros;
    }
}


