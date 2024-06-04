package org.javaacademy.computer.detail.inputdevice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "mouse.enabled", havingValue = "true")
public class Mouse implements InputDevice {
    @Override
    public void move() {
        System.out.println("двигается мышка");
    }
}
