import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
        int sensitivity = 5;
        Laplace laplace = new Laplace(0.65656);
        laplace.TEST = false;
        ArrayList<Double> generated = new ArrayList<Double>();
        for(int i = 0; i < 10; i++) {
            double noise = laplace.genNoise(sensitivity, 0.65656/5);
            generated.add(noise);
            System.out.println(noise);
        }
    }
}