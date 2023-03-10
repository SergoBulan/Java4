package HomeMvn.Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Trumb implements Instrument {

    private int diametr;
    private int cost;

    @Override
    public void play() {
        System.out.println("Купив " + this.getClass().getSimpleName() + " які мають діаметр " + this.diametr + " см і коштує " + this.cost);
    }
}
