package conditionalToPolymorphism.before;

public class Population {
    public Integer getCountryPopulation(Country country) throws InvalidCountryError {
        if (country.getName() == "Brazil") {
            return 211000000;
        } else if (country.getName() == "Portugal") {
            return 11000000;
        } else if (country.getName() == "Italy") {
            return 61000000;
        } else if (country.getName() == "Netherlands") {
            return 18000000;
        } else throw new InvalidCountryError("Message");
    }
}