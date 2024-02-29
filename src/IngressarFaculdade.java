import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class IngressarFaculdade {

    public static void adicionarNaEscola() {
       Exame porcentagem = new Exame();

      porcentagem.Quiz();
      double bolsa = porcentagem.porcentagemAcertos >= 60 && porcentagem.porcentagemAcertos <= 79 ? bolsa = 0.30 :
             porcentagem.porcentagemAcertos >= 80 && porcentagem.porcentagemAcertos <= 94 ? bolsa = 0.40 :
             porcentagem.porcentagemAcertos >= 94  ? bolsa = 0.50 : 0;
            //fazer a pergunta do (||)

        double mensalidade = 400.00;
        double valorTotal = mensalidade * bolsa ;
        mensalidade = 400-valorTotal;
        Mensagens();

        System.out.println(String.format("Você foi matriculado com sucesso. Bolsa de %.2f%%. " +
                "Valor total de: %.2f%%. ", bolsa,mensalidade));
    }

    private static DocumentCollege Mensagens() {
        System.out.println("Digite o seu nome");
        String nome = Scan.sc.next();
        System.out.println("Digite sua data de nascimento");
        String dataNascimento  = Scan.sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentodate = LocalDate.parse(dataNascimento, formatter);

        if (!verificaMaiorIdade(dataNascimentodate)){
            System.out.println("Digite o nome dos seus responsavéis");
            String nomeResponsa = Scan.sc.next();
           return new DocumentCollege(nome,nomeResponsa,dataNascimentodate);
        } else {
            return new DocumentCollege(nome, dataNascimentodate);
        }
    }
    private static boolean verificaMaiorIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        return idade >= 18;
    }
}
