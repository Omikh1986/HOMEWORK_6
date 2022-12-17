
import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Ноутбук Lenovo IdeaPad 3 15ALC6", "LENOVO", 15.6, 8, "SSD", 512, "black", "без операционной системы");
        Notebook notebook2 = new Notebook("Ноутбук Lenovo IdeaPad 5 Pro 16ACH6", "LENOVO", 16.0, 16, "SSD", 512, "grey", "без операционной системы");
        Notebook notebook3 = new Notebook("Ноутбук HP 470 G8, 17.3", "HP", 17.3, 8, "SSD", 512, "metallic", "Free DOS 3.0");
        Notebook notebook4 = new Notebook("Ноутбук HP EliteBook 840 G9, 14", "HP", 14.0, 8, "SSD", 256, "metallic", "Windows 11 Professional");
        Notebook notebook5 = new Notebook("Ноутбук Acer Aspire 3 A315-23-R91S, 15.6", "Acer", 15.6, 8, "HDD", 1000, "white", "Eshell");
        Notebook notebook6 = new Notebook("Ноутбук Acer Extensa 15 EX215-52-38SC, 15.6", "Acer", 15.6, 4, "SSD", 256, "black", "Eshell");

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                " * 1 - Бренд\n" +
                " * 2 - Размер диагонали\n" +
                " * 3 - Оперативная память\n" +
                " * 4 - Тип накопителя (HHD или SSD)\n" +
                " * 5 - Объем HHD или SSD\n" +
                " * 6 - Цвет\n" +
                " * 7 - Операционная система");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите бренд:\n" +
                        " *  LENOVO\n" +
                        " *  HP\n" +
                        " *  Acer\n");

                String brandSelection = scanner.next();
                for (Notebook notebook : notebooks) {
                    String br = notebook.getBrand();
                    if (brandSelection.equalsIgnoreCase(br)) {
                        System.out.println(notebook.getName());

                    }
                }
                break;

            case 2:
                System.out.println("Введите минимальный размер диагонали: ");
                Double diagonalSelection = scanner.nextDouble();
                for (Notebook notebook : notebooks) {
                    if (notebook.getDiagonal() >= diagonalSelection) {
                        System.out.println(notebook.getName());
                    }
                }
                break;
            case 3:
                System.out.println("Введите минимальный размер оперативной памяти: ");
                int gbRAMSelection = scanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getGbRAM() >= gbRAMSelection) {
                        System.out.println(notebook.getName());
                    }
                }
                break;
            case 4:
                System.out.println("Введите тип накопителя (HHD или SSD): ");
                String driveTypeSelection = scanner.next();
                for (Notebook notebook : notebooks) {
                    if (notebook.getDriveType() == driveTypeSelection) {
                        System.out.println(notebook.getName());
                    }

                }
                break;
            case 5:
                System.out.println("Введите минимальный объем накопителя: ");
                int VolumeSSDHDDSelection = scanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getVolumeSSD_HDD() >= VolumeSSDHDDSelection) {
                        System.out.println(notebook.getName());
                    }

                }
                break;
            case 6:
                System.out.println("Введите цвет ноутбука: \n" +
                        "* black\n" +
                        "* grey\n" +
                        "* metallic\n" +
                        "* white\n");
                String colorSelection = scanner.next();
                for (Notebook notebook : notebooks) {
                    String color = notebook.getColor();
                    if (color.equalsIgnoreCase(colorSelection)) {
                        System.out.println(notebook.getName());
                    }

                }
                break;
            case 7:
                System.out.println("Выберите операционную систему, нажмите нужную цифру: \n" +
                        "1 * без операционной системы\n" +
                        "2 * Free DOS 3.0\n" +
                        "3 * Windows 11 Professional\n" +
                        "4 * Eshell\n");

                int osSelection = scanner.nextInt();

                if (osSelection == 1) {
                    for (Notebook notebook : notebooks) {
                        String os = notebook.getOperatingSystem();
                        if (os.equals("без операционной системы")) {
                            System.out.println(notebook.getName());
                        }
                    }
                }
                if (osSelection == 2) {
                    for (Notebook notebook : notebooks) {
                        String os = notebook.getOperatingSystem();
                        if (os.equals("Free DOS 3.0")) {
                            System.out.println(notebook.getName());
                        }
                    }
                }
                if (osSelection == 3) {
                    for (Notebook notebook : notebooks) {
                        String os = notebook.getOperatingSystem();
                        if (os.equals("Windows 11 Professional")) {
                            System.out.println(notebook.getName());
                        }
                    }
                }
                if (osSelection == 4) {
                    for (Notebook notebook : notebooks) {
                        String os = notebook.getOperatingSystem();
                        if (os.equals("Eshell")) {
                            System.out.println(notebook.getName());
                        }
                    }
                }
                break;
        }
        System.out.println();
        System.out.println("Это все подходящие варианты");
    }
}
