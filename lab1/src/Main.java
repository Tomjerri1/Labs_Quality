public class Main {
    public static void main(String[] args) {
        try {
            BodyMassIndex bodyMassIndex = new BodyMassIndex(80, 1.52);
            System.out.println("BMI: " + String.format("%.2f", bodyMassIndex.getBMI()));
            System.out.println("Result: " + bodyMassIndex.getResult());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}