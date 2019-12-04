package cn.kgc.vo;

import java.io.Serializable;

public class Student implements Serializable{
  private Long id;
  private String name;
  private Long age;
  private String gender;
  private String telephone;
  private String email;
  private Long classid;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getClassid() {
    return classid;
  }

  public void setClassid(Long classid) {
    this.classid = classid;
  }
}
