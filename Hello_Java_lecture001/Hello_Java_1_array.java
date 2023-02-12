package Hello_Java_lecture001;

// 1. Массивы Одномерные
// class Program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10
//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//     }
// }

// 2. Многомерные часть 1
// class Program {
//     public static void main(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// 3. Многомерные часть 2

class Program {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}