public abstract class Employee {
    protected int transportAllowance;

    public Employee(int transportAllowance){
        this.transportAllowance = transportAllowance;
    }

    public abstract int calculateSalary(int basic, int phr, int hw);

    public abstract int calculateBonus(int basic);
}
