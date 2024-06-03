package com.yomahub.liteflow.bean.stringtest;

import org.springframework.stereotype.Component;

/**
 * 获取sqlSession
 *
 * @author 86182
 * @version V1.0
 */
@Component
public class SqlContext {
	// @Resource
	// private SqlSessionTemplate sqlSessionTemplate;
	//
	// public SqlSession getSqlSession() {
	// 	SqlSessionFactory sqlSessionFactory = sqlSessionTemplate.getSqlSessionFactory();
	// 	return sqlSessionFactory.openSession();
	// }
	public static void main(String[] args) {
		// int[] arr = new int[]{1, 2, 3};
		int[] arr = new int[3];
		// arr = new int[]{4, 5, 6};
		int[] arr1 = arr;
	}


}



