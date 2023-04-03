/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author User
 */
import Model.Veiculo;
import Model.CarroPasseio;
import Model.Caminhao;


public class Principal {
    
     public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo(1000, 160, 137000);
        CarroPasseio carropasseio1 = new CarroPasseio("preto", "palio", 1500, 190, 140000);
        Caminhao caminhao1 = new Caminhao(23, 5, 14, 14, 100, 70000);
        
        System.out.println("----- Veiculo 1 ----- \n\n"+"Peso: "+veiculo1.getQuilos()+" quilos\n"+"Velocidade Maxima: "+veiculo1.getVelocmax()+" Km/h\n"+"Preco: R$ "+veiculo1.getPreco()+"\n");
        
        System.out.println("----- Carro Passeio 1 ----- \n\n"+"Cor: "+carropasseio1.getCor()+"\nModelo: "+carropasseio1.getModelo()+"\nPeso: "+carropasseio1.getQuilos()+" quilos\n"+"Velocidade Maxima: "+carropasseio1.getVelocmax()+" Km/h\n"
                +"Preco: R$ "+carropasseio1.getPreco()+"\n");
        System.out.println(("----- Caminhao 1 ----- \n\n"+"Carga: "+caminhao1.getCargamaxima()+"\nAltura Maxima: "+caminhao1.getAlturamax()+"\nComprimento: "+caminhao1.getComprimento()+"\nPeso: "+caminhao1.getQuilos()+" quilos\n"+"Velocidade Maxima: "+caminhao1.getVelocmax()+" Km/h\n"
                +"Preco: R$ "+caminhao1.getPreco()+"\n"));
    }
    

}
