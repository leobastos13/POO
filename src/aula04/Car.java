package aula04;

public class Car {
    private String make;
    private String model;
    private int year;
    private int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public String getMake() {
        return make;
    } 

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKms() {
        return kms;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + ", " + this.year + ", kms: " + this.kms;
    }
    
}
    
    


