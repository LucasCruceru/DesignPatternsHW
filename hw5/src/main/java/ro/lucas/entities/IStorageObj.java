package ro.lucas.entities;

import ro.lucas.locations.Location;

public interface IStorageObj {
    Location getLocation();
    void setLocation(Location location);
}
