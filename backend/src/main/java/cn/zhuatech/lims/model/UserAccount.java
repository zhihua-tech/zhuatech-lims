/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.lims.model;
import jakarta.persistence.*;
@Entity @Table(name="lims_user")
public class UserAccount extends BaseEntity {
    public enum Role { ADMIN, LAB_MANAGER, TECHNICIAN, QUALITY }
    @Column(nullable=false,unique=true,length=32) private String username; @Column(nullable=false) private String password;
    @Column(nullable=false,length=50) private String fullName; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Role role;
    @Column(name="work_center_code",length=32) private String laboratoryCode; @Column(nullable=false) private boolean enabled=true;
    protected UserAccount(){}
    public UserAccount(String username,String password,String fullName,Role role,String laboratoryCode){this.username=username;this.password=password;this.fullName=fullName;this.role=role;this.laboratoryCode=laboratoryCode;}
    public String getUsername(){return username;} public String getPassword(){return password;} public String getFullName(){return fullName;} public Role getRole(){return role;} public String getLaboratoryCode(){return laboratoryCode;} public boolean isEnabled(){return enabled;}
}
