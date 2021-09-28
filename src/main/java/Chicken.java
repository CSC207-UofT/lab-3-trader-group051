public class Chicken implements Domesticatable, Tradable{

    private int eggsLaid;

    public Chicken() {
        this.eggsLaid = 0;
    }

    @Override
    public String sound() {
        return "Buk buk bukoa buk!";
    }

    public void layAnEgg() {
        this.eggsLaid + 1;
    }

    public void eggStolen() {
        this.eggsLaid - 1;
    }

    public int getEggsLaid() {
        return this.eggsLaid;
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Eggs Laid: " + this.eggsLaid +")";
    }
}