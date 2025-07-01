abstract class Instrument {
    abstract void play();
}

class Guitar extends Instrument {
    void play() {
        System.out.println("I enjoy playing guitar!");
    }
}

class Drum extends Instrument {
    void play() {
        System.out.println("Playing the drum is all  fun!");
    }
}

public class Code_7 {
    public static void main(String[] args) {
        Instrument g = new Guitar();
        Instrument p = new Drum();
        g.play();
        p.play();

        // Instrument i = new Instrument(); // ❌ Error: Cannot instantiate abstract class
    }
}

