/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cs321.team4.easymac.interfaces;

/**
 * Class that manages the running of the macro????
 *
 * @author Liam Kilpatrick
 */
public interface IActionCanceller {

    /**
     * Assigns a Boolean value to indicate if the macro has stopped running.
     */
    public void cancelAction();

    /**
     * Returns a Boolean value to indicate if the macro is still running.
     *
     * @return the Boolean if the running of macro has ended.
     */
    public boolean actionCancelled();
}
