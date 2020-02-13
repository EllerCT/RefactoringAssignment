public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double calculateVeryHighInsurance(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60000;
    }
}