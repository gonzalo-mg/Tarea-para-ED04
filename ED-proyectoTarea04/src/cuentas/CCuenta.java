package cuentas;

/**
 * Clase para la tarea. proporcionada en el enunciado
 *
 * @author enunciado
 * @since 2/3/2024
 * @version 1
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto
     *
     * @author enunciado
     * @since 2/3/2024
     * @version 1
     */
    public CCuenta() {
    }

    /**
     * Constructor general
     *
     * @author enunciado
     * @since 2/3/2024
     * @version 1
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * getter de estado
     *
     * @author enunciado
     * @since 2/3/2024
     * @version 1
     * @return saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * metodo ingresar, para aumentar el saldo
     *
     * @author enunciado
     * @since 2/3/2024
     * @version 1
     *
     * @param cantidad
     * @exception si se ingresa cantidad negativa
     * @return nuevo saldo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * metodo retirar, para reducir el saldo
     *
     * @author enunciado
     * @since 2/3/2024
     * @version 1
     * @param cantidad
     * @throws java.lang.Exception si se retira cantidad negativa o una cantidad mayor al saldo
     * actual
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * getter de nombre
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de cuenta
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setter de cuenta
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter de saldo
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter de saldo
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * getter de tipoInterés
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * setter de tipoIinteres
     *
     * @author gonzalo
     * @since 2/3/2024
     * @version 2
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
