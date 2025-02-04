public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int transportAllowance) {
        super(transportAllowance);
    }

    @Override
    public int calculateSalary(int basic, int phr, int hw) {
        return basic + (phr*hw);
    }

    @Override
    public int calculateBonus(int basic) {
        return 0;
    }
}
