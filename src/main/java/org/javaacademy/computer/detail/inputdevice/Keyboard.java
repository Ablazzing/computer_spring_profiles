package org.javaacademy.computer.detail.inputdevice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression(value = "!${mouse.enabled} and !${touchpad.enabled}")
public class Keyboard implements InputDevice {
    @Override
    public void move() {
        System.out.println("Двигаем стрелку клавишами");
    }
}
