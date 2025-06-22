// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.Scanner;

// /**
//  * Exercise 2: E-commerce Platform Search Functionality
//  *
//  * Step 1: Understanding Asymptotic Notation
//  * - Big O Notation is used to describe the performance (time/space complexity) of an algorithm as input size grows.
//  * - Linear Search: Best O(1), Avg O(n/2) ~ O(n), Worst O(n)
//  * - Binary Search: Best O(1), Avg & Worst O(log n) — requires sorted data
//  */

// // Step 2: Define the Product class
// class Product {
//     int productId;
//     String productName;
//     String category;

//     public Product(int productId, String productName, String category) {
//         this.productId = productId;
//         this.productName = productName;
//         this.category = category;
//     }

//     @Override
//     public String toString() {
//         return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
//     }
// }

// public class EcommerceSearch {

//     // Step 3: Implement Linear Search
//     public static Product linearSearch(Product[] products, String name) {
//         for (Product product : products) {
//             if (product.productName.equalsIgnoreCase(name)) {
//                 return product;
//             }
//         }
//         return null;
//     }

//     // Step 3: Implement Binary Search (on sorted array)
//     public static Product binarySearch(Product[] products, String name) {
//         int left = 0;
//         int right = products.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             int cmp = name.compareToIgnoreCase(products[mid].productName);

//             if (cmp == 0) {
//                 return products[mid];
//             } else if (cmp > 0) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return null;
//     }

//     // Helper function to sort products by name for binary search
//     public static void sortProductsByName(Product[] products) {
//         Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
//     }

//     // Step 4: Main Method - Execution & Analysis
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Sample product data
//         Product[] products = {
//             new Product(101, "Laptop", "Electronics"),
//             new Product(102, "Phone", "Electronics"),
//             new Product(103, "Shoes", "Footwear"),
//             new Product(104, "Backpack", "Accessories"),
//             new Product(105, "Watch", "Accessories")
//         };

//         System.out.println("Enter product name to search:");
//         String searchName = scanner.nextLine();

//         // Perform Linear Search
//         long startLinear = System.nanoTime();
//         Product resultLinear = linearSearch(products, searchName);
//         long endLinear = System.nanoTime();

//         System.out.println("\n[Linear Search]");
//         if (resultLinear != null) {
//             System.out.println("Found: " + resultLinear);
//         } else {
//             System.out.println("Product not found.");
//         }
//         System.out.println("Time Taken: " + (endLinear - startLinear) + " ns");

//         // Sort products for Binary Search
//         sortProductsByName(products);

//         // Perform Binary Search
//         long startBinary = System.nanoTime();
//         Product resultBinary = binarySearch(products, searchName);
//         long endBinary = System.nanoTime();

//         System.out.println("\n[Binary Search]");
//         if (resultBinary != null) {
//             System.out.println("Found: " + resultBinary);
//         } else {
//             System.out.println("Product not found.");
//         }
//         System.out.println("Time Taken: " + (endBinary - startBinary) + " ns");

//         scanner.close();

//         /*
//          * Step 4: Analysis
//          * ----------------
//          * Linear Search: O(n) — simple, works on unsorted data, but slower on large datasets.
//          * Binary Search: O(log n) — faster, but needs sorted data.
//          *
//          * Conclusion:
//          * ➤ Use Binary Search for large e-commerce catalogs when sorting is possible (or use databases with indexes).
//          * ➤ Use Linear Search for small datasets or temporary lists where sorting is unnecessary.
//          */
//     }
// }
