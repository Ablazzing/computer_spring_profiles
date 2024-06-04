package org.javaacademy.computer.detail;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.javaacademy.computer.detail.inputdevice.InputDevice;
import org.javaacademy.computer.detail.monitor.Monitor;
import org.springframework.stereotype.Component;

@ToString
@AllArgsConstructor
public class Computer {
    private Monitor monitor;
    private InputDevice inputDevice;
}
