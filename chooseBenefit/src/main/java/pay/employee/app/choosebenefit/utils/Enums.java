package pay.employee.app.choosebenefit.utils;

public class Enums {
    public enum UserRole
    {
        Employee,
        Dependent,
        Admin
    }

    public enum DependentType
    {
        Spouse,
        Child
    }

    public enum DeductionType
    {
        DeductionPerYear,
        DeductionPerDependent,
        DiscountByName
    }
}
