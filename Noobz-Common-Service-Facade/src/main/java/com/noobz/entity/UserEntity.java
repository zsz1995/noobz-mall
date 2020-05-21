package com.noobz.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author zhousz
 * @date 2020/5/20 10:19
 */
public class UserEntity implements Serializable {

  private String id;

  private String username;

  private String password;

  private String phone;

  private String mail;

  // 营业执照
  private String licencePic;

  private Timestamp registerTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getLicencePic() {
    return licencePic;
  }

  public void setLicencePic(String licencePic) {
    this.licencePic = licencePic;
  }

  public Timestamp getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Timestamp registerTime) {
    this.registerTime = registerTime;
  }

  @Override
  public String toString() {
    return "UserEntity{" +
      "id='" + id + '\'' +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", phone='" + phone + '\'' +
      ", mail='" + mail + '\'' +
      ", licencePic='" + licencePic + '\'' +
      ", registerTime=" + registerTime +
      '}';
  }
}
