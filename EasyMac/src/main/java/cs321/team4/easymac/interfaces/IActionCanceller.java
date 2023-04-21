/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cs321.team4.easymac.interfaces;

/**
 * Interface that allows cancelling the macro during runtime.
 *
 * @author Liam Kilpatrick
 */
public interface IActionCanceller {

    /**
     * Used to trigger the cancellation process, synchronized with actionCancelled when implemented.
     */
    public void cancelAction();

    /**
     * Returns a Boolean value to indicate if the macro is queued for cancellation.
     *
     * @return the Boolean if the running of macro is queued for cancellation.
     */
    public boolean actionCancelled();
}
