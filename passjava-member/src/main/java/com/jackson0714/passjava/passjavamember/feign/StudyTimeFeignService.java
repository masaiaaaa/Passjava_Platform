package com.jackson0714.passjava.passjavamember.feign;

import com.jackson0714.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("passjava-study")
public interface StudyTimeFeignService {

    @RequestMapping("study/studytime/member/list/test")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id);
}
