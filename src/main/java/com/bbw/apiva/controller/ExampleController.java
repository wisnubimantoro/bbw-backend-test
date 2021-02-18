//package com.bbw.apiva.controller;
//
//import com.bbw.apiva.dto.ExampleRequest;
//import org.jpos.iso.ISOException;
//import org.jpos.iso.ISOMsg;
//import org.jpos.q2.iso.QMUX;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class ExampleController {
//
//    @Autowired
//    private QMUX qmux;
//
//    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmss");
//
//    @PostMapping("/topup")
//    public Map<String , String> topUp(@RequestBody @Valid ExampleRequest request){
//
//        Map<String , String> hasil = new HashMap<>();
//
//        try {
//        ISOMsg isoMsg = new ISOMsg("0200");
//        isoMsg.set(4, request.getNilai().setScale(0).toString());
//        isoMsg.set(7, simpleDateFormat.format(new Date()));
//        isoMsg.set(11, "000123");
//
//        String bit48 = request.getMsiSdn().substring(0,4);
//        bit48 += String.format("%1$" + 13 + "s", request.getMsiSdn().substring(4));
//        System.out.println("Bit 48 : " + bit48);
//        isoMsg.set(48, bit48);
//
//        isoMsg.set(63, "131001");
//
//        ISOMsg isoResponse = qmux.request(isoMsg, 20*1000);
//
//            if (isoResponse == null) {
//                hasil.put("success", "false");
//                hasil.put("error", "timeout");
//                return hasil;
//            }
//
//        String response = new String(isoResponse.pack());
//
//        hasil.put("success", "true");
//        hasil.put("response_code", isoResponse.getString(39));
//        hasil.put("raw_message", response);
//        } catch (ISOException e) {
//            e.printStackTrace();
//        }
//
//        return hasil;
//    }
//}
