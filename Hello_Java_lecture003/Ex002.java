package Hello_Java_lecture003;
// List – пронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем,
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному
// индексу (позиции в списке) и искать элементы в списке.
// URL
// ArrayList, LinkedList (Vector, Stack – устаревшие)
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList();
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
