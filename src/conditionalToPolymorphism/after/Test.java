package conditionalToPolymorphism.after;

public class Test {
    public static void main(String[] args) {
        var country = buildCountry("Brazil");

        printCountryPopulation(country);
    }

    public static Country buildCountry(String countryName) {
        return new CountryFactory(countryName).create();
    }

    private static void printCountryPopulation(Country country) {
        var population = new Population();

        try {
            var populationResult = population.getCountryPopulation(country);
            System.out.println("Country: " + country.getName() + " Population: " + populationResult);
        } catch (NotImplemented error) {
            System.out.println("Invalid country!");
        }
    }
}
