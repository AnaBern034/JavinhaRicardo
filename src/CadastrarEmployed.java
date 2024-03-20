import funcionarios.Employed;
import inter.IEmployed;

public class CadastrarEmployed implements IEmployed {

   private Employed employed = new Employed();

    public CadastrarEmployed() {
    }

    public CadastrarEmployed(Object obej) {
        employed = (Employed) obej;
    }
    private Employed  nenhumUsuarioCadastrado (Employed employed1){
        System.out.println("Não foi possivel sua contratação");
        return employed1;
    }

    @Override
    public double definirSalario(Employed objeto) {

      if(objeto.getNivel().equalsIgnoreCase("Estagiário")){
          objeto.setSalario(1.200);
      } else if (   objeto.getNivel().equalsIgnoreCase("Junior") ) {
           objeto.setSalario(4.000);
      } else if ( objeto.getNivel().equalsIgnoreCase("Pleno")) {
           objeto.setSalario(8.000);
      } else if (objeto.getNivel().equalsIgnoreCase("Senior")) {
           objeto.setSalario(12.000);
      }else {
          System.out.println("Você não esta qualificado");
      }
        return objeto.getSalario();
    }
}

/*  @Override
    public double definirSalario(Object objeto) {

        employed = (Employed) objeto;
      objeto = ((Employed) objeto).getNivel().equalsIgnoreCase("Estagiário") ? objeto.setSalario(1.200) :
              objeto.getNivel().equalsIgnoreCase("Junior") ? objeto.setSalario(4.000) :
                      objeto.getNivel().equalsIgnoreCase("Pleno") ? objeto.setSalario(8.000) :
                              objeto.getNivel().equalsIgnoreCase("Senior") ? objeto.setSalario(12.000) :  nenhumUsuarioCadastrado(objeto);

 */
