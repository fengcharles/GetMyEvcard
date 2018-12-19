package cc.fyp.toy.util;

public class UserInfo {

    private  Integer age;

    private  Integer sex;

    private  Integer hight;

    private  Integer wight;


    @Override
    public String toString() {
        return "UserInfo{" +
                "age=" + age +
                ", sex=" + sex +
                ", hight=" + hight +
                ", wight=" + wight +
                '}';
    }

    UserInfo(Integer age, Integer sex, Integer hight, Integer wight){
        this.age = age;
        this.sex = sex;
        this.hight = hight;
        this.wight = wight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }

    public Integer getWight() {
        return wight;
    }

    public void setWight(Integer wight) {
        this.wight = wight;
    }
}
