package creditapp;

import creditapp.client.ConsoleReader;
import creditapp.core.Person;

public class Main {

    public static void main(String[] args){

        Person person = new ConsoleReader().readInputParameters();

        System.out.println("Hello, "+ person.getName() + " "+person.getLastName()+" !");
    }
}
