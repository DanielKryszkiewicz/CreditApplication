package creditapp;

import creditapp.client.ConsoleReader;
import creditapp.core.CreditApplicationService;
import creditapp.core.Person;

public class Main {

    public static void main(String[] args){

        Person person = new ConsoleReader().readInputParameters();
        CreditApplicationService service = new CreditApplicationService();

        String decision = service.getDecision(person);

        System.out.println("Hello, "+ person.getName() + " "+person.getLastName()+" !");
        System.out.println(decision);



    }
}
