package week3.encapsulation;

public class TV {

    private String brand;
    private int size;
    private String type;
    private int buyDate;
    //samd


    public TV() {
    }

    public TV(String brand, int size, String type, int buyDate) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.buyDate = buyDate;
    }

    public String getBrand() {

        return brand.toUpperCase();
    }

    public int getSize() {

        return size;
    }

    public String getType() {

        return type;
    }

    public void setBrand(String marca) {

        brand = marca;
    }

    public void setSize(int size) {
        // vrem sa actualizam/setam size-ul doar daca parametrul
        // primit este intre 20 si 5000
        if (size > 20 && size < 5000) { //20<size<5000 <- doesn't work
            this.size = size;
        } else {
            System.out.println("Invalid size");
        }
    }

    public void setType(String type) {

        this.type = type;
    }


    public void doStuff() {

    }
}
