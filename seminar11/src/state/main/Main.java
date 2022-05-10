package state.main;

import state.clase.Autobuz;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz = new Autobuz(301);
        autobuz.pleacaInCursa();
        autobuz.ieseDinService();
        autobuz.ajungeCapatLinie();
        autobuz.intraInService();
        autobuz.ieseDinService();
    }
}
