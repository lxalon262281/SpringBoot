package com.lx.jpaTest.entity;


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
@Table(name = "db_user")
public class DbUser {
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private Integer access_level;
	private String description;
}
