package HW.HW7;
import java.time.LocalDateTime;

import HW.HW7.NewSensor.SensorTemperature;
import HW.HW7.OldSensor.MeteoSensor;

public class STinfoAdapter implements MeteoSensor {

  private SensorTemperature sensorTemperatureAdapter;

  public STinfoAdapter(SensorTemperature sensorTemperatureAdapter) {
    this.sensorTemperatureAdapter = sensorTemperatureAdapter;
  }

  @Override
  public int getId() {
    return sensorTemperatureAdapter.identifier();
  }

  @Override
  public Float getTemperature() {
    return (float) sensorTemperatureAdapter.temperature();
  }

  @Override
  public Float getHumidity() {
    return null;
  }

  @Override
  public Float getPressure() {
    return null;
  }

  @Override
  public LocalDateTime getDateTime() {
    LocalDateTime localDateTime = LocalDateTime.of(sensorTemperatureAdapter.year(), 1, 1, 0, 0);
    localDateTime = localDateTime.plusDays(sensorTemperatureAdapter.day() - 1);
    localDateTime = localDateTime.plusSeconds(sensorTemperatureAdapter.second());
    return localDateTime;

  }

}