
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempNameP1 = p1.name;
        int tempAgeP1 = p1.age;
        String tempNameP2 = p2.name;
        int tempAgeP2 = p2.age;

        p1.name = tempNameP2;
        p1.age = tempAgeP2;
        p2.name = tempNameP1;
        p2.age = tempAgeP1;

    }
}