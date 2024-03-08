package fr.esgi.cleanbike.service.impl;

import fr.esgi.cleanbike.service.LectureVideoService;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

// Service de gestion de lecture de vidéo
@Service
@AllArgsConstructor
public class LectureVideoServiceImpl implements LectureVideoService {

    private JmsTemplate jmsTemplate;

    @Override
    public void modifierVitesse(float nombreToursMinute) {
        // On calcul la nouvelle vitesse et on l'envoi à l'activité Android correspondante
        double nouvelleVitesseLecture = this.calculerVitesse(nombreToursMinute);
        jmsTemplate.convertAndSend("LectureVideoActivity", nouvelleVitesseLecture);
    }

    private double calculerVitesse(float nombreToursMinute) {
        // Logique de calcul de la nouvelle vitesse à partir de la donnée récupérée du capteur
        return nombreToursMinute * 2.1 * 4;
    }
}
