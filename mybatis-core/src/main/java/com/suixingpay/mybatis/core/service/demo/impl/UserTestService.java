/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017年10月25日 上午10:09:22   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.core.service.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suixingpay.common.core.orm.dao.GenericDao;
import com.suixingpay.common.core.service.AbstractService;
import com.suixingpay.mybatis.core.orm.demo.domain.UserTest;
import com.suixingpay.mybatis.core.orm.demo.mapper.UserTestMapper;
import com.suixingpay.mybatis.core.util.UUIDUtils;

import lombok.extern.slf4j.Slf4j;

/**  
 * TODO
 * @author: liyang[li_yang@suixingpay.com]
 * @date: 2017年10月25日 上午10:09:22
 * @version: V1.0
 * @review: liyang[li_yang@suixingpay.com]/2017年10月25日 上午10:09:22
 */
@Service
@Slf4j
public class UserTestService extends AbstractService<UserTest, String> {
    
    @Autowired
    private UserTestMapper userTestMapper;
    
    @Override
    protected GenericDao<UserTest, String> getDao() {
        return userTestMapper;
    }
    
    public void save(UserTest entity) {
        entity.setUuid(UUIDUtils.getUUID());
        userTestMapper.save(entity);
    }

    public int update(UserTest entity) {
        log.info("更新User id =[{}]",entity.getUuid());
        return userTestMapper.update(entity);
    }

    public void delete(String id) {
        log.info("删除User id =[{}]",id);
        userTestMapper.delete(id);
    }

    public void deleteAll(List<String> id) {
        userTestMapper.deleteAll(id);
    }

    public UserTest findOne(String id) {
        log.info("查询User id =[{}]",id);
        return userTestMapper.findOne(id);
    }

    public List<UserTest> findAll() {
        return userTestMapper.findAll();
    }

    public List<UserTest> findAll(List<String> ids) {
        return userTestMapper.findAll(ids);
    }

    public List<UserTest> find(UserTest entity) {
        return userTestMapper.find(entity);
    }

}
