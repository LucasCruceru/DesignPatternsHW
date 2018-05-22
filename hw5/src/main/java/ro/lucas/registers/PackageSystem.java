package ro.lucas.registers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ro.lucas.entities.Package;

public class PackageSystem {

    static List<Package> packs = new ArrayList<>();

    public static void add(Package pack) {
        packs.add(pack);
    }
    public static void remove(Package pack){packs.remove(pack);}

    public static void checkForPackage(String name) {
        Optional<Package> pack = packs.stream().filter(p -> p.getName().equals(name)).findFirst();
        if (pack.isPresent()) {
                pack.get().getLocation().tellLocation();
        } else {
            Storage.checkForPackage(name);

        }
    }
}
