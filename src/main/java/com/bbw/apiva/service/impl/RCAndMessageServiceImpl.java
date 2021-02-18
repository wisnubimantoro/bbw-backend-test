package com.bbw.apiva.service.impl;

import com.bbw.apiva.dao.RCAndMessageDAO;
import com.bbw.apiva.domain.RCAndMessage;
import com.bbw.apiva.dto.RcmDTO;
import com.bbw.apiva.response.RCMResponse;
import com.bbw.apiva.service.RCAndMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RCAndMessageServiceImpl implements RCAndMessageService {

    @Autowired
    RCAndMessageDAO rcAndMessageDAO;

    @Override
    public RCAndMessage makeRequest(RcmDTO rcmDTO){

        RCAndMessage rcAndMessage = new RCAndMessage();

        rcAndMessage.setRc(rcmDTO.getRc());
        rcAndMessage.setMessage(rcmDTO.getMessage());

        rcAndMessageDAO.save(rcAndMessage);

        return rcAndMessage;
    }

    @Override
    public RCMResponse getRequestByCondition(Integer rcID){

        RCMResponse rcmResponse = new RCMResponse();

        Integer rc = rcAndMessageDAO.getOne(rcID).getRc();
        String message = rcAndMessageDAO.getOne(rcID).getMessage();

        rcmResponse.setRc(rc);
        rcmResponse.setMessage(message);

        return rcmResponse;
    }
}
