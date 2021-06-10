package com.dev.solana.api.kakao.ctr;

import com.dev.solana.api.kakao.svc.KakaoChatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/kakao")
@RestController
public class kakaoRestController {

    @Autowired
    KakaoChatBotService kakaoChatBotService;


    /**
     * 주석 내용
     * @param dbSaveOpt
     * @return
     */
    @GetMapping(value = {"/launch","/launch/test"})
    public List<Object> getRecomandLuanchMenu(@PathVariable(value = "dbSaveOption", required = false) Boolean dbSaveOpt) {

        if(dbSaveOpt == null){
            dbSaveOpt = false;
        }

        return kakaoChatBotService.getLuanchMenu();
    }
}
