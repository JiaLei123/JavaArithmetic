/**
 * The class which will show the  BubbleISorter function
 */
public class Maopao extends ArithmeticBase implements IObserver {
    public void runArithmetic() {
        Integer[] slist = GenerateIntList(4);
        //print orignal list
        printList(slist);

        ISorter sorter = new BubbleISorter();
        sorter.sort(slist);

        printList(slist);
    }

    public void Update(){
        this.runArithmetic();
    }
}