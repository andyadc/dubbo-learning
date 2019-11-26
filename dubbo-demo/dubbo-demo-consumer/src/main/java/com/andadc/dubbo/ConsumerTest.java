package com.andadc.dubbo;

import com.andyadc.dubbo.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author andy.an
 * @since 2018/11/14
 */
public class ConsumerTest {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        context.start();

        EchoService echoService = (EchoService) context.getBean("echoService");

        for (int i = 0; i < 100; i++) {
            System.out.println(echoService.echo("num=" + i));

            Thread.sleep(1000);
        }
    }
}
