import java.lang.Math;
public class Laplace {
    private double epsilon;
    public boolean TEST;
    public Laplace(double epsilon) {
        this.epsilon = epsilon;
    }
    public double genNoise(int sensitivityQuery, double epsilonConsum) {
        double noise = Math.random() - 0.5;
        noise = - (sensitivityQuery / epsilonConsum) * Math.log(1 - 2 * Math.abs(noise));
        if (this.epsilon <= 0 && TEST == false) {
            return 0;
        }
        this.epsilon -= epsilonConsum;
        return noise;
    }
}