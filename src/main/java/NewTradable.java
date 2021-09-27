class NewTradable implements Domesticatable, Tradable {
    public NewTradable(){}

    @Override
    public String sound() {
        return "Yeehaw";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}