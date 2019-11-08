package com.lx.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 测试用户对象
 */

@Data
@Entity
public class DbUser {
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private Integer access_level;
	private String description;
}
