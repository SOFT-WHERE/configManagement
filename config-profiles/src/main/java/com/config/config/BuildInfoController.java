package com.config.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RefreshScope
public class BuildInfoController {

    @Value("${build.id:default}")
    private String buildId;

    @Value("${build.version:default}")
    private String buildVersion;

    @Value("${build.name:default}")
    private String buildName;

    @GetMapping("/build-info")
    public String getBuildInfo(){
        return "BuildID:-"+buildId+" | "+"BuildName:-"+buildName+" | "+"BuildVersion:-"+buildVersion;
    }

//    private BuildInfo buildInfo;

//    @GetMapping("/build-info")
//    public String getBuildInfo(){
//        return "BuildID:-"+buildInfo.getId()+" | "+"BuildName:-"+buildInfo.getName()+" | "+"BuildVersion:-"+buildInfo.getVersion();
//    }
}
