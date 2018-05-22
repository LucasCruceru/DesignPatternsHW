package ro.lucas.entities;

import ro.lucas.registers.PackageSystem;
import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private List<Package> packages = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public void addPackage(Package pack){
        packages.add(pack);
    }

    public void callForPackage(String name){
        PackageSystem.checkForPackage(name);
    }

    public void sendPackages(){
        packages.forEach(Package::send);
    }
}
