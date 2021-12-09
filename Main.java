public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        UseCase3 empWageBuilder = new UseCase3();
        int totalEmpWage = empWageBuilder.computeWage();
        System.out.println("Total Emp Wage for company is " + totalEmpWage);

    }
}
