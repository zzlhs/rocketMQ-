package org.apache.rocketmq.remoting.netty;

/**
 * 填写具体类的描述
 *
 * @author: Brule.Zheng
 * @since: 2021-10-02 22:15
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println("123");

//        final String protocol = System.getProperty(SERIALIZE_TYPE_PROPERTY, System.getenv(SERIALIZE_TYPE_ENV));
//        System.set
        System.out.println(System.getenv("ROCKETMQ_SERIALIZE_TYPE"));
        System.setProperty("zyf", "zhengyuanfeng");
        System.out.println(System.getProperty("zyf"));
        System.out.println(System.getProperty("zyf1", "default"));

        int clientCallbackExecutorThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(" clientCallbackExecutorThreads = " + clientCallbackExecutorThreads);


    }
}
