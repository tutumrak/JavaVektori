
package com.mycompany.mavenproject1;
import java.util.Scanner;

public class NewMain {

   
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("Unesi broj elemenata niza");
        n = s.nextInt();
        Vektor[] niz = new Vektor[n];
        for (int i=0;i<n;i++)
        {         
            niz[i] = Vektor.unossatastature();           
        }
        Vektor.sort(niz, Vektor.POREDAK.OPADAJUCI, Vektor.KRITERIJUM.X);  //2 3 1 2 5 2 3 1
        for (int i=0;i<n;i++)
        {
            System.out.println(niz[i].getX());
        }
    }

}
    
    







