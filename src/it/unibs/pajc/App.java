package it.unibs.pajc;
public class App {
    public static void main(String[] args) throws Exception {
        Vettore v = new Vettore(3);
        System.out.println(v.zeros());
        System.out.println(v.ones());
        System.out.println(v.add(2.5));
    }
}
