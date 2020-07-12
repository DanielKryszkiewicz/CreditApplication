package creditapp.core;

public class CreditApplicationService {
    String getDecision(Person person){
        PersonScoringCalculator scoringCalculator = new PersonScoringCalculator();
        String decision = scoringCalculator.calculate(person)   <300 ? "Decision is negative" : "Decision is positive";
        return decision;

    }
}
