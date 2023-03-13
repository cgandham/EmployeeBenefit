package pay.employee.app.choosebenefit.model;

public class Paycheck {
    User user;
    Double deductionPerPaycheck;
    Double costPaidAfterDeduction;
    Double deductionPerYear;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getDeductionPerPaycheck() {
        return deductionPerPaycheck;
    }

    public void setDeductionPerPaycheck(Double deductionPerPaycheck) {
        this.deductionPerPaycheck = deductionPerPaycheck;
    }

    public Double getDeductionPerYear() {
        return deductionPerYear;
    }

    public void setDeductionPerYear(Double deductionPerYear) {
        this.deductionPerYear = deductionPerYear;
    }

    public Double getCostPaidAfterDeduction() {
        return costPaidAfterDeduction;
    }

    public void setCostPaidAfterDeduction(Double costPaidAfterDeduction) {
        this.costPaidAfterDeduction = costPaidAfterDeduction;
    }
}
