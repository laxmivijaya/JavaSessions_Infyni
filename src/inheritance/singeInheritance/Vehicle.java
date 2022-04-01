package inheritance.singeInheritance;

public class Vehicle {

    private String typeOfVehicle;
    private int noOfTyres;



    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }


    public void displayVehicleInfo(){
        System.out.println("Type of Vehicle::"+typeOfVehicle);
        System.out.println("No of tyres::"+noOfTyres);
    }

}
