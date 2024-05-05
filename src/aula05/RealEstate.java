package aula05;



 class RealEstate {
    
    private Property[] properties;
    private int numProperties;

    public RealEstate() {
        this.properties = new Property[90];
        this.numProperties = 0;
    }

    public void newProperty(String place, int rooms, int price) {
        properties[numProperties] = new Property(rooms, place, price);
        numProperties++;
    }

    public void sell(int propertyId) {
        int a = 0;

        for (int i = 0; i < this.numProperties; i++) {
            
            if (this.properties[i].getId() == propertyId) {
                a = i;
                break;
            }
        }

        if (propertyId > (properties[numProperties - 1].getId())) {

            System.out.println("Property" + properties[a].getId() + ": don´t exist");
            return;
        }

        if (properties[a].isAvailable()) {
            System.out.println("Property" + properties[a].getId() + ": sold");
        }

        if (properties[a].isAvailable()) {
            System.out.println("Property" + properties[a].getId() + ": not available");
        }
        properties[a].setAvailable(false);
    }

    public void setAuction(int propertyId, DateYMD auction, int duration) {
        int position = 0;

        for (int i = 0; i < this.numProperties; i++) {
            
            if (this.properties[i].getId() == propertyId) {
                position = i;
                break;
            }
        }
        properties[position].setinitialDate(auction);

        for (int i = 1; i < duration; i++) {
            auction.increment();
            properties[position].setFinalDate(auction);    
        }
    }

    public String toString() {
        String string = "properties:\n";

        for (int i = 0; i < numProperties; i++) {
            string += properties[i].toString();
        }
        return string;
    }
}
