/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Caminhao extends Veiculo{
    
    private int cargamaxima;
    private int alturamax;
    private int comprimento;

    public Caminhao(int cargamaxima, int alturamax, int comprimento, int quilos, int velocmax, float preco) {
        super(quilos, velocmax, preco);
        this.cargamaxima = cargamaxima;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public int getCargamaxima() {
        return cargamaxima;
    }

    public void setCargamaxima(int cargamaxima) {
        this.cargamaxima = cargamaxima;
    }

    public int getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    
}
