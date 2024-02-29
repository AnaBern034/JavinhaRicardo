import java.text.ParseException;

public class main {

    public static void main(String[] args) throws ParseException {
        System.out.println("1- Ingressar na faculdade ou  2-Renovar Matricula");
        int number = Scan.sc.nextInt();

        switch (number){
            case 1: IngressarFaculdade.adicionarNaEscola();
            case 2:
        }

    }
}
