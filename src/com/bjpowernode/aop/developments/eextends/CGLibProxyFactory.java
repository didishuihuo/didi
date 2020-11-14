package com.bjpowernode.aop.developments.eextends;


import com.bjpowernode.aop.developments.Account;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxyFactory {
    public static <T> T createProxy(Class<T> cla,ProxyNotice proxyNotice){

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(cla);//设置代理的父类（代理的父类不就是被代理者吗）

        enhancer.setCallback(new MethodInterceptor(){
            /**
             * obj 代理对象
             * method 被代理方法
             * agruments 带来的参数
             * proxyMethod 方法代理
             */
            @Override
            public Object intercept(Object obj, Method method, Object[] agruments, MethodProxy methodProxy) throws Throwable {

                proxyNotice.before();//前置业务

                Object result = methodProxy.invokeSuper(obj, agruments);//执行被代理对象的被代理方法

                proxyNotice.after();//后置业务

                return result;
            }
        });

        return (T)enhancer.create();
    }

    public interface ProxyNotice{

        /*
         * 前置业务
         */
        public void before();

        /*
         * 后置业务
         */
        public void after();

    }


    public static void main(String[] args) {
        Account account = CGLibProxyFactory.createProxy(Account.class, new ProxyNotice() {
            @Override
            public void before() {
                System.out.println("检查身份");
                System.out.println("检查余额");
            }

            @Override
            public void after() {
                System.out.println("生成账单");
                System.out.println("发短信");
            }
        });


        account.out();


    }


}
