package Java102.PatikaStore;

import Java102.PatikaStore.Abstraction.IProduct;
import Java102.PatikaStore.Objects.Brand;
import Java102.PatikaStore.Objects.Notebook;
import Java102.PatikaStore.Objects.Telephone;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> brandNames = new ArrayList<>(Arrays.asList("samsung", "lenovo", "apple", "huawei", "casper", "asus", "hp", "xiaomi", "monster"));
        List<Telephone> telephones = addTelephone();
        List<Notebook> notebooks = addNotebook();
        int select;
        boolean duration = true;
        while (duration) {
            System.out.print("\n 1 - Marka Listesi \n 2 - Telefon \n 3 - Dizüstü Bilgisayar \n 4 - Ürün Ekle \n 5 - Ürün Sil \n 6 - Çıkış yap \n  Seçim yap: ");
            select = sc.nextInt();
            switch (select) {
                case 1 -> listedBrands(brandNames);
                case 2 -> listedTelephone(telephones);
                case 3 -> listedNotebook(notebooks);
                case 4 -> addProduct(brandNames, telephones, notebooks);
                case 5 -> delete(telephones,notebooks);
                case 6 -> duration = false;
                default -> System.out.println("Doğru seçim yap.");
            }
        }

    }

    private static void delete(List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print("Silmek istediğin ürün sınıfını seç,\n  1 - Telefon \n  2 - Dizüstü Bilgisayar \n Seç: ");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                listedTelephone(telephones);
                System.out.print("Silmek istediğin telefonun kodunu gir: ");
                int id = sc.nextInt();
                telephones.removeIf(telephone -> telephone.getId() == id);

            }
            case 2 -> {
                listedNotebook(notebooks);
                System.out.print("Silmek istediğin laptobun kodunu gir: ");
                int id = sc.nextInt();
                notebooks.removeIf(notebook -> notebook.getId() == id);

            }

        }
    }

    private static void addProduct(List<String> brandNames, List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print(" Eklemek istediğin ürünü seç, \n  1 - Telefon \n  2 - Dizüstü Bilgisayar \n  Seçim yap: ");
        List<String> values = new ArrayList<>();
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                String[] brands = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Pil", "Ram", "Color"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    while (brand.equals("Marka") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(brand + "`ı tekrar gir" + ": ");
                        value = sc.next();
                    }
                    values.add(value);
                }
                telephones.add(new Telephone(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7)), Integer.parseInt(values.get(8)), values.get(9)));
            }
            case 2 -> {
                String[] brands = new String[]{"Marka", "Model", "Fiyat", "İndirim", "Stok", "Hafıza", "Boyut", "Ram"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    while (brand.equals("Marka") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(brand + "`ı tekrar gir" + ": ");
                        value = sc.next();
                    }
                    values.add(value);
                }
                notebooks.add(new Notebook(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7))));
            }

        }
    }

    private static void listedBrands(List<String> brandNames) {
        List<Brand> brands = new ArrayList<>();
        for (int i = 0; i < brandNames.toArray().length; i++) {
            brands.add(new Brand(brandNames.get(i)));
        }
        Collections.sort(brands);
        for (Brand b : brands) {
            System.out.println("-" + b.getName().toUpperCase());
        }
    }

    private static List<Telephone> addTelephone() {
        List<Telephone> telephones = new ArrayList<>();

        telephones.add(new Telephone("SAMSUNG", "S20", 5000, 10, 45, 64, 15.6, 4500, 8, "Siyah"));
        telephones.add(new Telephone("APPLE", "14", 5000, 10, 45, 64, 15.6, 4500, 8, "Pembe"));
        telephones.add(new Telephone("XIAOMI", "Red Mi Note 11", 5000, 10, 45, 64, 15.6, 4500, 8, "Kırmızı"));

        return telephones;
    }
    private static void listedTelephone(List<Telephone> telephones){
        System.out.format("%-5s %-8s %-25s %-14s %-10s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|", "|Renk|");
        System.out.println("___________________________________________________________________________________________");
        for (Telephone t : telephones) {
            System.out.format(" %-4s %-10s %-23s %-15s %-10s %-10s %-10s %-10s\n", t.getId(), t.getBrand(), t.getDescription(), t.getUnitPrice() + " TL", t.getMemory() + " GB", t.getRam() + " GB", t.getSize()+"`", t.getColor());
        }
    }
    private static List<Notebook> addNotebook() {
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("LENOVO", "Thinkpad 3", 15000, 10, 45, 512, 13.2, 24));
        notebooks.add(new Notebook("APPLE", "M2", 35000, 10, 45, 128, 16.6, 8));
        notebooks.add(new Notebook("HUAWEI", "D16", 25000, 10, 45, 1024, 15.6, 16));

        return notebooks;
    }

    private static void listedNotebook(List<Notebook> notebooks){
        System.out.format("%-5s %-8s %-22s %-11s %-10s %-10s %-10s\n", "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|Hafıza|", "|Bellek|", "|Size|");
        System.out.println("______________________________________________________________________________________________");
        for (Notebook n : notebooks) {
            System.out.format(" %-4s %-8s %-21s %-13s %-10s %-10s %-10s\n", n.getId(), n.getBrand(), n.getDescription(), n.getUnitPrice() + " TL", n.getMemory() + " GB", n.getRam() + " GB", n.getSize() + "`");
        }
    }
//    private static List<String> tool(List<IProduct> products, String[] brands, List<String> brandNames, List<String> values){
//        for (String brand : brands) {
//            System.out.print(brand + ": ");
//            String value = sc.next();
//            while (brand.equals("Marka") && !brandNames.contains(value.toLowerCase())) {
//                System.out.print(brand + "`ı tekrar gir" + ": ");
//                value = sc.next();
//            }
//            values.add(value);
//        }
//        return values;
//    }
}
