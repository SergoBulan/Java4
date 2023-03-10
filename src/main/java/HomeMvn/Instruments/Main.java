package HomeMvn.Instruments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instrument> instruments = Arrays.asList(
                new Trumb(12, 3100),
                new Drum(20, 4500),
                new Guitar(8, 1500)
        );
        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
}
