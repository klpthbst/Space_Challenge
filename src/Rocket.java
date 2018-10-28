public class Rocket implements SpaceShip {

    private int cost;           // rocket cost in $mln
    private int weight;         // rocket weight
    private int maxWeight;      // weight with cargo


    public Rocket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {
        return (this.maxWeight >= getWeight() + item.getWeight());
    }

    @Override
    public final void carry(Item item) {
        setWeight(getWeight()  + item.getWeight());
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
