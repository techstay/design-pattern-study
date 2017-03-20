package yitian.study;


import yitian.study.abstractfactory.AbstractFactorySample;
import yitian.study.builder.BuilderSample;
import yitian.study.factory.FactorySample;
import yitian.study.prototype.PrototypeSample;

public class Application {
    public static void main(String[] args) {
        System.out.println("23种设计模式");
        System.out.println("工厂模式");
        Sample factorySample = new FactorySample();
        factorySample.run();

        System.out.println("抽象工厂模式");
        Sample abstractFactorySample = new AbstractFactorySample();
        abstractFactorySample.run();

        System.out.println("建造者模式");
        Sample builderSample = new BuilderSample();
        builderSample.run();

        System.out.println("原型模式");
        Sample prototypeSample = new PrototypeSample();
        prototypeSample.run();
    }
}
