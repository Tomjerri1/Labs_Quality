/**
 * A class for calculating and interpreting Body Mass Index (BMI)
 */
class BodyMassIndex {
    private double weight; // Weight in kilograms
    private double height; // Height in meters
    private double bmi; // Calculated BMI value

    // Constants for BMI cut-off values
    private static final double UNDERWEIGHT_LIMIT = 18.5;
    private static final double NORMAL_LIMIT = 25;
    private static final double OVERWEIGHT_LIMIT = 30;

    /**
     * Class constructor
     *
     * @param weight Weight in kilograms
     * @param height Height in meters
     * @throws IllegalArgumentException if weight or height values are invalid
     */
    public BodyMassIndex(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive.");
        }
        this.weight = weight;
        this.height = height;
        recalculateBMI();
    }

    /**
     * Calculates BMI values
     */
    public void recalculateBMI() {
        this.bmi = weight / (height * height);
    }

    /**
     * Gets the current weight value
     *
     * @return Weight in kilograms
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets a new weight value
     *
     * @param weight New weight in kilograms
     * @throws IllegalArgumentException if the weight value is invalid
     */
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;
        recalculateBMI();
    }

    /**
     * Gets the current height value
     *
     * @return Height in meters
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets a new height value
     *
     * @param height New height in meters
     * @throws IllegalArgumentException if height value is invalid
     */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
        recalculateBMI();
    }

    /**
     * Gets the current BMI value
     *
     * @return BMI value
     */
    public double getBMI() {
        return bmi;
    }

    /**
     * Gets a textual interpretation of BMI
     *
     * @return Textual interpretation of BMI
     */
    public String getResult() {
        if (bmi < UNDERWEIGHT_LIMIT) {
            return "Deficit";
        } else if (bmi < NORMAL_LIMIT) {
            return "Normal";
        } else if (bmi < OVERWEIGHT_LIMIT) {
            return "Warning!";
        } else {
            return "Obesity";
        }
    }
}
