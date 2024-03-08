package fr.esgi.clean_bike.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import fr.esgi.clean_bike.service.LectureVideoService;

public class CadenceSensorReceiver implements SensorEventListener {

    LectureVideoService lectureVideoService;

    @Override
    public void onSensorChanged(SensorEvent event) {
        lectureVideoService.modifierVitesse(event.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
