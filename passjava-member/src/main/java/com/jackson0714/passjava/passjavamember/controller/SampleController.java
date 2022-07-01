package com.jackson0714.passjava.passjavamember.controller;

import com.jackson0714.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("member/sample")
public class SampleController {

    @Value("${member.nickname}")
    private  String nickname;

    @Value("${member.age}")
    private  Integer age;

    @RequestMapping("/test-local-config")
    public R testLocalConfig() {
        return R.ok().put("nickname", nickname).put("age", age);
    }
}
