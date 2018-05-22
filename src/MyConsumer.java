import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer>{
    public void accept(Integer integer){
        System.out.println("Consumer implementation traversing value: " + integer);
    }
}
