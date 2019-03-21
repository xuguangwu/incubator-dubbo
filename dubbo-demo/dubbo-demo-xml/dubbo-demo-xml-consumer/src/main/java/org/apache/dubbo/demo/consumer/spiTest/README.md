dubbo增强版SPI与JDK的SPI在文件上的区别

1. 接口上需要添加@SPI注解
2. SPI文件中需要加上
optimusPrime = org.apache.dubbo.demo.consumer.spiTest.OptimusPrime，
否则会抛异常
3. 如果实现类中有以该接口为参数的构造方法，则在该接口其他实现类之前会首先调用wrapper类中的方法。
4. wrapper类，(越往后越靠前执行--需要验证)，相当于实现了动态代理

