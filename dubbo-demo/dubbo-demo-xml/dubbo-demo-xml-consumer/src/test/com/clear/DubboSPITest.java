package com.clear;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.demo.consumer.spiTest.Robot;

public class DubboSPITest {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
