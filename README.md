# lingfeng-dubbo-consumer-springboot
dubbo消费者服务搭建--springboot配置方式
1、先启动dubbo提供者服务：lingfeng-dubbo-provider-springboot，消费者配置文件中的zookeeper地址跟提供者的地址保持一致
2、启动DubboConsumerApplication中的main方法，启动成功后
   调用dubbo接口(localhost:8083/user/consumer/controller/username)，
   能正常调用接口并返回期望值即调用成功