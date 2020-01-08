package cc.fyp.toy.top.export;

import java.util.HashMap;
import java.util.Map;

/**
 * @author von
 * @description:
 * @date 2019-08-1215:12
 */
public class ExportAreaCount {


    private static final Map<String,Object> areaMap;

    static {
        areaMap = new HashMap<>();
        areaMap.put("浙江省","东区");
        areaMap.put("山东省","东区");
        areaMap.put("河南省","东区");
        areaMap.put("江苏省","东区");
        areaMap.put("安徽省","东区");
        areaMap.put("上海市","东区");

        areaMap.put("湖南省","南区");
        areaMap.put("重庆市","南区");
        areaMap.put("广东省","南区");
        areaMap.put("江西省","南区");
        areaMap.put("四川省","南区");
        areaMap.put("湖北省","南区");
        areaMap.put("云南省","南区");
        areaMap.put("福建省","南区");
        areaMap.put("海南省","南区");
        areaMap.put("贵州省","南区");
        areaMap.put("广西壮族自治区","南区");

        areaMap.put("山西省","西区");
        areaMap.put("陕西省","西区");
        areaMap.put("甘肃省","西区");
        areaMap.put("新疆维吾尔自治区","西区");
        areaMap.put("青海省","西区");
        areaMap.put("宁夏回族自治区","西区");

        areaMap.put("吉林省","北区");
        areaMap.put("黑龙江省","北区");
        areaMap.put("内蒙古自治区","北区");
        areaMap.put("河北省","北区");
        areaMap.put("辽宁省","北区");
        areaMap.put("北京市","北区");
        areaMap.put("天津市","北区");

    }


    public static void main(String[] args) {


        System.out.println("");

    }

}
