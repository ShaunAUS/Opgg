package com.example.opggProject.controller;

import com.example.opggProject.service.OpggService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpggController {

    private final OpggService opggService;

    //최근 5게임 전적 크롤링
    @GetMapping("/search/recent/{userId}")
    public void recentRecord(
        @PathVariable("userId") String userId
    ) throws IOException {
        opggService.getRecentInfo(userId);
    }

    //해당 년도 평균 크롤링
    @GetMapping("/search/average/{userId}")
    public void averageRecord(
        @PathVariable("userId") String userId
    ) throws IOException {
        opggService.getAverageInfo(userId);
    }
}


