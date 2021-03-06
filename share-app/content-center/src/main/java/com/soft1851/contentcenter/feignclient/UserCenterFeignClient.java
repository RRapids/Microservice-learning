package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.common.ResponseResult;
import com.soft1851.contentcenter.configuration.UserCenterFeignConfiguration;
import com.soft1851.contentcenter.domain.dto.UserAddBonusMsgDTO;
import com.soft1851.contentcenter.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author tengf
 * @Description:
 * @date: 2020/9/29 19:04
 */
@FeignClient(name = "user-center",configuration = UserCenterFeignConfiguration.class)
public interface UserCenterFeignClient {
    /**
     * http://user-center/users/{id}
     *
     * @param id
     * @return UserDTO
     */
    @GetMapping("/users/{id}")
    UserDTO findUserById(@PathVariable Integer id);

    /**
     * 添加积分记录
     *
     * @param userAddBonusMsgDTO
     * @return
     */
    @PostMapping("/users/bonus/new")
    ResponseResult addBonus(@RequestBody UserAddBonusMsgDTO userAddBonusMsgDTO);

    /**
     * hello测试
     * @return String
     */
    @GetMapping("/user/hello")
    String getHello();}
