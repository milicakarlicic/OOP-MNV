package zadatak01;

public class Elipsa extends Oblik {
    private double a;
    private double b;

    public Elipsa(Tacka centar, double a, double b) {
        super(centar);
        this.a = a;
        this.b = b;
    }

    public Elipsa(Elipsa e) {
        this(e.centar, e.a, e.b);
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Elipsa sa poluosama " + a + ", " + b + " i centrom " + centar;
    }

    @Override
    public double obim() {
        // Ramanujan-ova aproksimacija
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double povrsina() {
        // r^2 * pi
        return a * b * Math.PI;
    }
}
