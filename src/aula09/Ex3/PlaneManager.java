package aula09.Ex3;

import java.util.ArrayList;
import java.util.List;

public class PlaneManager {
    private List<Plane> planes;

    public PlaneManager() {
        this.planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
       this.planes.add(plane);
    }

    public void removePlane(String id) {

        for (int i = 0; i < planes.size(); i++) {

            if (planes.get(i).getIdentificador().equals(id)) {
                planes.remove(i);
                return; 
            }
        }
    }

    public Plane searchPlane(String id) {

        for (int i = 0; i < planes.size(); i++) {
            
            if (planes.get(i).getIdentificador().equals(id)) {
                return planes.get(i);
            }
        }
        return null;
    }

    public List<Plane> getCommercialPlanes() {
        ArrayList<Plane> commerciaPlanes = new ArrayList<Plane>();

        for (int i = 0; i < planes.size(); i++) {
            
            if (planes.get(i) instanceof CommercialPlane) {
                commerciaPlanes.add(planes.get(i));
            }
        }
        return commerciaPlanes;
    }

    public List<Plane> getMilitaryPlanes() {
        ArrayList<Plane> militaryPlanes = new ArrayList<Plane>();

        for (int i = 0; i < planes.size(); i++) {
            
            if (planes.get(i) instanceof MilitaryPlane) {
                militaryPlanes.add(planes.get(i));
            }
        }
        return militaryPlanes;
    }

    public void printAllPlanes() {
        
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).toString());
        }
    }

    public Plane getFastestPlane() {
        Plane fastestPlane = null;

        for (int i = 0; i < planes.size(); i++) {

            if (fastestPlane == null || planes.get(i).getVelocidadeMax() > fastestPlane.getVelocidadeMax()) {
                fastestPlane = planes.get(i);
            }
        }
        return fastestPlane;
    }
}
