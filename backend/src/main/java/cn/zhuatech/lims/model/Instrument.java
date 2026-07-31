/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.lims.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="lims_instrument") public class Instrument extends BaseEntity {
    public enum Status { RUNNING, IDLE, MAINTENANCE, ALARM }
    @Column(nullable=false,unique=true,length=32) private String code; @Column(nullable=false,length=80) private String name; @ManyToOne(optional=false,fetch=FetchType.LAZY) private Laboratory laboratory;
    @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Status status; @Column(nullable=false) private int oee; @Column(nullable=false) private LocalDateTime lastHeartbeat;
    protected Instrument(){} public Instrument(String code,String name,Laboratory laboratory,Status status,int oee){this.code=code;this.name=name;this.laboratory=laboratory;this.status=status;this.oee=oee;this.lastHeartbeat=LocalDateTime.now();}
    public String getCode(){return code;} public String getName(){return name;} public Laboratory getLaboratory(){return laboratory;} public Status getStatus(){return status;} public int getOee(){return oee;} public LocalDateTime getLastHeartbeat(){return lastHeartbeat;}
}
