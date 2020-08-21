/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesComDoisNumeros;

/**
 *
 * @author aluno
 */
public class NaoehPar extends Exception {

    
    public NaoehPar() {
        super("O numero precisa ser par!");
    }

    
    public NaoehPar(String msg) {
        super(msg);
    }
}
