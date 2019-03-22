package org.apache.dubbo.demo.consumer.spiTest;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Robot {

    void sayHello();

    @Adaptive("protocol")
    void name(URL url);
}
