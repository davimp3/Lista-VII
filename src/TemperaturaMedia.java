
import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturaMedia {
    
    private final ArrayList<Double> temperatura = new ArrayList<>();
    private final ArrayList<String> meses = new ArrayList<>();
    private boolean temperaturaLoop;
    private double temperaturaDigitada;
    private double somaTotal;
    private double media;
    private String controleLoop;



        public TemperaturaMedia(){
            this.temperaturaLoop = true;
            this.temperaturaDigitada = 0;
            this.somaTotal = 0;
            this.media = 0;
        }

            public void obtendoMedia(){
                  
                        try(Scanner scanner = new Scanner(System.in)){

                           
                            do{ 
                                System.out.println("Digite a temperatura dos meses de forma crescente, ex: Jan, Fev...");
                                temperaturaDigitada = scanner.nextDouble();
                                scanner.nextLine();
                                temperatura.add(temperaturaDigitada);

                                System.out.println("Gostaria de adicionar mais meses? [S | N]?");
                                    controleLoop = scanner.nextLine();
                                        if(controleLoop.equalsIgnoreCase("N")){
                                            temperaturaLoop = false;
                                        }
                            } while (temperaturaLoop);
                        }

                        for(double temperaturaMensal: temperatura){
                         somaTotal =  temperaturaMensal + somaTotal;
                        }

                        media = somaTotal/temperatura.size();

                        System.out.println("Total de meses atribuidos:"+" "+temperatura.size()+" "+"Media dos meses atribuidos:"+" "+media);
                        
                        
                        meses.add("Janeiro"); 
                        meses.add("Fevereiro");
                        meses.add("Março");
                        meses.add("Abril");
                        meses.add("Maio");
                        meses.add("Junho");
                        meses.add("Julho");
                        meses.add("Agosto");
                        meses.add("Setembro");
                        meses.add("Outubro");
                        meses.add("Novembro");
                        meses.add("Dezembro");

                       int id = 0;
                        System.out.println("Mensal: \n");
                        do {System.out.println(meses.get(id)+" = "+temperatura.get(id)+"°"); id++;}
                        while (id < temperatura.size());

            
                

            }

    
}
