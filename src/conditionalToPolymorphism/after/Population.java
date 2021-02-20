package conditionalToPolymorphism.after;

public class Population {
    public Integer getCountryPopulation(Country country) throws NotImplemented {
        return country.getPopulation();
    }
}
