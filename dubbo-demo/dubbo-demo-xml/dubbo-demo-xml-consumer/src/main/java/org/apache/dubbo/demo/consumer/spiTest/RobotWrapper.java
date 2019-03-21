package org.apache.dubbo.demo.consumer.spiTest;

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

}
