package assignments.backend;

import assignments.entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    private static Scanner scanner = new Scanner(System.in);
    private static List<News> newsList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== MyNews ===");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    insertNews();
                    break;
                case 2:
                    viewListNews();
                    break;
                case 3:
                    printAverageRates();
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    return;
                default:
                    System.out.println("Chọn chức năng từ 0 - 3");
            }
        }
    }

    private static void printAverageRates() {
        System.out.println("Chức năng tính điểm đánh giá trung bình và hiển thị danh sách news");
        for (News news : newsList) {
            news.calculate();
            news.display();
        }
    }

    private static void viewListNews() {
        System.out.println("Chức năng hiển thị danh sách news");
        for (News news : newsList) {
            news.display();
        }
    }

    private static void insertNews() {
        System.out.println("Chức năng thêm news");
        System.out.println("Nhập title:");
        String title = scanner.nextLine();
        System.out.println("Nhập publishDate:");
        String publishDate = scanner.nextLine();
        System.out.println("Nhập author:");
        String author = scanner.nextLine();
        System.out.println("Nhập content:");
        String content = scanner.nextLine();
        System.out.println("Nhập 3 đánh giá cho news:");
        int[] rates = new int[3];
        for (int i = 0; i < rates.length; i++) {
            System.out.print("Đánh giá " + (i + 1) + ": ");
            int rate = scanner.nextInt();
            scanner.nextLine();
            rates[i] = rate;
        }
        News news = new News(title, publishDate, author, content, rates);
        newsList.add(news);
        System.out.println("Thêm news thành công");
    }
}
