package inheritance.singeInheritance;

public class Car extends  Vehicle{

    private String color;
    private String brand;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayCarInfo(){
        System.out.println("color of Car::"+color);
        System.out.println("Brand of car::"+brand);
        System.out.println("Name of car::"+name);
    }
}
