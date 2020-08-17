package cc.fyp.test.stream.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Flatmap 主要用在多个集合合并处理数据，用于合并流处理
 * https://blog.csdn.net/liyantianmin/article/details/96178586
 * @author von
 * @description:
 * @date 2020/8/17 17:58
 */
public class Main {


    public static void main(String[] args) {

        Student a1 = new Student("S1",16);
        Student a2 = new Student("S2",14);
        Student a3 = new Student("S3",12);

        Student b1 = new Student("S4",11);
        Student b2 = new Student("S5",18);
        Student b3 = new Student("S7",10);


        ClassHome a = new ClassHome("a", Arrays.asList(a1,a2,a3));
        ClassHome b = new ClassHome("b", Arrays.asList(b1,b2,b3));


        School school = new School();
        school.setClassHomeList(Arrays.asList(a,b));


        //统计a班级的学生年龄

        List<Integer> collect = a.getStudentList().stream().map(Student::getAge).distinct().sorted().collect(Collectors.toList());
        System.out.println(collect);

        //FLATMAP
        List<Integer> collect1 = school.getClassHomeList().stream().flatMap(x -> x.getStudentList().stream()).map(Student::getAge).distinct().sorted().collect(Collectors.toList());
        System.out.println(collect1);

    }

}
