package com.dev.solana.api.kakao.svc.impl;

import com.dev.solana.api.kakao.svc.KakaoChatBotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class KakaoChatBotServiceImpl  implements KakaoChatBotService {


    /**
     * kakaoTalk API에서 필요한 정보 가져오기.
     * @return
     */
    @Override
    public List<Object> getLuanchMenu(){

        return null;
    };
}
