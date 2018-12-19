package cc.fyp.toy.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SignUtil {

    private static List<String> list;

    static {
       list = Arrays.asList("1543991412212", "evcardapp", "cjrte4", "06290c4e-c6f2-4f93-9308-375d48a4ef5e_0_3557337","getUserDetailInfo");
    }

    public static final String RESULT = "78E42379C8F0D3028CE203C58BD00821";


    public static int count=0;

    public static void swap(String str[],int i,int j){
        String temp=new String();
        temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
    public static void allPermutate(String str[],int k,int length){
        if(k==length-1){
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<length;i++){
                sb.append(str[i]);
                if (i!=length-1){
                    sb.append("-");
                }
            }
            String strs = DigestUtils.md5Hex(sb.toString());
            System.out.println(sb.toString()+">>>>>>>>>>>>>>>>>>>>>>"+strs);
            if (strs.equalsIgnoreCase(RESULT)){
                System.out.println("*******************************************************************************************************************");
            }
            count++;
        }else{
            for(int i=k;i<length;i++){
                swap(str,k,i);
                allPermutate(str, k+1, length);
                swap(str,k,i);
            }
        }
    }

}
