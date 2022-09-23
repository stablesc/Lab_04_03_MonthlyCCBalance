public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double interestRate = .17;
        double monthOneInterest = initialBalance * interestRate;
        double monthTwoBalance = initialBalance + monthOneInterest;
        double monthTwoInterest = monthTwoBalance * interestRate;

        {
            System.out.println("With an initial balance of $" + initialBalance + ", and an interest rate of " + interestRate
                    + ", the interest due after 1 month with no payments made would be $" + monthOneInterest + ".");
        }
        {
                System.out.println("The interest due after two months with no payments would be $" + monthTwoInterest + ".");

        }

    }
}