
import java.util.Arrays;

public class MyList {
    private int[] data;
    private SortStrategy strategy;

    public MyList(int[] data) {
        this.data = data;
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        if (strategy == null) {
            throw new IllegalStateException("Selecione a estratégia de ordenação antes de ordenar.");
        }
        strategy.sort(data);
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
