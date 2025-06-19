import java.util.Scanner;

class Product {
    int id;
    String name;
    String category;

    Product(int i, String n, String c) {
        id = i;
        name = n;
        category = c;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
    }
}

public class Ecommerce_Platform_Search{

    static Product linearSearch(Product[] items, String search) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equalsIgnoreCase(search)) {
                return items[i];
            }
        }
        return null;
    }

    static void sortProducts(Product[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].name.compareToIgnoreCase(items[j].name) > 0) {
                    Product temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }

    static Product binarySearch(Product[] items, String search) {
        int start = 0;
        int end = items.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int compare = search.compareToIgnoreCase(items[mid].name);

            if (compare == 0) {
                return items[mid];
            } else if (compare > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] items = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Mouse", "Electronics")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String search = sc.nextLine();

        System.out.println("\nLinear Search:");
        Product result1 = linearSearch(items, search);
        if (result1 != null) {
            result1.show();
        } else {
            System.out.println("Product not found.");
        }

        sortProducts(items); // sort before binary search

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(items, search);
        if (result2 != null) {
            result2.show();
        } else {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}
