public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 175; //В сантиметрах, целое число//
        int weight = 60; //В килограммах, целое число//
        int bmi = service.calculate(growth, weight);
        System.out.println(bmi);
    }
}
