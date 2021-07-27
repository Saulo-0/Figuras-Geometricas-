package ATVpoo;

import java.util.Scanner;
public class EsquerdaAplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        EsquerdaOO esq = new EsquerdaOO();

        esq.setComandos(ler.nextDouble());
        if(esq.getComandos()> 1000 || esq.getComandos() <= 0){
        System.out.println(" Nº inválido, tente outro de 1 a 1000.");
        }
        esq.setPosicao(ler.next());
        esq.ContadorLetras();
        esq.Soma_e_Divisao();
        esq.CalculandoDirecao();
        //DIRETA
        if(esq.getConta1() == -3){
            System.out.println("L");
        }
        else if(esq.getConta1() == -2){
            System.out.println("S");
        }
        else if(esq.getConta1() == -1){
            System.out.println("O");
        }
        else if(esq.getConta1() == 0){
            System.out.println("N");
        }
        //ESQUERDA
        if(esq.getConta2() == 3){
            System.out.println("O");
        }
        else if(esq.getConta2() == 2){
            System.out.println("S");
        }
        else if(esq.getConta2() == 1){
            System.out.println("L");
        }
        else if(esq.getConta2() == 0){
            System.out.println("N");
        }
    }


    }
