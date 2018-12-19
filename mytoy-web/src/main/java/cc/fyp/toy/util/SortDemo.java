package cc.fyp.toy.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

    public static void main(String[] args) {


        List<UserInfo> a = Arrays.asList(
                new UserInfo(8, 18, 180, 1800),
                new UserInfo(9, 22, 190, 2100),
                new UserInfo(0, 20, 201, 1800),
                new UserInfo(2, 22, 180, 2100),
                new UserInfo(2, 22, 175, 2500),
                new UserInfo(3, 21, 210, 2300),
                new UserInfo(5, 22, 181, 2100),
                new UserInfo(7, 22, 180, 2000),
                new UserInfo(2, 22, 180, 2600),
                new UserInfo(7, 22, 170, 2100),
                new UserInfo(8, 25, 120, 2600),
                new UserInfo(4, 21, 210, 2100),
                new UserInfo(3, 22, 180, 2700),
                new UserInfo(7, 22, 185, 2400),
                new UserInfo(7, 22, 180, 1900),
                new UserInfo(2, 26, 180, 2300)
        );


        List<UserInfo> b = a.stream().sorted(Comparator.comparing(UserInfo::getAge).reversed()
                .thenComparing(UserInfo::getSex)
                .thenComparing(Comparator.comparing(UserInfo::getHight).reversed())
                .thenComparing(UserInfo::getWight)).collect(Collectors.toList());

        System.out.println(b);

    }


}
