package aula05;

class Property {
    private int id;
    private int rooms;
    private String place;
    private int price;
    private boolean available;
    private DateYMD initialDate;
    private DateYMD finalDate;
    private static int currentId = 1000;

    public Property(int rooms, String place, int price) {
        Property.currentId++;
        this.rooms = rooms;
        this.place = place;
        this.price = price;
        this.available = true;
        this.initialDate = null;
        this.finalDate = null;
    }

    public int getId() {
        return id;
    }

    public int getRooms() {
        return rooms;
    }

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static void setCurrentId(int currentId) {
        Property.currentId = currentId;
    }

    public void setinitialDate(DateYMD initialDate) {
        this.initialDate= initialDate;
    }

    public void setFinalDate(DateYMD finalDate) {
        this.finalDate = finalDate;
    }

    public String toString() {
        String available;

        if (this.available) {
            available = "sim";

        } else {
            available = "não";
        }
        String dates;

        if (this.initialDate == null || this.available) {
            dates = "";

        } else {
            dates = "; leilão " + this.initialDate + " :" + this.finalDate;
        }
        return "Imóvel: " + Property.currentId++ + "; quartos: " + this.rooms + "; place: " + this.place + "; preço: " + this.price + "; disponível: " + available + dates + "\n";
        
    }
}
    

