package by.class9;

public class Auto {
    private int id;
    private String brand;
    private int probeg;
    private int year;
    private int speed;
    private int price;

    public Auto(int price, int speed, int year, int probeg, String brand, int id) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.probeg = probeg;
        this.brand = brand;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", probeg=" + probeg +
                ", year=" + year +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
