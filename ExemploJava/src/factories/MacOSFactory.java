/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;
import exemplojava.buttons.Button;
import exemplojava.buttons.MacOSButton;

/**
 * Cada fábrica de concreto amplia a fábrica básica e é responsável pela criação
 *produtos de uma única variedade.
 * @author FATEC ZONA LESTE
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
