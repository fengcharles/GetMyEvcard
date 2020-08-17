package cc.fyp.test.stream.flatmap;

import lombok.Data;

/**
 * @author von
 * @description:
 * @date 2020/8/17 17:57
 */
@Data
public class Student {

    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}
