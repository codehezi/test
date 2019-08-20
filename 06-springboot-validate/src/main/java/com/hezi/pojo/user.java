package com.hezi.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class user {
  @Min(value=18)  //判断数值最大值
  @Max(value=28)  //判断数值最小值
  private int uage;
  @NotBlank	      //判断不能为空（去首尾空格）
  private String uname;
  @NotEmpty       //判断不能为空（不去首尾空格，空格也算）
  private String upass;
  @Email          //判断email格式是否正确
  private String email;
public int getUage() {
	return uage;
}
public void setUage(int uage) {
	this.uage = uage;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
@Override
public String toString() {
	return "user [uage=" + uage + ", uname=" + uname + ", upass=" + upass + ", email=" + email + "]";
}
}
