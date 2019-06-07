package cc.fyp.toy.util;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created  2019/1/28.
 */
public class CashTest {

    //5险1金
    public static final float bx = 1288.15f;
    //专项扣除
    public static final float zx = 2000;
    //起
    public static final int begin = 5000;
    //月（年终分开的话，写13）
    public static final int monthCount = 12;

    //年入（睡后）
    public static float restAll=0f;

    public static final Map<Integer, Float> map = new HashMap<>();



    static {
        //表示1月
        map.put(1, 1000f);
        map.put(2, 100f);

        //99表示其他月
        map.put(99, 1000f);
    }






    public static void cacl() {
        double monthOut = 0d;
        float outTotal = 0f;
        float yearBefore;
        float yearTotal = 0f;

        for (int i = 0; i < monthCount; i++) {
            float in;
            int month = i + 1;
            if (map.containsKey(month)) {
                in = map.get(month) + 0;
            } else {
                in = map.get(99);
            }
            yearTotal += in;
            yearBefore = yearTotal - (bx + zx + begin) * month;
            monthOut = getOut(in, month, monthOut, outTotal, yearBefore);
            outTotal += monthOut;
        }
        System.out.println("年税:" + outTotal);
        System.out.println("年睡后:" + restAll);
    }



    private static double getOut(double monthIn, int month, double monthOut, float outTotal, float yearShould) {
        float p;

        if (yearShould <= 36000) {
            monthOut = yearShould * 0.03 - 0 - outTotal;
            p=0.03f;
        } else if (yearShould > 36000 && yearShould <= 144000) {
            monthOut = yearShould * 0.1 - 2520 - outTotal;
            p=0.1f;
        } else if (yearShould > 144000 && yearShould <= 300000) {
            monthOut = yearShould * 0.2 - 16920 - outTotal;
            p=0.2f;
        } else if (yearShould > 300000 && yearShould <= 420000) {
            monthOut = yearShould * 0.25 - 31920 - outTotal;
            p=0.25f;
        }else {
            p=0.3f;
        }
        double rest = monthIn - monthOut - bx;

        String outFormat = new DecimalFormat("0.00").format(monthOut);
        String restFormat = new DecimalFormat("0.00").format(rest);
        restAll +=rest;
        System.out.println("年额："+yearShould+","+month + "月:" + monthIn + ",比例:" + p*100 + "%,出:" + outFormat + ",剩:" + restFormat);
        //System.out.println(month + "月:" + monthIn + ",比例:" + p*100 + "%,税:" + outFormat + ",睡后:" + restFormat);
        return monthOut;
    }


    public static void main(String[] args) {

        Map h = new Hashtable();
        Map map = new HashMap();
    }
}

