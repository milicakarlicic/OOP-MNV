package zadatak02;

import java.util.Comparator;

public class Tacka {
    private double x;
    private double y;

    public Tacka() {
        this(0, 0);
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static class PorediPrvoPoX implements Comparator<Tacka> {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return Double.compare(o1.x, o2.x) == 0 ?
                    Double.compare(o1.y, o2.y) : Double.compare(o1.x, o2.x);
        }
    }

    public static class PorediPrvoPoY implements Comparator<Tacka> {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return Double.compare(o1.y, o2.y) == 0 ?
                    Double.compare(o1.x, o2.x) : Double.compare(o1.y, o2.y);
        }
    }
}
