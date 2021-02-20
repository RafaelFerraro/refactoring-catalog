package conditionalToPolymorphism.after;

import java.util.HashMap;

public class CountryFactory {
    private String countryName;

    public CountryFactory(String countryName) {
        this.countryName = countryName;
    }

    public Country create() {
        var countries = new HashMap<String, Country>();
        countries.put("Brazil", new Brazil());
        countries.put("Italy", new Italy());
        countries.put("Portugal", new Portugal());
        countries.put("Netherlands", new Netherlands());

        return countries.get(this.countryName);
    }
}
