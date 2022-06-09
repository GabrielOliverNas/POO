import static java.lang.Double.valueOf;
import static java.lang.String.format;

public class SpringBootApplication {

  private static final Integer VALOR_HORA = 60;
  private static final Integer VALOR_KM = 1000;

  public static void main(String[] args) {
    var tempoAcionamentoMin = valueOf(1);
    var distanciaPercorridaMetro = 4.0;

    final Double velocidadeKm =
        calcularVelocidadeMin(distanciaPercorridaMetro, tempoAcionamentoMin);

    System.out.println(format("A velocidade atual é de %.2f", velocidadeKm) + "Km/H");
  }

  private static Double calcularVelocidadeMin(
      Double distanciaPercorridaMetro, Double tempoAcionamentoMin) {
    var tempoAcionamentoHoras = minutosParaHora(tempoAcionamentoMin);

    return calcularVelocidadeKm(
        calcularKmPorMetros(distanciaPercorridaMetro), tempoAcionamentoHoras);
  }

  private static Double minutosParaHora(Double tempoAcionamentoMin) {
    return tempoAcionamentoMin / VALOR_HORA;
  }

  private static Double calcularVelocidadeKm(Double kmMetro, Double tempoAcionamentoHoras) {
    return kmMetro / tempoAcionamentoHoras;
  }

  private static Double calcularKmPorMetros(Double metros) {
    return metros / VALOR_KM;
  }
}
