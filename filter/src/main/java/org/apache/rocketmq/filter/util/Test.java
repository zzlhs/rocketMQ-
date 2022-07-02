package org.apache.rocketmq.filter.util;

/**
 * 填写具体类的描述
 *
 * @author: Brule.Zheng
 * @since: 2021-10-18 23:05
 **/
public class Test {

    public static void main(String[] args) {
        String str = System.getProperty("23", "3");
        System.out.println(str);


        SecurityManager sm=new SecurityManager();
        System.setSecurityManager(sm);
        String str2 = System.getProperty("java.security.manager");
        System.out.println(str2);
    }
}
