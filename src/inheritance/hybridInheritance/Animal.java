package inheritance.hybridInheritance;

public class Animal {

    private String name;
    private int noOfHeart;

    public void eat(){
        System.out.println("now "+name+" is Eating.....");
    }

    public void displayName(){
        System.out.println("Animal name is::"+getName());
    }

    public void displayNoHeart(){
        System.out.println(getName()+ " has "+ getNoOfHeart()+ " Heart");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }
}
