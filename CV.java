public class CV {
    private double[] n;

    public CV(double[] n) {
        this.n = n;
    }

    public double media(){
        double sum = 0.0;
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum / n.length;
    }

    public double calCV(){
        double media = media();
        double sum = 0.0;
        double radical;
        for (int i = 0; i < n.length; i++){
            sum += Math.pow(n[i] - media, 2);
        }
        radical = Math.sqrt(sum / n.length);

        return radical;
    }
}