package com.example.bookapp;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        Book books;
        String result = " ";
        Integer x = 0;
        ArrayList<Book> numbers = new ArrayList<Book>();

        System.out.println("Use the prompt below to search for a book.");

        do{
            books = new Book();
            System.out.print("Enter title of book: ");
            books.setTitle(keyboard.nextLine());
            System.out.print("Enter the name of the author: ");
            books.setAuthor(keyboard.nextLine());
            System.out.print("Enter book description: ");
            books.setDescription(keyboard.nextLine());
            System.out.print("Enter the price: ");
            books.setPrice(keyboard.nextLine());
            System.out.print("In stock: ");
            books.setIsInStock(keyboard.nextLine());
            numbers.add(books);

            System.out.print("Do you want to enter another book? (Y/N)");
            result = keyboard.nextLine();
            if(result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("Yes")){
                done = false;
            }else {
                done = true;
            }
        } while(done != true);

        System.out.println(numbers);

        for (Book eachBook : numbers){
            System.out.print("Book details: " + eachBook.getDisplayText());
        }
        System.out.print('\n');

/*        for(Integer z: numbers) {
            System.out.println(z);
        }*/
    }

}
