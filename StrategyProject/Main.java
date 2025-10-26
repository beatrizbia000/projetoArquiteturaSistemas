
public class Main {
    public static void main(String[] args) {

        int[] numbers = {7, 2, 9, 4, 3, 8};

        MyList list = new MyList(numbers.clone());

        list.setSortStrategy(new QuickSortStrategy());
        list.sort();
        System.out.println("QuickSort: " + list);

        list = new MyList(numbers.clone());
        list.setSortStrategy(new ShellSortStrategy());
        list.sort();
        System.out.println("ShellSort: " + list);

        list = new MyList(numbers.clone());
        list.setSortStrategy(new HeapSortStrategy());
        list.sort();
        System.out.println("HeapSort: " + list);
    }
}
