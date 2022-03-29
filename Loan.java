import java.util.Scanner;

public class Loanlab3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Loan loanObj = new Loan();

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double inputAIR = input.nextDouble();
        loanObj.setAnnualInterestRate(inputAIR);

        System.out.print("Enter number of years as an integer: ");
        int inputNoY = input.nextInt();
        loanObj.setNumberOfYears(inputNoY);

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double inputLA = input.nextDouble();
        loanObj.setLoanAmount(inputLA);

        System.out.println("The loan was created on " + loanObj.getLoanDate());
        System.out.format("The monthly payment is %.2f\n", + loanObj.getMonthlyPayment());
        System.out.format("The total payment is %.2f\n", + loanObj.getTotalPayment());
    }
}
