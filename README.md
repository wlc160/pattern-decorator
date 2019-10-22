**设计模式之装饰器模式**

**1、定义：**
指在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案（扩展原有对象的功能），属于结构型模式。

**2、应用场景：**

（1）用于扩展一个类的功能或给一个类添加附加职责；

（2）动态的给一个对象添加功能，这些功能可以再动态的撤销；

**3、装饰器模式和适配器模式的对比**
装饰者和适配器模式都是包装模式（Wrapper Pattern），装饰者也是一种特殊的代理模式。
![Image text](https://github.com/wlc160/img-folder/blob/master/decoratorandadapter.png)

**4、装饰者模式在源码中的应用**

装饰器模式在源码中也应用得非常多，在 JDK 中体现最明显的类就是 IO 相关的类，如BufferedReader、InputStream、OutputStream

看一下常用的 InputStream 的类结构图：
![Image text](https://github.com/wlc160/img-folder/blob/master/ioclassdecorator.png)

在Spring中的TransactionAwareCacheDecorator类主要是用来处理事务缓存的，来看一下代码：
````
public class TransactionAwareCacheDecorator implements Cache {
    private final Cache targetCache;
    public TransactionAwareCacheDecorator(Cache targetCache) {
        Assert.notNull(targetCache, "Target Cache must not be null");
        this.targetCache = targetCache;
    }
    public Cache getTargetCache() {
        return this.targetCache;
    }
    ...
}
````
TransactionAwareCacheDecorator就是对Cache的一个包装。再来看一个MVC中的装饰者模式 HttpHeadResponseDecorator 类:
````
public class HttpHeadResponseDecorator extends ServerHttpResponseDecorator {
    public HttpHeadResponseDecorator(ServerHttpResponse delegate) {
        super(delegate);
    }
    ...
}
````
像FifoCache 先入先出算法的缓存；LruCache最近最少使用的缓存；TransactionlCache 事务相关的缓存，都是采用装饰者模式。

**5、优点**

（1）装饰者是继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象扩展功能，即插即用。

（2）通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果。

（3）装饰者完全遵守开闭原则。

**6、缺点：**

（1）会出现更多的代码，更多的类，增加程序复杂性。

（2）动态装饰时，多层装饰时会更复杂。