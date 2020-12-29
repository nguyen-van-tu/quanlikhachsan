public class Hotel {
    private int num;
    private String type;
    private int price;

    public Hotel(int num, String type, int price) {
        this.num = num;
        this.type = type;
        this.price = price;
    }

    People people = new People();

    public Hotel() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice(int i) {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}


