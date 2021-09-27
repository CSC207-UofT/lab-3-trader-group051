public class Donkey implements Tradable, Domesticatable{
    @Override
    public String sound() {
        return "MOO";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
