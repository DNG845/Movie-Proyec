/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movies;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        MovieAPIManager movieAPIManager = new MovieAPIManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Search movies");
            System.out.println("2. Show popular movies");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            if (choice == 1) {
                System.out.print("Enter movie title: ");
                String title = scanner.nextLine();
                List<Pelicula> movies = movieAPIManager.searchMovies(title);
                for (Pelicula movie : movies) {
                    System.out.println(movie);
                }
            } else if (choice == 2) {
                List<Pelicula> movies = movieAPIManager.getTrendingMovies();
                for (Pelicula movie : movies) {
                    System.out.println(movie);
                }
            } else if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }
}