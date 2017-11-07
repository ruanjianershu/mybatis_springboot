/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017年10月25日 上午10:35:31   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.service.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suixingpay.mybatis.core.orm.demo.domain.UserTest;
import com.suixingpay.mybatis.core.service.demo.impl.UserTestService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**  
 * TODO
 * @author: liyang[li_yang@suixingpay.com]
 * @date: 2017年10月25日 上午10:35:31
 * @version: V1.0
 * @review: liyang[li_yang@suixingpay.com]/2017年10月25日 上午10:35:31
 */
@RestController
@RequestMapping("users/user")
@Slf4j
public class UserTestController {
    
    @Autowired
    private UserTestService userTestService;

    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @RequestMapping(value="add", method=RequestMethod.POST)
    public String add(UserTest user, HttpServletRequest request) {
        log.info("this is v1 新增逻辑");
        log.info("this is v1"+ request.getRequestURL());
        
        userTestService.save(user);
        return "success";
    }
    
    @ApiOperation(value="查询用户", notes="根据User对象查询用户")
    @RequestMapping(value="find", method=RequestMethod.GET)
    public UserTest findOne(String uuid, HttpServletRequest request) {
        log.info("this is v1 新增逻辑");
        log.info("this is v1"+ request.getRequestURL());
        
        return userTestService.findOne(uuid);
    }
    
    @ApiOperation(value="更新用户", notes="根据User对象更新用户")
    @RequestMapping(value="update", method=RequestMethod.POST)
    public String update(UserTest user, HttpServletRequest request) {
        log.info("this is v1 新增逻辑");
        log.info("this is v1"+ request.getRequestURL());
        
        userTestService.update(user);
        
        return "success";
    }
    
    @ApiOperation(value="删除用户", notes="根据User对象删除用户")
    @RequestMapping(value="delete", method=RequestMethod.DELETE)
    public String delete(String uuid, HttpServletRequest request) {
        log.info("this is v1 新增逻辑");
        log.info("this is v1"+ request.getRequestURL());
        
        userTestService.delete(uuid);
        
        return "success";
    }
}
