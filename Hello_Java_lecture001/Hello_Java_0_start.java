package Hello_Java_lecture001;
// Основы: типы данных
// Создание переменной
// <тип> <идентификатор>;
// <идентификатор> = <значение>;

// 0. начало
/**
 * program
 */
// public class program {
// public static void main(String[] args) {
// System.out.println("bye, world!");
// }
// }

// 1. основные типы данных: integer
// class Program
// {
// public static void main(String[] args) {
// short age = 10;
// int salary = 123456;
// System.out.println(age); //10
// System.out.println(salary); //123456
// }
// }

// 2. основные типы данных: float(вещественный)
// class Program {
// public static void main(String[] args) {
// float e = 2.7f; // обратить внимание на суффикс f
// double pi = 3.1415;
// System.out.println(e); // 2.7
// System.out.println(pi); // 3.1415
// }
// }

// 3. основные типы данных: char(символьный)
// class Program {
// public static void main(String[] args) {
// char ch = '1';
// System.out.println(Character.isDigit(ch)); // true
// ch = 'a';
// System.out.println(Character.isDigit(ch)); // false
// }
// }

// 4. основные типы данных: boolean

// class Program {
// public static void main(String[] args) {
// boolean flag1 = 123 <= 234;
// System.out.println(flag1); // true
// boolean flag2 = 123 >= 234 || flag1;
// System.out.println(flag2); // true
// boolean flag3 = flag1 ^ flag2;
// System.out.println(flag3); // false
// }
// }

// 5. основные типы данных: string(строки)
// class Program {
// public static void main(String[] args) {
// String msg = "Hello, world";
// System.out.println(msg); // Hello world
// }
// }

// 6. Неявная типизация
// class Program {
// public static void main(String[] args) {
// var a = 123;
// System.out.println(a); // 123
// var d = 123.456;
// System.out.println(d); // 123.456
// }
// }

// 7. Неявная типизация: подробности
// class Program {
// public static void main(String[] args) {
// var a = 123;
// System.out.println(a); // 123
// var d = 123.456;
// System.out.println(d); // 123.456
// System.out.println(getType(a)); // Integer
// System.out.println(getType(d)); // Double
// d = 1022;
// System.out.println(d); // 1022
// // d = "mistake";
// // error: incompatible types:
// // String cannot be converted to double
// }

// static String getType(Object o) {
// return o.getClass().getSimpleName();
// }
// }

// 8. Вопрос про инкрименты на собеседование
// class Program {
// public static void main(String[] args) {
// int a = 123;
// // a = --a - a--; // 0
// a = a-- - --a; // 2
// System.out.println(a);
// }
// }

// 9. Побитовый сдвиг(мб понадобится для оптимизации)
// class Program {
// public static void main(String[] args) {
// int a = 8;
// // 1000 = 8
// // a = a << 1;
// System.out.print(a << 1); // право
// // 10000 = 16
// }
// }

// 10. Побитовая дизюнкция и коньюнкция(мб понадобится для оптимизации)
class Program {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(a | b); // или
        // 101
        // 010
        // 111
    }
}