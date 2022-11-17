package com.binarchallenge4.demo.controller;

import com.binarchallenge4.demo.entity.FirebaseEntity;
import com.binarchallenge4.demo.service.FirebaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation(summary="Ini untuk mengirim pesan")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "Berhasil mengirim pesan",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Gagal mengirim pesan",
                    content = @Content)
    })

    @RequestMapping("/kirimPesan")
    @ResponseBody
    public String sendNotification(@RequestBody FirebaseEntity note,
                                   @RequestParam String token)  {



        return firebaseService.sendNotification(note);
    }

}

