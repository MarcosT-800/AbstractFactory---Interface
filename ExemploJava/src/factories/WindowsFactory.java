/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import checkboxes.Checkbox;
import checkboxes.WindowCheckbox;
import exemplojava.buttons.Button;
import exemplojava.buttons.WindowsButton;

/**
* Cada fábrica de concreto amplia a fábrica básica e é responsável pela criação
* produtos de uma única variedade.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}