package org.javaacademy.computer.detail.monitor;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sony")
public class MonitorSony extends Monitor {
    @Override
    public String toString() {
        return "MonitorSony{" +
               "name='" + name + '\'' +
               '}';
    }
}
