package service;

import org.apache.ibatis.session.SqlSession;

import configs.MyBatisUtil;

public class NoSpringTransaction {
	private static SqlSession session=
			MyBatisUtil.openSqlSession();
	public static SqlSession getMybatisSqlSession() {
		System.err.println("�½�����ssf��ɣ�����������"+(session!=null));
		return session;
	}
}
