package org.apache.dubbo.demo.consumer.spiTest;

import java.util.ServiceLoader;

public class JdkMain {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
