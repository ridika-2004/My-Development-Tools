public class ContractEmployee extends Employee{
    public ContractEmployee(int transportAllowance) {
        super(transportAllowance);
    }

    @Override
    public int calculateSalary(int basic, int phr, int hw) {
        return basic+ transportAllowance+ (phr*hw);
    }

    @Override
    public int calculateBonus(int basic) {
        return 5000;
    }
}
