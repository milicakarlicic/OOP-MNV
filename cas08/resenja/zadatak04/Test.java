package cas08.zadatak04;

public class Test {

    public static void main(String[] args) {
        Stek<Integer> s = new StekPrekoListe<>();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
