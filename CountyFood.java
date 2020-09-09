package countyfoodsproject;

class CountyFood {

//Data Fields
    private String name;
    private String state;
    private int population;
    private double moreThan1Mile;
    private double moreThan1MileForLowIncome;

//Constructor
    CountyFood(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }//end Country Food

//Methods
    public void setGroceriesAvailable(double moreThan1Mile) {
        this.moreThan1Mile = moreThan1Mile;
    }//end setGroceriesAvailable

    public void setGroceriesAvailableForLowIncome(double moreThan1MileForLowIncome) {
        this.moreThan1MileForLowIncome = moreThan1MileForLowIncome;
    }//end setGroceriesAvailableForLowIncome

    public String getName() {
        return name;
    }//end getName()

    public String getState() {
        return state;
    }//end getState()

    public int getPopulation() {
        return population;
    }//end getPopulation()

    public String ToString() {
        return "County: " + name + "       " + "State: " + state + "      "
                + "NumMore1MileAway: " + ((int) moreThan1Mile) + "        "
                + "PercentLowIncome: " + ((int) ((moreThan1Mile / moreThan1MileForLowIncome) * 100)) + "%";
    }//end ToString()

}//end class
