package org.apache.dubbo.demo.consumer.spiTest.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.consumer.spiTest.Robot;

public class RobotWrapper2 implements Robot {

    private final Robot robot;
    private Integer age;

    public RobotWrapper2(Robot robot) {
        this.robot = robot;
    }

    public RobotWrapper2(Robot robot, Integer age) {
        this.robot = robot;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am RobotWrapper2.");
        robot.sayHello();
    }

    @Override
    public void name(URL url) {

    }
}
