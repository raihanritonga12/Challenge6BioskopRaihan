package com.binarchallenge4.demo.controller;

import com.binarchallenge4.demo.entity.FirebaseEntity;
import com.binarchallenge4.demo.service.FirebaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@Service
public class FirebaseController {

    private final FirebaseService firebaseService;

    public FirebaseController(FirebaseService firebaseService){
        this.firebaseService = firebaseService;
    }

    @RequestMapping("/kirimPesan")
    @ResponseBody
    public String sendNotification(@RequestBody FirebaseEntity note,
                                   @RequestParam String token)  {



        return firebaseService.sendNotification(note);
    }

}

