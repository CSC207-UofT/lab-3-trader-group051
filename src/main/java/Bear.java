/* A new class that implements the given interfaces.
 */
public class Bear implements Drivable, Domesticatable, Tradable{

// maxspeed is an int that represent the max speed of of the Bear
    private int maxSpeed;

    public Bear(){
        this.maxSpeed = 0;
    }

    @Override
    public String sound() {
        return "rawrrr!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
