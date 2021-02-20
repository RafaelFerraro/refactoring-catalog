package conditionalToPolymorphism.after;

public class Netherlands extends Country {
    private Integer population;

    public Netherlands() {
        this.population = 18000000;
    }

    @Override
    public Integer getPopulation() {
        return this.population;
    }

    @Override
    public String getName() {
        return "Netherlands";
    }
}
