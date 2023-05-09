package com.example.opggProject.service;

import java.io.IOException;

public interface OpggService {

    void getRecentInfo(String userId) throws IOException;

    void getAverageInfo(String userId) throws IOException;

}
