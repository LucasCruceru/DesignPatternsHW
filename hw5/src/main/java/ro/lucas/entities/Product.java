package ro.lucas.entities;

import ro.lucas.locations.Location;

public class Product implements IStorageObj {

    private String name;

    Location location;

    public Product(String name){
        this.name = name;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }



}
