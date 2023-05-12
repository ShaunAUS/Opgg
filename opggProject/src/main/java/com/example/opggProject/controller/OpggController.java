package com.example.opggProject.controller;

import com.example.opggProject.service.OpggService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpggController {

    private final OpggService opggService;

    @GetMapping("/search/freeRank/{userId}")
    public void freeRankRecord(
        @PathVariable("userId") String userId
    ) throws IOException {
        opggService.getFreeRankInfo(userId);
    }

    @GetMapping("/search/soloRank/{userId}")
    public void soloRankRecord(
        @PathVariable("userId") String userId
    ) throws IOException {
        opggService.getSoloRankInfo(userId);
    }

    @GetMapping("/search/year/{userId}")
    public void yearRecord(
        @PathVariable("userId") String userId
    ) throws IOException {
        opggService.getYearInfo(userId);
    }
}


