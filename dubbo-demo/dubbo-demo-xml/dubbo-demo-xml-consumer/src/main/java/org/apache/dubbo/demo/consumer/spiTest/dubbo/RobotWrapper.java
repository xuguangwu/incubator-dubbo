package org.apache.dubbo.demo.consumer.spiTest.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.consumer.spiTest.Robot;

public class RobotWrapper implements Robot {

    private final Robot robot;

    public RobotWrapper(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am RobotWrapper.");
        robot.sayHello();
    }

    @Override
    public void name(URL url) {

    }
}
