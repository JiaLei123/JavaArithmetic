public class Maopao implements IArithmetic{
    public void run() {
        int[] array = new int[]{2, 3, 4,1,8, 5, 7, 0};
        Sorter sorter = new BubbleSorter();
        sorter.sort(array);
    }
}