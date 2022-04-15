package collectionsPkg.map;

import java.util.Objects;

public class Traveller {

    private String travellerId;
    private String travellerName;

    public Traveller(String travellerId, String travellerName) {
        this.travellerId = travellerId;
        this.travellerName = travellerName;
    }

    public String getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(String travellerId) {
        this.travellerId = travellerId;
    }

    public String getTravellerName() {
        return travellerName;
    }

    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traveller traveller = (Traveller) o;
        return Objects.equals(travellerId, traveller.travellerId) && Objects.equals(travellerName, traveller.travellerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(travellerId, travellerName);
    }
}
