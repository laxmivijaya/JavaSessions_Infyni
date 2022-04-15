package collectionsPkg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TravellerTest {


    public static void main(String[] args) {
        Map<Traveller,Boolean> mapRef=new HashMap<>();
        mapRef.put(new Traveller("1","Tests"),true);//1
        mapRef.put(new Traveller("2","Tests2"),true);//2
        mapRef.put(new Traveller("3","Tests3"),false);//3
        mapRef.put(new Traveller("4","Test4"),false);//4
        mapRef.put(new Traveller("4","Test4"),true);//4

        System.out.println(mapRef.size());
        Set<Traveller> travellers=  mapRef.keySet();
        for (Traveller traveller:travellers) {
            System.out.println(traveller.getTravellerId());
            System.out.println(traveller.getTravellerName());
        }








    }

}
