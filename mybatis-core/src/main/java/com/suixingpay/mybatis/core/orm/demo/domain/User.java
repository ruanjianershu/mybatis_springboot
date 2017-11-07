/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017-10-31 16:25:47  
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.core.orm.demo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.suixingpay.common.core.orm.domain.Domain;
import com.suixingpay.mybatis.core.orm.demo.po.UserPo;

/**
 * TODO
 *
 * @author liyang[li_yang@suixingpay.com]
 * @date: 2017-10-31 16:25:47
 * @version: V1.0
 * @review: liyang[li_yang@suixingpay.com]/2017-10-31 16:25:47
 */
public class User extends UserPo implements Domain {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * toString()
     * 
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
	 
	
}