public class Main {
    public static void main(String[] args) {
        Employee parmanentEmployee = new ParmanentEmployee(5000);
        Employee contractEmployee = new ContractEmployee(3000);
        Employee parttimeEmployee = new PartTimeEmployee(1000);

        System.out.println("Parmanent employee's salary is : "+parmanentEmployee.calculateSalary(10000,500,200));
        System.out.println("Parmanent employee's bonus is : "+parmanentEmployee.calculateBonus(10000));

        System.out.println("Contract employee's salary is : "+contractEmployee.calculateSalary(7000,200,100));
        System.out.println("Contract employee's bonus is : "+contractEmployee.calculateBonus(7000));

        System.out.println("Part-time employee's salary is : "+parttimeEmployee.calculateSalary(5000,200,50));
        System.out.println("Part-time employee's bonus is : "+parttimeEmployee.calculateBonus(5000));
    }
}
