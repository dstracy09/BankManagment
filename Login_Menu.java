           //////Login Menu Class for Bank Management Application project//////

import java.util.Scanner;
//Creates main Login_Menu class
public class Login_Menu {
    int AcctId;
    String AcctName;
    int AcctBal;
    //Creates Login method with switch cases
    public void Login() {
        int option = 0;

        //Creates "Customer" constructor
        Customer One = new Customer(AcctId, AcctName, AcctBal);

        //Creates manual input for user
        Scanner input = new Scanner(System.in);

        //Sets object Account Balance to 0
        One.setAcctBal(0);

        //Creates Prompt for user
        System.out.println();
        System.out.println("--------------------");
        System.out.println("<Welcome to BankOne>");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Please enter your new account information!");
        System.out.println();
        System.out.println("Enter login name: ");

        //User creates login name
        One.setAcctName(input.nextLine());
        System.out.println("Enter account number: ");

        //User creates Account ID
        One.setAcctId(input.nextInt());
        System.out.println();
        System.out.println("Welcome to BankOne "+One.getAcctName()+"!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        //Creates "do-while" loop with "switch" statement to filter through options
        do {

            System.out.println("How can we help you: ");
            System.out.println("1: Show account info");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println();
            System.out.println("Enter here:");

            //User inputs option prompted
            option = input.nextInt();

            switch (option) {

                //Creates option to acquire Account name, Account ID, and Account Balance
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Account Name: " + One.getAcctName());
                    System.out.println("Account ID: " + One.getAcctId());
                    System.out.println("Account Balance: $" + One.getAcctBal());
                    System.out.println("---------------------------------");
                    System.out.println();


                    break;
                case 2: //Creates option to deposit from account

                    System.out.println("How much would you like to deposit? ");

                    //Creates new object for Deposit class
                    Deposit dep = new Deposit();
                    dep.balance = One.getAcctBal();

                    //User inputs deposit amount
                    int amount = input.nextInt();

                    //Amount entered is "added to balance" object using conditional "Deposit" class
                    dep.deposit(amount);
                    One.setAcctBal(dep.balance);

                    //Shows user updated balance
                    System.out.println();
                    System.out.println("<Your new balance = $"+One.getAcctBal()+">");
                    System.out.println("---------------------------------------");
                    System.out.println();
                    break;
                case 3: //Creates option to withdraw from account

                    System.out.println("How much would you like to withdraw? ");

                    //Creates new object for Withdraw class
                    Withdraw wit = new Withdraw();
                    wit.balance = One.getAcctBal();

                    //User inputs withdraw amount
                    int amount2 = input.nextInt();

                    //Amount entered is "subtracted from balance" object using conditional "Withdraw" class
                    wit.withdraw(amount2);
                    One.setAcctBal(wit.balance);

                    //Shows user updated balance
                    System.out.println();
                    System.out.println("<Your new balance = $"+One.getAcctBal()+"");
                    System.out.println("---------------------------------------");
                    System.out.println();
                    break;

                case 4: //Creates error prompt if user inputs number not listed
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("Error: Please enter an option of 1,2,3,or 4. ");
                    break;
            }
        }
        while (option != 4); //Exits user from "do-while" loop
        System.out.println("Thank you for banking at BankOne.");
        System.out.println("Have a great day " + One.getAcctName() + "!");

    }
}





