package com.library;

import java.util.*;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        libraryService service = new libraryService();

        while (true) {

            System.out.println("===== Library Management System =====");
            System.out.println("1. Create Author with Books");
            System.out.println("2. Display Authors with Books");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Book");
            System.out.println("5. Delete Author");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {

            case 1:

                System.out.print("Enter Author Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                Author author = new Author();
                author.setAuthorName(name);
                author.setEmail(email);

                List<Book> books = new ArrayList<>();

                for (int i = 1; i <= 3; i++) {

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); 

                    Book b = new Book();
                    b.setTitle(title);
                    b.setPrice(price);

                    books.add(b);
                }

                service.create(author, books);
                break;

            case 2:

                service.getAllAuthors();
                break;

            case 3:

                System.out.print("Enter Book Title: ");
                int bookid = sc.nextInt();

                System.out.print("Enter New Price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                service.update(bookid, price);
                break;

            case 4:

                System.out.print("Enter Book Id to Delete: ");
                int bid = sc.nextInt();
                sc.nextLine();

                service.deleteBook(bid);
                break;

            case 5:

                System.out.print("Enter Author Id to Delete: ");
                int id = sc.nextInt();
                sc.nextLine();

                service.deleteAuthor(id);
                break;

            case 6:
                System.out.println("Program Ended");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}