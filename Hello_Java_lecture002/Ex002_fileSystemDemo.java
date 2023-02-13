package Hello_Java_lecture002;

// 1. Для работы нужно:

// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt"); // относительный путь
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); // абсолютный путь

// 2. Что предпочтительнее?

// import java.io.File;

// class program {
//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathFile = pathProject.concat("/file.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());

//         System.out.println(pathFile);
//         File f1 = new File("file.txt");
//         File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
//         System.out.println(f1.getAbsolutePath());
//         System.out.println(f2.getAbsolutePath());
//     }
// }

// 3. Отработка ошибок: алгоритм действий

// try {
// Код, в котором может появиться ошибка
// } catch (Exception e) {
// Обработка, если ошибка случилась
// }
// finally {
// Код, который выполнится в любом случае
// }

// 4. Отработка ошибок: пример 1

// import java.io.File;

// class tryDemo {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File f3 = new File(pathFile);
//             System.out.println("try");
//         } catch (Exception e) {
//             System.out.println("catch");
//         } finally {
//             System.out.println("finally");
//         }
//     }
// }

// 5. Отработка ошибок: пример 2(рабочий вариант)

// import java.io.File;

// class tryDemo {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);
//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             } else {
//                 System.out.println("file.existed");
//             }
//         } catch (Exception e) {
//             System.out.println("catch");
//         } finally {
//             System.out.println("finally");
//         }
//     }}

// 6. Отработка ошибок: пример 3
// import java.io.File;

// class tryDemo {
// public static void main(String[] args) {
// String line = "empty";
// try {
// File file = new File(pathFile);
// if (file.createNewFile()) {
// System.out.println("file.created");
// }
// else {
// BufferedReader bufReader = new BufferedReader(new FileReader(file));
// System.out.println("file.existed");
// line = bufReader.readLine();
// bufReader.close();
// }
// } catch (Exception e) {
// // e.printStackTrace();
// } finally {
// System.out.println(line);
// }
// }
// }

// 7. Основные команды:

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// 8. Катологи(сосздали папку)

import java.io.File;

class Ex0043 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
    }
}
