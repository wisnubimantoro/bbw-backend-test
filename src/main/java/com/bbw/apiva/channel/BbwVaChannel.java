package com.bbw.apiva.channel;

import org.jpos.iso.BaseChannel;
import org.jpos.iso.ISOException;

import java.io.IOException;

public class BbwVaChannel extends BaseChannel {

    @Override
    protected void sendMessageLength(int len) throws IOException {
        serverOut.writeShort(len + 2);
    }

    @Override
    protected int getMessageLength() throws IOException, ISOException {
        int len = serverIn.readShort();
        if(len < 2){
            return 0;
        }
        return len - 2;
    }

}
