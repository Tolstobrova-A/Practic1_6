/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicatask1_6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PracticaTask1_6 {

    public static void main(String[] args) {
        System.out.println("Practical 1.6, Studentka Anastasia Tolstobrova, RIBO-01-22, Variant-5");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название магазина: ");
        String storeName = scanner.nextLine();

        Store store = new Store(storeName);
        REVISOR revisor = new REVISOR();

        revisor.closeStore(store);
        revisor.rebrand(store);

        System.out.println("Название магазина после обработки: " + store.Name);
    }
 }
