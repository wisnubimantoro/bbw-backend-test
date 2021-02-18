package com.bbw.apiva.service;

import com.bbw.apiva.domain.RCAndMessage;
import com.bbw.apiva.dto.RcmDTO;
import com.bbw.apiva.response.RCMResponse;
import org.springframework.stereotype.Service;

@Service
public interface RCAndMessageService {
    RCAndMessage makeRequest(RcmDTO rcmDTO);

    RCMResponse getRequestByCondition(Integer rcID);
}
