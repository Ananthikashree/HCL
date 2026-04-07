abstract class Place {

   
    abstract void famousFor();

    
    void location() {
        System.out.println("This place is in India");
    }
}

class Ooty extends Place {
    void famousFor() {
        System.out.println("Ooty is famous for hill station and tea gardens");
    }
}

class Chennai extends Place {
    void famousFor() {
        System.out.println("Chennai is famous for Marina Beach and culture");
    }
}

public class abstractclass {
    public static void main(String[] args) {

        Place p1 = new Ooty();
        p1.famousFor();
        p1.location();

        Place p2 = new Chennai();
        p2.famousFor();
        p2.location();
    }
}