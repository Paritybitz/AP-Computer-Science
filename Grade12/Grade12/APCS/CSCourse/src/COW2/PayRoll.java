package COW2;

public class PayRoll {
    public double getBonus(double sales) {
        if (sales > 300000)
            return ((sales - 300000) * 0.1);
        else
            return 0;
    }

    public double whatIsMyBaseSalary(String degree) {
        if (degree == "Doctorate")
            return (100000);
        if (degree == "Masters")
            return (60000);
        if (degree == "Bachelors")
            return (40000);
        if (degree == "Associates")
            return (25000);
        else
            return (15000);
    }

    public double whatIsMySalary(String degree, int yearsExperience, double sales) {
        double baseSalary = whatIsMyBaseSalary(degree);
        double bonus = getBonus(sales);

        double salary = baseSalary + bonus + (baseSalary * 0.05 * yearsExperience);

        return(salary);
    }

    public double taxAmountNoScale(double money) {
        return 0;
    }

    public double taxAmount(double money) {
        if(money >= 0 && money <= 9075)
            return(money * 0.10);
        else if(money >= 9076 && money <= 36900)
            return(((money - 9075) * 0.15)
                    + (9075 * 0.10));
        else if(money > 36900 && money <= 89350)
            return(((money - 36900) * 0.25)
                    + ((36900 - 9075) * 0.15)
                    + (9075 * 0.10));
        else if(money > 89350 && money <= 186350)
            return(((money - 89350) * 0.28)
                    + ((89350 - 36900) * 0.25)
                    + ((36900 - 9075) * 0.15)
                    + (9075 * 0.10));
        else if(money > 186350 && money <= 405100)
            return(((money - 186350) * 0.33)
                    + ((186350 - 89350)  * 0.28)
                    + ((89350 - 36900) * 0.25)
                    + ((36900 - 9075) * 0.15)
                    + (9075 * 0.10));
        else if(money > 405100 && money <= 406750)
            return(((money - 405100) * 0.35)
                    + ((405100 - 186350) * 0.33)
                    + ((186350 - 89350)  * 0.28)
                    + ((89350 - 36900) * 0.25)
                    + ((36900 - 9075) * 0.15)
                    + (9075 * 0.10));
        else
            return(((money - 406750)  * 0.396)
                    + ((406750 - 405100) * 0.35)
                    + ((405100 - 186350) * 0.33)
                    + ((186350 - 89350)  * 0.28)
                    + ((89350 - 36900) * 0.25)
                    + ((36900 - 9075) * 0.15)
                    + (9075 * 0.10));
    }

    public double whatIsMySalaryAfterTax(String degree, int yearsExperience, double sales) {
        double grossSalary = whatIsMySalary(degree, yearsExperience, sales);
        double tax = taxAmount(grossSalary);
        double netSalary = grossSalary - tax;

        return(netSalary);
    }
}