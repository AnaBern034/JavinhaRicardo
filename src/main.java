import funcionarios.Employed;

import java.text.ParseException;

public class main {
    public static void main(String[] args) {
    Employed cadu = new Employed("Cadu","junior") ;


    CadastrarEmployed cadastro = new CadastrarEmployed();

    cadastro.definirSalario(cadu);
    System.out.println("Salario é igual: "+cadu.getSalario());

    }
}
