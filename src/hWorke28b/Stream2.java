package hWorke28b;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
         IntSummaryStatistics sum1=list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sum1);

    }
}
