package ACT9_1B;

import ACT9_1A.*;

/**
 *
 * @author winadmin
 */
public interface DispositiuElectronic {
    // boolean onOff = true; // No podem posar un atribut a 'DispositiuElectronic',
                             // ja que aquest no es comportarÓ com a una Constant !!
    
    abstract public void on();  // Activar a ON
    abstract public void off();  // Activar a OFF
}
