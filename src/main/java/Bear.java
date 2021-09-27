/* A new class that implements the given interfaces.
 */
public class Bear implements Drivable, Domesticatable, Tradable{


    private int maxspeed;

    public Bear(){
        this.maxspeed = 0;
    }

    @Override
    public String sound() {
        return "rawrrr!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
