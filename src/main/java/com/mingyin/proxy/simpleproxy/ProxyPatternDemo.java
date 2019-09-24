package com.mingyin.proxy.simpleproxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Subject proxy = new Proxy(subject);
        proxy.request();
    }

    public interface Subject {

        void request();

    }

    public static class ConcreteSubject implements Subject {

        public void request() {
            System.out.println("ִ������");
        }

    }

    public static class Proxy implements Subject {

        private Subject subject;

        public Proxy(Subject subject) {
            this.subject = subject;
        }

        public void request() {
            System.out.println("ִ�ж���������жϣ������Ƿ�Ҫ����subject��request()����");
            boolean invoke = true;
            if(invoke) {
                subject.request();
            }
        }

    }

}
