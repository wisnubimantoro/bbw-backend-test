package com.bbw.apiva.service.impl;

import com.bbw.apiva.dao.RequestDAO;
import com.bbw.apiva.domain.Request;
import com.bbw.apiva.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    RequestDAO requestDAO;

    @Override
    public Request makeRequest(){

        Request request = new Request();

        requestDAO.save(request);

        return request;
    }

    @Override
    public List<Request> getAllRequests(){

        List<Request> requests = requestDAO.findAll();

        return requests;
    }

    @Override
    public Request getRequestById(Integer id){

        Request request = requestDAO.getOne(id);

        return request;
    }
}
