package Hello_Java_lecture003;
// Получение итератора с целью более гибкой работы с данными URL
// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
// Enumeration в Java Collections Framework. Итераторы отличаются от
// перечислений двумя способами:
// Итераторы позволяют вызывающей стороне удалять элементы из
// базовой коллекции во время итерации с четко определенной
// семантикой.
// hasNext(), next(), remove()
// ListIterator<E> URL
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

import java.util.*;
// Итераторы(for each цикл)
public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }

    }
}
