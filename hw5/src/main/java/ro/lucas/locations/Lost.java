package ro.lucas.locations;

public class Lost implements Location {

    @Override
    public void tellLocation() {
        System.out.println("Package lost");
    }
}
