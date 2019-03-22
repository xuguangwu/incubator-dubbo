package org.apache.dubbo.demo.consumer.spiTest;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }

    @Override
    public void name(URL url) {

    }
}
