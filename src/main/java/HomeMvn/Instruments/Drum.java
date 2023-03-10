package HomeMvn.Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements Instrument {
    private int radios;
    private int cost;
    @Override
    public void play() {
        System.out.println("Купив " + this.getClass().getSimpleName() + " які мають діаметр " + this.radios + " см і коштує " + this.cost);
    }
}
