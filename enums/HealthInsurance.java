package enums;

public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0),
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);

    private final int maxSalary;
    private final double ratio;

    HealthInsurance (int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        if(salary <= 1000) return LEVEL_ONE;
        else if(salary <= 2000) return LEVEL_TWO;
        else if(salary <= 3000) return LEVEL_THREE;
        else if(salary <= 4000) return LEVEL_FOUR;
        else if(salary <= 5000) return LEVEL_FIVE;
        else return LEVEL_SIX;
    }
}
