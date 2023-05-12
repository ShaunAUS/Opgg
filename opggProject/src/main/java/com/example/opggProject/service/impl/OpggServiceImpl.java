package com.example.opggProject.service.impl;

import com.example.opggProject.service.OpggService;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class OpggServiceImpl implements OpggService {

    @Override
    public void getFreeRankInfo(String userId) throws IOException {
        getOpggInfoByUserId(userId);

    }


    @Override
    public void getSoloRankInfo(String userId) throws IOException {
        getOpggInfoByUserId(userId);
    }

    @Override
    public void getYearInfo(String userId) {

    }

    private static void getOpggInfoByUserId(String userId) throws IOException {
        String url = "https://www.op.gg/summoners/kr/" + userId;
        Document document = Jsoup.connect(url).get();
    }
}
