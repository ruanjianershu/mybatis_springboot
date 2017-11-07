/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: liyang[li_yang@suixingpay.com] 
 * @date: 2017-10-31 16:25:47  
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.mybatis.core.orm.demo.po;

import com.suixingpay.mybatis.core.orm.AbstractPo;

/**
 * TODO
 *
 * @author liyang[li_yang@suixingpay.com]
 * @date: 2017-10-31 16:25:47
 * @version: V1.0
 * @review: liyang[li_yang@suixingpay.com]/2017-10-31 16:25:47
 */
public class UserPo extends AbstractPo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID
	 */
	private	String	uuid;
	/**
	 * USER_ID
	 */
	private	String	userId;
	/**
	 * USER_NAME
	 */
	private	String	userName;
	/**
	 * PASS_WORD
	 */
	private	String	passWord;
	/**
	 * SEX
	 */
	private	Integer	sex;
	/**
	 * COMPANY
	 */
	private	String	company;

	/**
     * @param uuid the uuid to set
     */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
     * @return the uuid
     */
	public String getUuid() {
		return uuid;
	}

	/**
     * @param userId the userId to set
     */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
     * @return the userId
     */
	public String getUserId() {
		return userId;
	}

	/**
     * @param userName the userName to set
     */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
     * @return the userName
     */
	public String getUserName() {
		return userName;
	}

	/**
     * @param passWord the passWord to set
     */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
     * @return the passWord
     */
	public String getPassWord() {
		return passWord;
	}

	/**
     * @param sex the sex to set
     */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	/**
     * @return the sex
     */
	public Integer getSex() {
		return sex;
	}

	/**
     * @param company the company to set
     */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
     * @return the company
     */
	public String getCompany() {
		return company;
	}
}