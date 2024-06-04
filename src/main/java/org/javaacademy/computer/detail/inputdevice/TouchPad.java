package org.javaacademy.computer.detail.inputdevice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "touchpad.enabled", havingValue = "true")
public class TouchPad implements InputDevice {
    @Override
    public void move() {
        System.out.println("Двигаем пальцем по тачпаду");
    }
}
