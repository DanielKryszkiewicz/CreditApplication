package creditapp.client;

import creditapp.core.Person;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public Person readInputParameters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your lastname: ");
        String lastName = scanner.next();
        System.out.println("Enter your mothers maiden name: ");
        String mothersMaidenName = scanner.next();
        System.out.println("Enter your total monthly income in PLN: ");
        double totalMonthlyIncomeInPln = scanner.nextDouble();
        System.out.println("Are you married? ");
        boolean married = scanner.nextBoolean();
        System.out.println("How many people are financialy depend on you?");
        int numOfFamilyDependants = scanner.nextInt();


        return new Person(name, lastName,mothersMaidenName,totalMonthlyIncomeInPln,married,numOfFamilyDependants);


    }

}
