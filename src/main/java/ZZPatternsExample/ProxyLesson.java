package ZZPatternsExample;
// proxy — «представник, уповноважений») — сервер (комп'ютерна система або програма) в комп'ютерних мережах,
// що дозволяє клієнтам виконувати непрямі (через посередництво проксі-сервера) запити до мережевих сервісів
// наприклад це потрібно для прикриття ip-адреси клієнта
public class ProxyLesson {
    public static void main(String[] args) {
        Car proxyReno = new ProxyReno();
        proxyReno.drive();
    }
}
interface Car {
    void drive();
}

class ProxyReno implements Car{ // ми між інтерфейсом і його реалізацією додаємо код, для додавання якоїсь додаткової інформації
                                // такий підхід називається проксі
Car carReno = new Reno();
    @Override
    public void drive() {
        System.out.println("Drive ProxyReno");
        carReno.drive();
    }
}
class Reno implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Reno");
    }
}

