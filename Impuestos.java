package impuestos;

public class Impuestos {
    private double consumo;
    private double tarifa;
    
    /**
     * La clase en la que se almacenan los dos parametros para calcular impuestos
     * @param consumo Se almancena el consumo de agua/luz
     * @param tarifa Se alamcena la tarifa de agua/luz
     */

    public Impuestos(double consumo, double tarifa) {
        this.consumo = consumo;
        this.tarifa = tarifa;
    }
    
    /**
     * Se multiplica tanto el consumo por la tarifa para calcular el impuesto de agua/luz
     * @return Devuelve el resultado del impuesto
     */

    public double calcularImpuesto() {
        return consumo * tarifa;
    }
    
    /**
     * Getter de la variable consumo
     * @return Devuelve el consumo
     */

    public double getConsumo() {
        return consumo;
    }
    
    /**
     * Setter de la variable consumo
     * @param consumo el parametro que se obtiene
     */

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    /**
     * Getter de la variable tarifa
     * @return Devuelve la tarifa
     */

    public double getTarifa() {
        return tarifa;
    }
    
    /**
     * Setter de la variable tarifa
     * @param tarifa el parametro que se obtiene
     */

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
