package ro.lucas.registers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ro.lucas.entities.Package;

public class Storage {

    static List<Package> packs = new ArrayList<>();

    public static void add(Package pack) {
        packs.add(pack);
        PackageSystem.add(pack);
    }

    public static void removeSystemAndStorage(Package pack){
        packs.remove(pack);
        PackageSystem.remove(pack);
    }
    public static void removeStorage(Package pack){
        packs.remove(pack);
    }

    public static void checkForPackage(String name) {
        Optional<Package> pack = packs.stream().filter(p -> p.getName().equals(name)).findFirst();
        if (pack.isPresent()) {
            pack.get().getLocation().tellLocation();
        } else {
            System.out.println("The package is lost");
        }
    }
}
