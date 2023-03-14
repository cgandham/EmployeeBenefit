package pay.employee.app.choosebenefit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class Paycheck {
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
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
