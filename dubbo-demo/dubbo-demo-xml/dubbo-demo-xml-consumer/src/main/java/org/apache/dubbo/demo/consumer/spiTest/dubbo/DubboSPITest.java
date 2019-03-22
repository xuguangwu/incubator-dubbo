package org.apache.dubbo.demo.consumer.spiTest.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.demo.consumer.spiTest.Robot;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DubboSPITest {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();

        Map<String,String> map = new HashMap<>();
        URL url = new URL("","",1,map);
        Robot robot = extensionLoader.getExtension("optimusPrime");
        robot.name(url);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
