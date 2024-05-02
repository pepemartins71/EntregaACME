
import java.util.*;

/**
 * 
 */
public class Pedido {

    /**
     * Default constructor
     */
    public Pedido() {
    }

    /**
     * 
     */
    private Produto produto;

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private float valor;

    /**
     * 
     */
    private String formaPagamento;

    /**
     * 
     */
    private int parcelas;

    /**
     * @return
     */
    public boolean verificarDisponibilidade() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public float informarValor() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public String solicitarFormaPagamento() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int solicitarNumParcelas() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public void emitirCobrança() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void cancelarPedido() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean pagarPedido() {
        // TODO implement here
        return false;
    }

}