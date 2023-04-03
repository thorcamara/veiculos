/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Veiculo {
    
    private int quilos;
    private int velocmax;
    private float preco;

    public Veiculo(int quilos, int velocmax, float preco) {
        this.quilos = quilos;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public int getQuilos() {
        return quilos;
    }

    public void setQuilos(int quilos) {
        this.quilos = quilos;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
