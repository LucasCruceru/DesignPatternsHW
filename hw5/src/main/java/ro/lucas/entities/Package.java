package ro.lucas.entities;

import java.util.ArrayList;

import ro.lucas.locations.Location;
import ro.lucas.locations.Stored;
import ro.lucas.locations.Transit;
import ro.lucas.registers.Storage;

public class Package implements IStorageObj {
    private String name;
    private ArrayList<IStorageObj> objs = new ArrayList<>();
    private Location location;


    public Package(String name) {
        this.name = name;
        this.location = new Stored();
        Storage.add(this);
    }
    public void add(IStorageObj obj) {
            obj.setLocation(this.location);
            objs.add(obj);
    }

    public void send(){
        if (isLost()) {
            System.out.println(this.name + " will be lost");
            Storage.removeSystemAndStorage(this);
        }
        else
            this.location = new Transit();
            Storage.removeStorage(this);
    }

    private static boolean isLost() {
        // 20% chance to lose the package
        return Math.random() < 0.2;
    }

    public String getName() {
        return name;
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
