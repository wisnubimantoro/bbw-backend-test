package com.bbw.apiva.service;

import com.bbw.apiva.domain.Request;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequestService {
    Request makeRequest();

    List<Request> getAllRequests();

    Request getRequestById(Integer id);
}
