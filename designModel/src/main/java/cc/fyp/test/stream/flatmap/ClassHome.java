package cc.fyp.test.stream.flatmap;

import lombok.Data;

import java.util.List;

/**
 * @author von
 * @description:
 * @date 2020/8/17 17:56
 */
public class ClassHome {

    private String className;

    private List<Student> studentList;

    public ClassHome(String className, List<Student> studentList) {
        this.className = className;
        this.studentList = studentList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
