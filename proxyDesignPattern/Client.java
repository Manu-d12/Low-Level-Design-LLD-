package proxyDesignPattern;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        EmployeService realObject = new EmployeServiceImpl();

        EmployeService proxyObject = (EmployeService) Proxy.newProxyInstance (
            EmployeService.class.getClassLoader(), 
            new Class[] {EmployeService.class}, 
            new EmployeeServiceProxy(realObject)
        );

        Employee emp = proxyObject.create("Diksha Dhiman");
        proxyObject.save(emp);

    }
}
