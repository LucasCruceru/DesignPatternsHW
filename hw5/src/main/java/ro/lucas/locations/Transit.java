package ro.lucas.locations;

public class Transit implements Location {

    @Override
    public void tellLocation() {
        System.out.println("Package in transit");
    }
}
