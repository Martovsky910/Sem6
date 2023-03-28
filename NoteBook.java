package Sem7;

public class NoteBook {
    private String model;
    private String ram;
    private String hdd;
    private String os;
    private String color;
    
    // public NoteBook() {
    //     this.model =  null;
    //     this.ram = 0;
    //     this.hdd = 0;
    //     this.os = null;
    //     this.color = null;
    //}
    public NoteBook(String model, String ram, String hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return String.format(
                "Модель: %s \n объем оперативной памяти: %s Гб \n объем накопителя %s Гб \n ОС %s \n Цвет %s \n", model,
                ram, hdd, os, color);
    }
}