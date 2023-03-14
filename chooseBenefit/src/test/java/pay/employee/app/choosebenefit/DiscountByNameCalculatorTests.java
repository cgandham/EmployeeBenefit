package pay.employee.app.choosebenefit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pay.employee.app.choosebenefit.Service.IDiscountCalculator;
import pay.employee.app.choosebenefit.utils.Enums;
import org.junit.jupiter.api.Assertions;



@SpringBootTest
public class DiscountByNameCalculatorTests {
    @Autowired
    private IDiscountCalculator _discountCalculator;
    @BeforeEach
    void setUp() {
    }
    @Test
    void Test_Employee_Discount_Cost() {

        Double empDeductionCost = _discountCalculator.getDiscountedDeductionCost(Enums.UserRole.Employee);
        Assertions.assertEquals(100.0, empDeductionCost);
    }
}
