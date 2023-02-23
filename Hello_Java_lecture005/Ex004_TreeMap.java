package Hello_Java_lecture005;

import java.util.*;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
    }
}

// TreeMap
// Методы, на которые нужно обратить внимание
// put(K,V) get(K) remove(K)
// descendingMap() tailMap() headMap() lastEntry() firstEntry()
// descendingKeySet(V)
// В основе данной коллекции лежат красно-чёрное деревья.
// Позволяют быстрее искать, но могут возникнуть «заминки»
// при добавлении.
