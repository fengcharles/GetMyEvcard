package cc.fyp.toy.service.evcard.dto;

public class AreaResq {

    private Integer id;

    private String name;

    @Override
    public String toString() {
        return "AreaResq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
