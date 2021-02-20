package conditionalToPolymorphism.after;

public class Brazil extends Country {
    private Integer population;

    public Brazil() {
        this.population = 211000000;
    }

    @Override
    public Integer getPopulation() {
        return this.population;
    }

    @Override
    public String getName() {
        return "Brazil";
    }
}
