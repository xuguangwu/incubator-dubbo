package org.apache.dubbo.demo.consumer.spiTest;

import org.apache.dubbo.common.extension.SPI;

public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
