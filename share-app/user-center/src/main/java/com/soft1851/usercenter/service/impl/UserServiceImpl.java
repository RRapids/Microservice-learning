package com.soft1851.usercenter.service.impl;

import com.soft1851.usercenter.domain.entity.User;
import com.soft1851.usercenter.dao.UserMapper;
import com.soft1851.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tengf
 * @Description:
 * @date: 2020/9/29 19:24
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);

    }

}
