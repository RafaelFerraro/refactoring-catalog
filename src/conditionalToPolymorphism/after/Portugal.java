package conditionalToPolymorphism.after;

public class Portugal extends Country {
    private Integer population;

    public Portugal() {
        this.population = 11000000;
    }

    @Override
    public Integer getPopulation() {
        return this.population;
    }

    @Override
    public String getName() {
        return "Portugal";
    }
}
