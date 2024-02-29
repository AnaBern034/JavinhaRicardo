public class Exame {
    double porcentagemAcertos;
    public  double Quiz() {
        // Definindo as perguntas e respostas
        String[] perguntas = {
                "Qual é a capital do Brasil? ",
                "Qual é a cor do céu em um dia ensolarado? ",
                "Quanto é 2 + 2? ",
                "Quantos meses têm um ano? ",
                "Quem escreveu 'Dom Quixote'? "
        };
        String[] respostas = {
                "brasília",
                "azul",
                "4",
                "12",
                "a"
        };

        // Inicializando variáveis para contagem de acertos
        int acertos = 0;

        // Fazendo as perguntas
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            String resposta = Scan.sc.next();
            // Verificando se a resposta está correta
            if (resposta.equals(respostas[i])) {
                acertos++;
            }
        }

        // Calculando a nota e a porcentagem de acertos
        int totalPerguntas = perguntas.length;
        double nota = (double) acertos / totalPerguntas * 10;
         porcentagemAcertos = (double) acertos / totalPerguntas * 100;

        // Apresentando a nota e a porcentagem de acertos
        System.out.println("\nNota: " + nota);
        System.out.println("Porcentagem de acertos: " + porcentagemAcertos + "%");

        return porcentagemAcertos;
    }

    public void setPorcentagemAcertos(double porcentagemAcertos) {
        this.porcentagemAcertos = porcentagemAcertos;
    }
    public void AdicionarBolsa(){

    }
}
