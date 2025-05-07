/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno
 */
public class TrianguloRetangulo {
    private float base;
    private float altura;
    private float area;

    public TrianguloRetangulo() {
    }

    public TrianguloRetangulo(float base, float altura, float area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea() {
        this.area = (this.base * this.altura)/2;
    }

    @Override
    public String toString() {
        return "TrianguloRetangulo{" + "base=" + base + ", altura=" + altura + ", area=" + area + '}';
    }
    
    
    
    
    
    
}
