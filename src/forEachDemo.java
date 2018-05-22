import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class forEachDemo {

    public static void forEachTest(){
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            myList.add(i);
        }

        //traverse the list using Iterator class
        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterating current integer value: " + iterator.next());
        }

        //alternatively, use forEach
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach traversing value: " + integer);
            }
        });

        //traversing through Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}
