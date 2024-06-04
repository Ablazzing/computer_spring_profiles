package org.javaacademy.computer.detail.monitor;

import org.javaacademy.computer.detail.Computer;
import org.javaacademy.computer.detail.inputdevice.InputDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ComputerConfig {

    @Bean
    public Computer computer(Monitor monitor, InputDevice inputDevice) {
        return new Computer(monitor, inputDevice);
    }
}
