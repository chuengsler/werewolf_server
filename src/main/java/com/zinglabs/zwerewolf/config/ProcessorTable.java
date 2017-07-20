package com.zinglabs.zwerewolf.config;

import java.util.HashMap;
import java.util.Map;

import com.zinglabs.zwerewolf.constant.ProtocolConstant;
import com.zinglabs.zwerewolf.controller.BaseController;

public class ProcessorTable {
    private static Map<Short,BaseController> table = new HashMap<>();
    static {
       // table.put(ProtocolConstant.SID_USER,new UserController());
        //table.put(ProtocolConstant.SID_MSG,new MessageController());
    }
    public static BaseController get(short code){
        return table.get(code);
    }
}
