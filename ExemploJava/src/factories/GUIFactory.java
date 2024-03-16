/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import checkboxes.Checkbox;
import exemplojava.buttons.Button;

/**
 * A fábrica abstrata conhece todos os tipos de produtos (abstratos).
 * @author FATEC ZONA LESTE
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}