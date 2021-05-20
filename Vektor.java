/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author lazar
 */
public class Vektor 
{
    private double x,y;
    public void setX(double x)
    {
        this.x = x;
    }
    public double getX()
    {
        return x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getY()
    {
        return y;
    }
    public Vektor()
    {
        x = 0.0;
        y = 0.0;
    }
    public Vektor(Vektor b)
    {
        this.x = b.getX();
        this.y = b.getY();
    }
    public Vektor(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }    
    public void saberi(Vektor a)
    {
        this.x += a.getX();
        this.y += a.getY();
    }   
    public void Oduzmi(Vektor a)
    {
        this.x -= a.getX();
        this.y -= a.getY();
    }   
    public void skaliraj(double skalar)
    {
        this.x *= skalar;
        this.y *= skalar;
    }  
    public double intenzitet()
    {
        return Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
    }
    @Override
    public String toString() 
    {
            return "Vektor{" + "x=" + x + ", y=" + y + '}';
    }    
    public static Vektor unossatastature()
    {
        Scanner s = new Scanner(System.in);
        Vektor v = new Vektor();
        System.out.println("Unesi koordinate vektora u formatu x y");
        v.setX(s.nextDouble());
        v.setY(s.nextDouble());
        return v;
    }    
    public static void zamenimesta(Vektor a, Vektor b)
    {
        double tempX = a.getX();
        double tempY = a.getY();
        a.setX(b.getX());
        a.setY(b.getY());
        b.setX(tempX);
        b.setY(tempY);     
    } 
    public enum POREDAK {OPADAJUCI, RASTUCI};
    public enum KRITERIJUM {INTENZITET , X, Y}; 
    public static void sort(Vektor[] niz, POREDAK p, KRITERIJUM k )
    {
        if (p == POREDAK.RASTUCI)
        {
            if (k == KRITERIJUM.INTENZITET)
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].intenzitet() > niz[j+1].intenzitet())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
            else if (k == KRITERIJUM.X) 
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].getX() > niz[j+1].getX())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
            else if (k == KRITERIJUM.Y)
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].getY()> niz[j+1].getY())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
        }
        else if (p == POREDAK.OPADAJUCI)
        {
            if (k == KRITERIJUM.INTENZITET)
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].intenzitet() < niz[j+1].intenzitet())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
            else if (k == KRITERIJUM.X) 
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].getX() < niz[j+1].getX())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
            else if (k == KRITERIJUM.Y)
            {
                for (int i=0;i<niz.length-1;i++)
                {
                    for (int j=0;j<niz.length-1-i;j++)
                    {
                        if (niz[j].getY() < niz[j+1].getY())
                        {
                            Vektor.zamenimesta(niz[j], niz[j+1]);
                        }
                    }
                }
            }
        }
    }
    
}
