package alararestaurant.domain.dtos.json;

import java.io.Serializable;

public class EmployeeImportDto implements Serializable {

    private String name;
    private Integer age;
    private String position;

    public EmployeeImportDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
