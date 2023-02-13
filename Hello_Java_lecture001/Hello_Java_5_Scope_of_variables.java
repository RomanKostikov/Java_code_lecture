package Hello_Java_lecture001;
// Область видимости переменных
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.
class Program {
    public static void main(String[] args) {
        {
            int i = 123;
            System.out.println(i);
        }
        System.out.println(i); // error: cannot find symbol
    }
}