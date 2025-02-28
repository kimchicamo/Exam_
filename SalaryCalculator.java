
/**
 * Write a description of class SalaryCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SalaryCalculator
{
    public void getSalary(int hours,double wage){
        double totalSalary = hours * wage;
        double deductions = totalSalary * 0.3;
        double netPay = totalSalary - deductions;
        System.out.println("netPay" + netPay + "$");
    }
    
    
}
