/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt;

/**
 *
 * @author Mateusz
 */
public interface State {
    ElectronHead ElectronHead = new ElectronHead();
    Conductor Conductor  = new Conductor();
    ElectronTail ElectronTail = new ElectronTail();
    Insulator Insulator = new Insulator();
    
    
    State nextState (int x, int y, TableBoard board);
}
