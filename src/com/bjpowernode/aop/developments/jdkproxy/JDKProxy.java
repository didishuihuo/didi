package com.bjpowernode.aop.developments.jdkproxy;

import com.bjpowernode.aop.developments.Account;
import com.bjpowernode.aop.developments.IAccount;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy {

    public static <T> T createProxy(Class<?> interfaceClass,Class<T> targetClass,ProxyNotice proxyNotice){


        return (T) java.lang.reflect.Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), new Class[]{interfaceClass} ,

                new InvocationHandler() {
                    /*
                     * proxy 代理对象
                     * method 代理方法(和被代理方法一样，肯定是同一个方法)
                     * args 代理方法带来的参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        T obj = targetClass.newInstance();

                        proxyNotice.before();//前置业务

                        obj = (T)method.invoke(obj, args);//执行被代理对象的被代理方法

                        proxyNotice.after();//后置业务

                        return obj;
                    }
                }
        );
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
        IAccount account = JDKProxy.createProxy(IAccount.class, Account.class, new ProxyNotice() {
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
