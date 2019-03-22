package org.apache.dubbo.demo.consumer.spiTest;

import org.apache.dubbo.common.URL;

public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }

    @Override
    public void name(URL url) {

    }
}
