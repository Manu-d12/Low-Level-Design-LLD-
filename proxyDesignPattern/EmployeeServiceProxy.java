package proxyDesignPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeServiceProxy implements InvocationHandler{

    private Object target;

    public EmployeeServiceProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        System.out.println("Invoked Method: " + methodName);
        return method.invoke(this.target, args);
    }
    
}
