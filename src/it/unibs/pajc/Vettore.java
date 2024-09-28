package it.unibs.pajc;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Vettore {
    private int nel;
    private double values[];

    public Vettore(int nel) {
        this.nel = nel;
        this.values = new double[nel];
    }

    public Vettore faiPerTutti(UnaryOperator<Double> op) {
        for (int i = 0;i < nel;i++) {
            values[i] = op.apply(values[i]);
        }
        return this;
    }

    public Vettore zeros(){
        Arrays.fill(values, 0);
        return this;
    }

    public Vettore ones(){
        Arrays.fill(values, 1);
        return this;
    }

    public Vettore add(double a) {
        return faiPerTutti((v) -> v + a);
    }

    @Override
    public String toString() {
        return "Vettore [values=" + Arrays.toString(values) + "]";
    }
    
}
