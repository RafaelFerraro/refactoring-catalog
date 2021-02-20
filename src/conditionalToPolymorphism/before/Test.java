package conditionalToPolymorphism.before;

public class Test {
    public static void main(String[] args) {
        var brazil = new Country("Brazil");
        printCountryPopulation(brazil);

        var italy = new Country("Italy");
        printCountryPopulation(italy);

        var portugal = new Country("Portugal");
        printCountryPopulation(portugal);

        var netherlands = new Country("Netherlands");
        printCountryPopulation(netherlands);

        var france = new Country("France");
        printCountryPopulation(france);
    }

    private static void printCountryPopulation(Country country) {
        var population = new Population();

        try {
            var populationResult = population.getCountryPopulation(country);
            System.out.println("Country: " + country.getName() + " Population: " + populationResult);
        } catch (InvalidCountryError error) {
            System.out.println("Invalid country!");
        }
    }
}
