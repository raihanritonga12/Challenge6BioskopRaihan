package com.binarchallenge4.demo.service;

import com.binarchallenge4.demo.entity.FirebaseEntity;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    public String sendNotification(FirebaseEntity note) {
        Notification notification = Notification
                .builder()
                .setTitle(note.getSubject())
                .setBody(note.getContent())
                .setImage(note.getImage())
                .build();

        return notification+"Message sudah di output";
    }
}