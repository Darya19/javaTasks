package com.javatasks.automation.collections.main;

public class SortingFilter {

    private boolean byCalories;
    private boolean byFats;
    private boolean byProteins;
    private boolean byWeight;
    private boolean byCarbohydrates;

    public void setByCalories() {
        reset();
        byCalories = true;
    }

    public void setByFats() {
        reset();
        byFats = true;
    }

    public void setByProteins() {
        reset();
        byProteins = true;
    }

    public void setByWeight() {
        reset();
        byWeight = true;
    }

    public void setByCarbohydrates() {
        reset();
        byCarbohydrates = true;
    }

    public boolean isByCalories() {
        return byCalories;
    }

    public boolean isByFats() {
        return byFats;
    }

    public boolean isByProteins() {
        return byProteins;
    }

    public boolean isByWeight() {
        return byWeight;
    }

    public boolean isByCarbohydrates() {
        return byCarbohydrates;
    }

    private void reset() {
        byCalories = false;
        byFats = false;
        byProteins = false;
        byWeight = false;
        byCarbohydrates = false;
    }
}
