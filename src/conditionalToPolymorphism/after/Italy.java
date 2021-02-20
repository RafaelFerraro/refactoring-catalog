package conditionalToPolymorphism.after;

public class Italy extends Country {
    private Integer population;

    public Italy() {
        this.population = 61000000;
    }

    @Override
    public Integer getPopulation() {
        return this.population;
    }

    @Override
    public String getName() {
        return "Italy";
    }
}
