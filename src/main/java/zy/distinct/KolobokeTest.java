package zy.distinct;

import com.koloboke.collect.set.hash.HashIntSet;
import com.koloboke.collect.set.hash.HashIntSets;
//import org.apache.lucene.util.RamUsageEstimator;


public class KolobokeTest extends AbstractTest {

    public static void main(String[] args) {
        int count = caseCount;
        int data[] = new int[caseCount];
//        Random r = new Random(1);
//        String[] sa = new String[count];
////        for(int i = 0; i<caseCount;i++){
////            data[i] = r.nextInt();
////        }
//        for (int i = 0; i < sa.length; i++) {
//            sa[i] = String.valueOf(i);
//        }
        long timeSpend = 0l;
        for (int loop = loopCount; loop > 0; loop--) {
//            HashLongSet Set = HashLongSets.newUpdatableSet();
            HashIntSet Set = HashIntSets.newUpdatableSet();
            long start = System.currentTimeMillis();
            int j = 1;
            for (int i = 0; i < count; i++) {
//                Set.add(LongHashFunction.xx().hashChars(sa[i]));
                Set.add(j);
            }
            long end = System.currentTimeMillis();
            timeSpend += end - start;
            System.out.println((end - start));
//            String memory = RamUsageEstimator.humanSizeOf(Set);
//            System.out.println((end - start)+"ms    "+RamUsageEstimator.sizeOf(Set)/KB);
            Set.clear();
        }
        System.out.println("average ：" + timeSpend/loopCount);

        System.out.println("--------------------");
//        for (int loop = loopCount; loop > 0; loop--) {
//            IntSet Set = new IntSet();
//            long start = System.currentTimeMillis();
//            int j = 1;
//            for (int i = 0; i < data.length; i++) {
//                Set.add(data[i]);
//            }
//            long end = System.currentTimeMillis();
//            System.out.println((end - start));
////            String memory = RamUsageEstimator.humanSizeOf(Set);
////            System.out.println((end - start)+"ms    "+RamUsageEstimator.sizeOf(Set)/KB);
//            Set.clear();
//        }
    }
}
