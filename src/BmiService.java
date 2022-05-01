public class BmiService {
    public int calculate(int growth, int weight) {
        int bmi = weight * 10_000 / (growth * growth);
        return bmi;
    }
}
