package yitian.study;


import yitian.study.factory.FactorySample;

public class Application {
    public static void main(String[] args) {
        System.out.println("23种设计模式");
        System.out.println("工厂模式");
        Sample factorySample = new FactorySample();
        factorySample.run();
    }
}
