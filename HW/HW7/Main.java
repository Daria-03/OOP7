package HW.HW7;

import HW.HW7.DataBase.Store;
import HW.HW7.NewSensor.STinfo;
import HW.HW7.NewSensor.SensorTemperature;
import HW.HW7.OldSensor.Ms200;
import HW.HW7.OldSensor.MeteoSensor;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с
    // этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от
    // предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        Store meteoDb = new Store();

        MeteoSensor ms200_1 = new Ms200(1);
        meteoDb.save(ms200_1);

        SensorTemperature sensorTemperature = new STinfo().getData();
        STinfoAdapter stinfoAdapter = new STinfoAdapter(sensorTemperature);
        meteoDb.save(stinfoAdapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные
        // отправить в метод save объекта meteoDb
    }
}