package ro.lucas.locations;

public class Stored implements Location {

    @Override
    public void tellLocation() {
        System.out.println("Package in storage");
    }
}
