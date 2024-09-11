package Task1;

public class HotDrinks  extends  Product{
    private int volume;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Горячий напиток: " + getName() + ", Цена: " + getPrice() + ", Температура: " + temperature + ", Объем: " + volume;
    }

    public HotDrinks(String name, Integer price, int volume, int temperature) {
        super(name, price);

        this.temperature = temperature;
        this.volume = volume;
    }
}
