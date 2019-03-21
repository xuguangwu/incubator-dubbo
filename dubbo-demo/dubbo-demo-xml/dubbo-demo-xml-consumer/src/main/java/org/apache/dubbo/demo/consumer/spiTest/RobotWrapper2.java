package org.apache.dubbo.demo.consumer.spiTest;

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

}
