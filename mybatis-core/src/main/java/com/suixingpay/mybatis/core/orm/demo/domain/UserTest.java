/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017年10月19日 下午5:22:25   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.core.orm.demo.domain;

import com.suixingpay.common.core.orm.domain.Domain;

import lombok.Data;

/**  
 * TODO
 * @author: liyang[li_yang@suixingpay.com]
 * @date: 2017年10月19日 下午5:22:25
 * @version: V1.0
 * @review: liyang[li_yang@suixingpay.com]/2017年10月19日 下午5:22:25
 */
@Data
public class UserTest implements Domain{

    /**   
     * @Fields serialVersionUID: TODO
     */ 
    private static final long serialVersionUID = 1L;
    
    private String uuid;
    
    private String userId;
    
    private String userName;
    
    private String passWord;
    
    private int sex;
    
    private String company;

}
