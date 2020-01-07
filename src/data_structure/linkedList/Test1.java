package data_structure.linkedList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Data：2019/9/28
 * Author: Steven
 */
public  class Test1 {

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    public static void main(String[] args) {
        System.out.println(replaceBlank("just\r\n   do it!"));
    }
}