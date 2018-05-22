import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void StreamTest(){
        List<Integer> myList = new ArrayList<>();

        for(int i = 0; i<100; i++){
            myList.add(i);
        }

        // sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        // parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<Integer> highNums = parallelStream.filter(p -> p >90);
        // using Lambda in forEach
        highNums.forEach(p -> System.out.println(("High Nums parallel="+p)));

        Stream<Integer> seqHighNums = sequentialStream.filter(p -> p > 85);
        seqHighNums.forEach(p -> System.out.println("High Nums sequential =" + p));
    }
}
