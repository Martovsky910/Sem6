package Sem7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите критерий фильтрации: \n 1-RAM \n 2-HDD \n 3-OS \n 4-COLOR");
        var a = filter(sc);
        var b = Filter(getNbList(), a);
        if(b.size()==0){
            System.out.println("Нет критерий для поиска :С");
        }else{

            System.out.println(b.toString());
        }
    }

    public static ArrayList<NoteBook> Filter(ArrayList<NoteBook> nb, HashMap<String, String> filter) {
        ArrayList<NoteBook> filterNotebooks = new ArrayList();
        for (NoteBook notebook : nb) {
            boolean allFiltersMatch = false;
            for (String key : filter.keySet()) {
                Object filterValue = filter.get(key);
                switch (key) {
                    case "RAM":
                        if (notebook.getRam().equals(filterValue)) {
                            allFiltersMatch = true;
                        }
                        break;
                    case "HDD":
                        if (notebook.getHdd().equals(filterValue)) {
                            allFiltersMatch = true;
                        }
                        break;
                    case "OS":
                        if (!notebook.getOs().equals(filterValue)) {
                            allFiltersMatch = true;
                        }
                        break;
                    case "COLOR":
                        if (!notebook.getColor().equals(filterValue)) {
                            allFiltersMatch = true;
                        }
                        break;
                }
                if (!allFiltersMatch) {
                    break;
                }
            }
            if (allFiltersMatch) {
                filterNotebooks.add(notebook);
            }
        }
        return filterNotebooks;
    }

    public static ArrayList<NoteBook> getNbList() {
        ArrayList<NoteBook> nb = new ArrayList<>();
        NoteBook sony = new NoteBook("Sony", "8", "512", "Windows", "Black");
        NoteBook acer = new NoteBook("Acer", "16", "512", "Windows", "Gray");
        NoteBook xiaomi = new NoteBook("Xiaomi", "4", "256", "Windows", "White");
        NoteBook asus = new NoteBook("Asus", "8", "256", "Linux", "Black");
        NoteBook hp = new NoteBook("HP", "16", "1024", "Linux", "White");

        nb.add(sony);
        nb.add(acer);
        nb.add(xiaomi);
        nb.add(asus);
        nb.add(hp);

        return nb;
    }

    public static HashMap<String, String> filter(Scanner sc) {
        HashMap<String, String> filter = new HashMap<>();
        int filternum = sc.nextInt();
        String key = "";
        //System.out.println("Выберите критерий фильтрации: \n 1-RAM \n 2-HDD \n 3-OS \n 4-COLOR");
        switch (filternum) {
            case 1: {
                key = "RAM";
                System.out.println("Введите объем оперативной памяти: ");
                String ram = sc.next();
                filter.put(key, ram);
                break;
            }
            case 2: {
                key = "HDD";
                System.out.println("Введите объем жесткого диска: ");
                String hdd = sc.next();
                filter.put(key, hdd);
                break;
            }
            case 3: {
                key = "OS";
                System.out.println("Введите операционную систему: ");
                String os = sc.next();
                filter.put(key, os);
                break;
            }
            case 4: {
                key = "COLOR";
                System.out.println("Введите цвет: ");
                String color = sc.next();
                filter.put(key, color);
                break;
            }
        }
        return filter;
    }
}
