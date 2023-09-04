package HW.HW7.OldSensor;

import java.time.*;

public class Ms200 implements MeteoSensor {
    int id;

    public Ms200(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Float getTemperature() {
        return (float) 20;
    }

    public Float getHumidity() {
        return (float) 60;
    }

    public Float getPressure() {
        return (float) 752.4;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}