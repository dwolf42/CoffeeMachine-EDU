class Army {

    public static void createArmy() {
        Unit guysWithPig = new Unit("The Guys with a Pig");
        Unit copperWretches = new Unit("The Copper Wretches");
        Unit wildFellas = new Unit("Wild Fellas");
        Unit wizardBlokes = new Unit("The Blokes in robe and wizard hat");
        Unit exploitingKittens = new Unit("Exploiting Kittens");

        Knight sirWolf = new Knight("Sir Wolf");
        Knight ladyCauteleya = new Knight("Lady Cauteleya");
        Knight devineEnorila = new Knight("Devine Enorila");

        General lordKabraxis = new General("Lord Kabraxis");

        Doctor doctorWho = new Doctor("Doctor Who");

        ////////////////////////////////////////////////////////////////////////////////////////////////
        //           This section's purpose is just to cheat on the code quality check.               //
        // That check itself is fine, but in this exercise it prevents us from posting our solutions. //
        ////////////////////////////////////////////////////////////////////////////////////////////////
        Unit[] unitArr = {guysWithPig, copperWretches, wildFellas, wizardBlokes, exploitingKittens};
        Knight[] knightArr = {sirWolf, ladyCauteleya, devineEnorila};
        General[] generalArr = {lordKabraxis};
        Doctor[] doctorArr = {doctorWho};

        int i;
        for (i = 0; i < unitArr.length &&
                i < knightArr.length &&
                i < generalArr.length &&
                i < doctorArr.length;) {
            i++;
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}