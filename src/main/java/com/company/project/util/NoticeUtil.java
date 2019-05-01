//package com.company.project.util;
//
//import java.util.HashMap;
//import java.util.Iterator;
//
//import org.apache.commons.lang3.StringUtils;
//
//import lombok.extern.slf4j.Slf4j;
//
///**
// * 消息通知工具类
// *
// * @author chenwj
// * @version $Id: NoticeUtil.java, v 0.1 2017年10月12日 下午1:55:20 Exp $
// */
//@Slf4j
//public class NoticeUtil {
//
//    /**
//     * 根据properties替换模版中${变量}生成内容
//     *
//     * @param properties
//     *            模版中需要的变量
//     * @param content
//     *            生成的内容
//     * @return
//     */
//    public static String getTempletContent(HashMap<String, Object> properties, String content) {
//        if (StringUtils.isBlank(content)) {
//            return "";
//        }
//
//        String contents = content;
//        // 替换参数
//        for (Iterator<String> iter = properties.keySet().iterator(); iter.hasNext();) {
//            String key = (String) iter.next();
//            Object value = properties.get(key);
//            contents = StringUtils.replace(contents, "${" + key + "}", String.valueOf(value));
//            contents = StringUtils.replace(contents, ":" + key, String.valueOf(value));
//
//        }
//        return contents;
//    }
//}