package com.personal.demo;

/**
 * @Author Wisdom
 * @Date 2021/5/18
 */
abstract class AbstractClassA{
    public AbstractClassA() {
        System.out.println("父类无参数构造器已经实例化");
    }
    public AbstractClassA(String a) {
        System.out.println("父类有参数构造器已经实例化");
    }
    public abstract void play();
}

public class ClassB extends AbstractClassA{
    public ClassB(String a) {
        //super(a); //会默认调用父类无参数构造器
        System.out.println("子类已经实例化");
    }
    @Override
    public void play() {
        System.out.println("我实现了父类的方法");
    }
    public static void main(String[] args) {
        AbstractClassA aa=new ClassB("b");//此时，抽象类已经被实例化了
    }
}