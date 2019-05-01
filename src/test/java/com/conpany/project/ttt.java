package com.conpany.project;

import java.util.StringJoiner;

import org.junit.Test;

public class ttt extends Tester {

    @Test
    public void test() {
        //        HashMap<String, Object> amp = new HashMap();
        //        amp.put("name", "123");
        //        amp.put("body", "他妈四了");
        //        String content = "我今天要给${name}发一个信息,内容是${body}";
        //        System.out.println(NoticeUtil.getTempletContent(amp, content));

        //        String code = "0001,0001,";
        //        //System.out.println(code.substring(0, code.length() - 1));
        //        String[] split = code.split(",");
        //        System.out.println(split.length);
        //        for (String string : split) {
        //            System.out.println(string);
        //        }
        StringJoiner joinNames3 = new StringJoiner(",", "{", "}");
        joinNames3.add("gg");
        joinNames3.add("vv");
        joinNames3.add("cc");
        joinNames3.add("mm");
        joinNames3.add("mmm");
        System.out.println(joinNames3.toString());

    }

}
