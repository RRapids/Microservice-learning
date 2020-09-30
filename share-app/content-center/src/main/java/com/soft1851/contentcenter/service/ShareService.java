package com.soft1851.contentcenter.service;


import com.soft1851.contentcenter.domain.dto.ShareDto;

/**
 * @ClassName ShareService
 * @Description TODO
 * @Author hyj
 * @Date 2020/9/26
 **/
public interface ShareService {
    /**
     * 获得分享详情
     * @return  ShareDTO
     */
    ShareDto findById(Integer id);

    String getHello();
}
