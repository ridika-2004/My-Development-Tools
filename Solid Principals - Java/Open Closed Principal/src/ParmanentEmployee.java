public class ParmanentEmployee extends Employee{
    public ParmanentEmployee(int transportAllowance) {
        super(transportAllowance);
    }

    @Override
    public int calculateSalary(int basic, int phr, int hw) {
        return basic+(basic/4)+transportAllowance;
    }

    @Override
    public int calculateBonus(int basic) {
        return basic/2;
    }
}
