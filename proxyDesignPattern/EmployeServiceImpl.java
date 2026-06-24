package proxyDesignPattern;

public class EmployeServiceImpl implements EmployeService {

    @Override
    public Employee create(String name) {
        return new Employee(name);
    }

    @Override
    public void save(Employee emp) {
        System.out.println(emp.name  + " employee saved...");
    }
}
