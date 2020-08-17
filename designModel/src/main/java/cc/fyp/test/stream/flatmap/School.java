package cc.fyp.test.stream.flatmap;

import lombok.Data;

import java.util.List;

/**
 * @author von
 * @description:
 * @date 2020/8/17 18:01
 */
public class School {

    List<ClassHome> classHomeList;

    public List<ClassHome> getClassHomeList() {
        return classHomeList;
    }

    public void setClassHomeList(List<ClassHome> classHomeList) {
        this.classHomeList = classHomeList;
    }
}
