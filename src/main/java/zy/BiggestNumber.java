package zy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author Tesla.Z
 * @version 10.0
 * Created by Tesla.Z on 2020/9/2
 */

public class BiggestNumber {

    private static String ZERO = "0";


    public String largestNumber(int[] nums) {
        String[] list = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            list[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if(list[0].charAt(0) == '0'){
            return ZERO;
        }else {
            StringBuilder sb = new StringBuilder();
            for(int i =0;i<nums.length;i++){
                sb.append(list[i]);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        int n = Integer.valueOf(str);
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = buf.readLine();
        }
        String result = Arrays.stream(array).parallel().sorted((String s1, String s2) -> (s2 + s1).compareTo(s1 + s2)).collect(Collectors.joining());
        System.out.println(result);
    }
}
