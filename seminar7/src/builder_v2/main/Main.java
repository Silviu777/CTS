package builder_v2.main;

import builder_v2.AutobuzBuilder;
import builder_v2.AutobuzLinie;

public class Main {
    public static void main(String[] args) {

        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrLinie(7).setAreOprire(false);

        AutobuzLinie autobuz = autobuzBuilder.build();
        AutobuzLinie autobuz1 = autobuzBuilder.build();
        System.out.println(autobuz + "\n" + autobuz1);

    }
}
