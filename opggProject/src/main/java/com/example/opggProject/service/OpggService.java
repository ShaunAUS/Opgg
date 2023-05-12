package com.example.opggProject.service;

import java.io.IOException;

public interface OpggService {

    void getFreeRankInfo(String userId) throws IOException;

    void getSoloRankInfo(String userId) throws IOException;

    void getYearInfo(String userId);
}
