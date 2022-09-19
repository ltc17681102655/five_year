![img.png](img.png)

我们可以看到AnnotationConfigApplicationContext最上面有两个顶级接口：

BeanFactory: Spring的核心接口，纯粹的bean容器，主要定义了与Bean的相关方法
ResourceLoader：资源加载器，定义了getResource方法
继承自三个父类：

DefaultResourceLoader: 默认的资源加载器，实现了三种加载资源的方式

通过path加载资源

通过classpath加载资源

通过URL加载资源

AbstractApplicationContext: 实现了ApplicationContext接口的抽象类，主要功能

实现了启动IOC容器的核心方法：refresh()

发布事件

大量getBean相关的操作, 主要通过抽象方法getBeanFactory基于子类实现

大量留于子类扩展的空方法

消息国际化

GenericApplicationContext:

使用组合的方式引进了最底层的BeanFactory实现类：DefaultListableBeanFactory

定义了registerBean的相关操作，其实是通过DefaultListableBeanFactory实现的

不难发现，ApplicationContext名副其实，确实就是一个应用上下文，对于bean的相关操作，容器的管理，依旧是由我们的BeanFactory进行实现。