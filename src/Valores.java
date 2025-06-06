import java.util.ArrayList;
import java.util.Scanner;

public class Valores {
    private final ArrayList<Double> armazenamentoMediaMenor = new ArrayList<>();
    private final ArrayList<Double> armazenamentoMediaMaior = new ArrayList<>();
    private ArrayList<Double> notas = new ArrayList<>();
    private double nota;
    private double operacaoTotal;
    private double soma;
    private double media;
    private boolean continuar;

        public Valores(){
            this.nota = 0;
            this.operacaoTotal = 0;
            this.soma = 0;
            this.media = 0;
            this.continuar = true;
        }

                public void calculandoValores(){

                    try(Scanner scanner = new Scanner(System.in)){

                        do{
                            System.out.println("Adicione as notas desejados:");
                                nota = scanner.nextDouble();
                                notas.add(nota);
                                
                                    if(nota <= -1) {
                                        continuar = false;
                                        System.out.println("Processando entrada de dados...");
                            } 
   
                        } while (continuar);
                    }

                    for(double valores: notas){
                        operacaoTotal = valores+operacaoTotal;
                    }
                    System.out.println("Soma total dos valores:"+" "+operacaoTotal);

                    media = operacaoTotal/notas.size();

                    System.out.println("Valores registrados:"+" "+notas.size()+"Média dos valores:"+" "+media);
                 
                    for(double valores : notas){
                            if( valores >= media){
                                   armazenamentoMediaMaior.add(valores);
                                    System.out.println("Quantidade de valores acima da media calculada:"+" "+armazenamentoMediaMaior); 
                            }  else if(valores <= media){ 
                                    armazenamentoMediaMenor.add(valores);
                                    System.out.println("Valores abaixo da media:"+" "+armazenamentoMediaMenor);
                            }
                    }
                }
}
