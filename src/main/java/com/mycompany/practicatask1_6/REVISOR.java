/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatask1_6;

/**
 *
 * @author User
 */
public class REVISOR {

   public void closeStore(Store store){
        if (store.Name.equals("IKEA")) {
            store.Name = "null";
        }
    }

    public void rebrand(Store store){
        if (store.Name.equals("MacDonalds")) {
            store.Name = "Вкусно и точка";
        }else{
            if (store.Name != "null"){
                store.Name = store.Name.substring(1);
            }
        }
    }
}
