package creditapp.core;

import creditapp.client.ConsoleReader;

public class Person {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private final double totalMonthlyIncomeInPln;
    private final boolean married;
    private final int numOfFamilyDependants;

    public Person(String name, String lastName, String mothersMaidenName, double totalMonthlyIncomeInPln, boolean married,int numOfFamilyDependants ){
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.married = married;
        this.numOfFamilyDependants = numOfFamilyDependants;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public void setTotalMonthlyIncomeInPln(double totalMonthlyIncomeInPln) {
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumOfFamilyDependants() {
        return numOfFamilyDependants;
    }

    public void setNumOfFamilyDependants(int numOfFamilyDependants) {
        this.numOfFamilyDependants = numOfFamilyDependants;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

}
