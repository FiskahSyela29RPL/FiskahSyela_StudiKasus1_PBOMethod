/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

import java.util.Scanner;

/**
 *
 * @author Fiskah Syela 29 RPL
 */
public class Segitiga { //membuat class segitiga
    double inputTinggi, inputAlas, hitung, hasil;//membuat attributes 
     
    void input (){ //method void untuk memasukkan nilai dari tinggi dan alas segitiga
    
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Segitiga :" + " ");
        inputTinggi = masuk.nextDouble();
            System.out.println("Masukkan Alas Segitiga : " + " ");
            inputAlas = masuk.nextDouble();      
    }
    
    void hitung (){//membuat method untuk menghitung nilai luas segitiga
        System.out.println("Tinggi segitiga adalah :" +" " +inputTinggi);  
        System.out.println("Alas segitiga adalah   :" +" " +inputAlas);
        hasil = 0.5*inputAlas*inputTinggi; //menghitung luas segitiga        
    }
     
    double hasil (){ //membuat method non void untuk menampilkan hasil
        System.out.print("Luas segitiga adalah   :" +" ");
        return hasil;
    }
}
