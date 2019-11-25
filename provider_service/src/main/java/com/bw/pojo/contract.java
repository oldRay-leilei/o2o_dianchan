package com.bw.pojo;

/*合同主表*/

import lombok.Getter;
import lombok.Setter;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;



@Getter
@Setter
@Table(name = "contract")
@Entity
@Data
public class contract {

    @GeneratedValue(strategy = GenerationType.IDENTITY ) //主键自增
    @Id
    private Integer id;
    private String name;
    private Date birthday;
    private String address;
    private  Integer tel;

}
