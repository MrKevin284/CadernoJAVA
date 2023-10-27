public class GastoTrimestral {
        public static void main(String[] args) {

      double Jan = 15000;
      double Fev = 23000;
      double Mar = 17000;

      double balanco = Jan + Fev + Mar;
      double orcamento = 50000;

            System.out.println(balanco);
      if(balanco < orcamento){
          System.out.println("Estamos dentro do orçamento previsto para o trimestre.");
      } else {
          System.out.println("Passamos do orçamento previsto para o trimestre.");
    }
}
}
