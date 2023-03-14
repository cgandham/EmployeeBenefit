package pay.employee.app.choosebenefit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import pay.employee.app.choosebenefit.utils.Enums;

@Entity
public class Dependent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;
    private String name;
    private Enums.DependentType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enums.DependentType getType() {
        return type;
    }

    public void setType(Enums.DependentType type) {
        this.type = type;
    }
}
