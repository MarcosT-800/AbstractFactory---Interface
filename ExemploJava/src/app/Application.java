/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 2025
 */
package app;

import checkboxes.Checkbox;
import exemplojava.buttons.Button;
import factories.GUIFactory;

/**
 *
 *
 * Os usuários da fábrica não se importam com qual fábrica de concreto eles usam, pois trabalham com
 * fábricas e produtos através de interfaces abstratas.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
