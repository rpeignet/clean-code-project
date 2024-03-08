package fr.esgi.cleanbike.sensor;

import fr.esgi.cleanbike.service.LectureVideoService;
import lombok.AllArgsConstructor;

/*
* Cette classe gère la réception des données du capteur de cadence.
* Elle est censé implémenter l'interface SensorEventListener (librairie Android)
* ainsi que les méthodes de cette interface.
*
* Les méthodes onCreate, onSensorChanged
* sont donc censé être overridées.
*
* */
@AllArgsConstructor
public class CadenceSensorReceiver /* implements SensorEventListener */ {
    // Injection du LectureVideoService
    private LectureVideoService lectureVideoService;

    //@Override
    protected void onCreate(/*Bundle savedInstanceState*/) {
        // Logique de configuration du sensor
    }

    //@Override
    public void onSensorChanged(/*SensorEvent event*/) {
        // Appel de la fonction modifierVitesse de l'interface du lectureVideoService
        // en passant en paramètre la valeur récupérée de event (ici 60 tours minutes pour l'exemple).
        lectureVideoService.modifierVitesse(60);
    }

}
