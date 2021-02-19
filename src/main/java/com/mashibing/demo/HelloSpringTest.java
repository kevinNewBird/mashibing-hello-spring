package com.mashibing.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

/***********************
 * @Description: TODO 类描述<BR>
 * @author: zhao.song
 * @since: 2021/2/19 17:27
 * @version: 1.0
 ***********************/
public class HelloSpringTest {

    public static void main(String[] args) {

//        Driver d = new Driver();
//        Optional.of("测试").ifPresent(System.out::println);

        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Driver driver = context.getBean("driver", Driver.class);
        System.out.println(driver);
        System.out.println(context.getBean("tank", Tank.class).driver);
    }
}
